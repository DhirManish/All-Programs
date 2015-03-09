# Mini-project #6 - Blackjack
#
# 'Introduction to Interactive Programming in Python' Course
# RICE University - coursera.org
# by Joe Warren, John Greiner, Stephen Wong, Scott Rixner
#
# Student: Vladimir Salitrinskij

import simplegui
import random

# load card sprite - 949x392 - source: jfitz.com
CARD_SIZE = (73, 98)
CARD_CENTER = (36.5, 49)
card_images = simplegui.load_image("http://commondatastorage.googleapis.com/codeskulptor-assets/cards.jfitz.png")

CARD_BACK_SIZE = (71, 96)
CARD_BACK_CENTER = (35.5, 48)
card_back = simplegui.load_image("http://commondatastorage.googleapis.com/codeskulptor-assets/card_back.png")    

# initialize some useful global variables
in_play = False
outcome = ""
score = 0
numb_game = 0

# define globals for cards
SUITS = ('C', 'S', 'H', 'D')
RANKS = ('A', '2', '3', '4', '5', '6', '7', '8', '9', 'T', 'J', 'Q', 'K')
VALUES = {'A':1, '2':2, '3':3, '4':4, '5':5, '6':6, '7':7, '8':8, '9':9, 'T':10, 'J':10, 'Q':10, 'K':10}

# define card class
class Card:
    def __init__(self, suit, rank):
        if (suit in SUITS) and (rank in RANKS):
            self.suit = suit
            self.rank = rank
        else:
            self.suit = None
            self.rank = None
            print "Invalid card: ", suit, rank
    
    def __str__(self):
        return self.suit + self.rank
    
    def get_suit(self):
        return self.suit
    
    def get_rank(self):
        return self.rank
    
    def draw(self, canvas, pos):
        card_loc = (CARD_CENTER[0] + CARD_SIZE[0] * RANKS.index(self.rank), 
                    CARD_CENTER[1] + CARD_SIZE[1] * SUITS.index(self.suit))
        canvas.draw_image(card_images, card_loc, CARD_SIZE, [pos[0] + CARD_CENTER[0], pos[1] + CARD_CENTER[1]], CARD_SIZE)

# define hand class
class Hand:
    # create Hand object
    def __init__(self):
        self.cards = []
    
    # return a string representation of a hand
    def __str__(self):
        hand = "Hand contains "
        
        for card in self.cards:
            hand += str(card) + " "
        
        return hand
    
    # add a card object to a hand
    def add_card(self, card):
        self.cards.append(card)
    
    # compute the value of the hand
    def get_value(self):
        hand_value = 0
        aces = False
        
        for card in self.cards:
            hand_value += VALUES[card.get_rank()]
            if card.get_rank() == 'A':
                aces = True
        
        if not aces:
            return hand_value
        else:
            if hand_value + 10 <= 21:
                return hand_value + 10
            else:
                return hand_value
    
    # draw a hand on the canvas
    def draw(self, canvas, pos):
        n_card = 0
        for card in self.cards:
            if pos[1] == 310 and n_card == 0 and in_play == True:
                # draw card back
                canvas.draw_image(card_back, CARD_BACK_CENTER, CARD_BACK_SIZE,
                                  [pos[0] + CARD_BACK_CENTER[0], pos[1] + CARD_BACK_CENTER[1]],
                                  CARD_BACK_SIZE)
            else:
                # draw face card
                card.draw(canvas, [pos[0] + (n_card % 7) * 77, pos[1] + (n_card // 7) * 102])
            n_card += 1

# define deck class 
class Deck:
    # create a Deck object
    def __init__(self):
        self.cards = []
        self.pos_cards = 0
        
        for suit in SUITS:
            for rank in RANKS:
                self.cards.append(Card(suit, rank))
        
    # add cards back to deck and shuffle
    def shuffle(self):
        self.pos_cards = 0
        random.shuffle(self.cards)
        
    # deal a card object from the deck
    def deal_card(self):
        self.pos_cards -= 1
        return self.cards[self.pos_cards]
    
    # return a string representing the deck
    def __str__(self):
        deck = "Deck contains "
        
        for card in self.cards:
            deck += str(card) + " "
        
        return deck

#define event handlers for buttons
def deal():
    global in_play, outcome, score, numb_game, hand_player, hand_dealer
    
    deck.shuffle()
    hand_player.cards = []
    hand_dealer.cards = []
    
    numb_game += 1
    
    hand_player.add_card(deck.deal_card())
    hand_player.add_card(deck.deal_card())
    hand_dealer.add_card(deck.deal_card())
    hand_dealer.add_card(deck.deal_card())
    
    if in_play:
        score -= 1
        outcome = "You lost the round! New round: Hit or stand?"
    else:
        outcome = "Hit or stand?"
    
    in_play = True

def hit():
    global in_play, outcome, score, hand_player
    
    if in_play:
        hand_player.add_card(deck.deal_card())
        if hand_player.get_value() <= 21:
            outcome = "Hit or stand?"
        else:
            outcome = "You have busted! New deal?"
            score -= 1
            in_play = False

def stand():
    global in_play, outcome, score, hand_player, hand_dealer
    
    if in_play:
        in_play = False
        if hand_player.get_value() > 21:
            outcome = "You have busted! New deal?"
            score -= 1
        else:
            while hand_dealer.get_value() < 17:
                hand_dealer.add_card(deck.deal_card())
            
            if hand_dealer.get_value() > 21:
                score += 1
                outcome = "You won! New deal?"
            elif hand_dealer.get_value() >= hand_player.get_value():
                score -= 1
                outcome = "You have busted! New deal?"
            else:
                score += 1
                outcome = "You won! New deal?"

# draw handler    
def draw(canvas):
    # draw title
    canvas.draw_text("Blackjack", [230, 25], 30, "Blue")

    # draw text
    canvas.draw_text("Player", [10, 45], 24, "Black")
    canvas.draw_text("Dealer", [10, 295], 24, "Black")
    canvas.draw_text("Score: " + str(score), [500, 25], 24, "Yellow")
    canvas.draw_text("Game # " + str(numb_game), [500, 45], 21, "White")
    canvas.draw_text(outcome, [90, 575], 24, "White")

    # draw cards
    hand_player.draw(canvas, [10, 60])
    hand_dealer.draw(canvas, [10, 310])

# initialization frame
frame = simplegui.create_frame("Blackjack", 600, 600)
frame.set_canvas_background("Green")

#create buttons and canvas callback
frame.add_button("Deal", deal, 200)
frame.add_button("Hit",  hit, 200)
frame.add_button("Stand", stand, 200)
frame.set_draw_handler(draw)

# initializing game
deck = Deck()
hand_player = Hand()
hand_dealer = Hand()
deal()

# get things rolling
frame.start()
