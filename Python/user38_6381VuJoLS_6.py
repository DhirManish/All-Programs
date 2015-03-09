# template for "Guess the number" mini-project
# input will come from buttons and an input field
# all output for the game will be printed in the console

choice=100
chances=7
import random
import simplegui
secret_number=random.randrange(0,100)
print "Range is from 0 to 100"
print "chances remaining",7
# helper function to start and restart the game
def new_game():
    # initialize global variables used in your code here
    global secret_number,chances
    # remove this when you add your code    
    secret_number=random.randrange(0,choice)
    if choice==100 :
        chances=7
    else :
        chances=10
    print "Range is from 0 to",choice
    print "chances remaining",chances

# define event handlers for control panel
def range100():
    # button that changes the range to [0,100) and starts a new game 
    global secret_number,chances,choice    
    secret_number=random.randrange(0,100)
    chances=7
    choice=100
    new_game()
    
def range1000():
    global secret_number,chances,choice
    # button that changes the range to [0,1000) and starts a new game     
    secret_number=random.randrange(0,1000)
    chances=10
    choice=1000
    new_game()
    
    
def input_guess(guess):
    # main game logic goes here	
    # remove this when you add your code
    guess=int(guess)
    print "Your guess was ",guess
    # print guess<secret_number
    global chances
    if(guess==secret_number):
        print "Correct!!You have won the game with ",(chances-1),"chances remaining"
        new_game()
    elif(guess<secret_number):
        print "Higher"
        chances=chances-1
        print "chances remaining",chances
    else:
        print "Lower"
        chances=chances-1
        print "chances remaining",chances
    if chances<1 :
        print "The given number of attempts is over"
        new_game()

    
# create frame
frame=simplegui.create_frame("Guess the number",300,300)

# register event handlers for control elements and start frame
frame.add_button("Range [0 100)",range100,100)
frame.add_button("Range [0 1000)",range1000,100)
frame.add_button("New game",new_game,100)
frame.add_input("User guess",input_guess,100)

# call new_game 
frame.start()



# always remember to check your completed program against the grading rubric
