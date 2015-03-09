# template for "Guess the number" mini-project
# input will come from buttons and an input field
# all output for the game will be printed in the console
guess_range=100
count=0
secret_number=0
import simplegui
import random

# helper function to start and restart the game
def new_game():
   
    # initialize global variables used in your code here
    global secret_number,guess_range,count
    print " You have started a new game with the range from 0 to",guess_range
    if guess_range==100:
        count=7
    elif guess_range==1000:
        count=10
    print " You have",count,"attempts to guess the right nuber" 
    print ""
    secret_number=random.randrange(0,guess_range)
    

# define event handlers for control panel
def range100():
    # button that changes the range to [0,100) and starts a new game 
    global guess_range
    guess_range=100
    new_game()
   
def range1000():
    # button that changes the range to [0,1000) and starts a new game     
    global guess_range
    guess_range=1000
    new_game()
    
def input_guess(guess):
    # main game logic goes here	
    global count
    if count>1:
        print "Guess was",int(guess)
        count=count-1
        print "You have", count,"attempts to guess the right number"
        if int(guess)<secret_number:
            print "Higher!"
        elif int(guess)>secret_number:
            print "Lower!"
        else:
            print "Correct!"
            print""
            new_game()
        print ""
    elif count==1:
        print "Guess was",int(guess)
        count=count-1
        print "You have",count,"attempts to guess the right number"
        if int(guess)==secret_number:
            print "Correct!"
        else:
            print "You ran out of guesses. The right number was",secret_number
        print""
        new_game()
  
    
# create frame
frame= simplegui.create_frame("Guess the number", 200, 200)

# register event handlers for control elements and start frame
frame.add_button("Range:0-100",range100,200)
frame.add_button("Range:0-1000",range1000,200)
frame.add_input("Input the guess",input_guess,200)

# call new_game 
new_game()
frame.start()

# always remember to check your completed program against the grading rubric
