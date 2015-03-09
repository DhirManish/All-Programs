# template for "Guess the number" mini-project
# input will come from buttons and an input field
# all output for the game will be printed in the console
import simplegui
import random
import math

# initialize global variables used in your code here
num_range = 100
secret_number = 0
guesses = 7

# helper function to start and restart the game
def new_game():
    
    # remove this when you add your code    
    global secret_number
    global guesses
    secret_number = random.randrange(0, num_range)
    print "New Game started with secret number in the range [0,", num_range, ")"
    if(num_range == 100):
        guesses = 7
    else:
        guesses = 10
    print "Number of remaining guesses is ", guesses
    


# define event handlers for control panel
def range100():
    # button that changes the range to [0,100) and starts a new game 
    global num_range
    num_range = 100
    global guesses
    guesses = 7 
    new_game()
    

def range1000():
    # button that changes the range to [0,1000) and starts a new game     
    global num_range
    num_range = 1000
    global guesses
    guesses = 10
    new_game()
    
def input_guess(guess):
    # main game logic goes here	
    global guesses
    guesses = guesses - 1
    # remove this when you add your code
    guess_int = int(guess)
    print "Guess was ", guess_int
    if (guesses == 0):
        if (guess_int == secret_number):
            print "Correct!"
        else:
            print "You Lose!"
        new_game()
        return 
    print "Number of remaining guesses is ", guesses
    if (guess_int == secret_number):
        print "Correct!"
        new_game()
    elif (guess_int < secret_number):
        print "Higher!"
    else:
        print "Lower!"
    
# create frame
f = simplegui.create_frame("Guess the number", 200, 200)

# register event handlers for control elements and start frame
f.add_button("Range is [0,100)", range100, 200)
f.add_button("Range is [0,1000)", range1000, 200)
f.add_input ("Enter a guess", input_guess, 200)

# call new_game 
new_game()


# always remember to check your completed program against the grading rubric
f.start()