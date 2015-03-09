import random
# Rock-paper-scissors-lizard-Spock template


# The key idea of this program is to equate the strings
# "rock", "paper", "scissors", "lizard", "Spock" to numbers
# as follows:
#
# 0 - rock
# 1 - Spock
# 2 - paper
# 3 - lizard
# 4 - scissors

# helper functions

def name_to_number(name):
    
    if name == "rock":
        ret_val = 0
    elif name == "Spock":
        ret_val = 1
    elif name == "paper":
        ret_val = 2
    elif name == "lizard":
        ret_val = 3
    elif name == "scissors":
        ret_val = 4
    else:
        print "This name is not valid!"
        ret_val = 100    
    return ret_val

def number_to_name(number):
    if number == 0:
        ret_val = "rock"
    elif number == 1:
        ret_val = "Spock"
    elif number == 2:
        ret_val = "paper"
    elif number == 3:
        ret_val = "lizard"
    elif number == 4:
        ret_val = "scissors"
    else:
        print "This number is not in valid range, should be betwwen 0 and 4!"
        ret_val = "Wrong number!"    
    return ret_val


def rpsls(player_choice): 
    # delete the follwing pass statement and fill in your code below
    pass
    
    print ""

    print "Player chooses "+ player_choice
    # convert player_choice to player_number using the function name_to_number()
    player_number = name_to_number(player_choice)
    
    # set the computer_number using random.randrange()
    comp_number = random.randrange(0,5)
    
    # convert comp_number to comp_choice using the function number_to_name()
    comp_choice = number_to_name(comp_number)
    
    # print out the message for computer's choice
    print "Computer chooses "+ comp_choice

    # compute difference of comp_number and player_number modulo five
    diff_result = (comp_number - player_number) % 5
    
    # use if/elif/else to determine winner, print winner message
    if (diff_result == 1) or (diff_result == 2):
        print  "Computer wins!"
    elif (diff_result == 3) or (diff_result == 4):
        print "Player wins!"
    else:
        print "Player and computer tie!"
            
# test your code - THESE CALLS MUST BE PRESENT IN YOUR SUBMITTED CODE
rpsls("rock")
rpsls("Spock")
rpsls("paper")
rpsls("lizard")
rpsls("scissors")

# always remember to check your completed program against the grading rubric


