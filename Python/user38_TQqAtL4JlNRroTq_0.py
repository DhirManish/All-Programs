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

import random


def name_to_number(name):
   
    if(name == "rock"):
        return 0
    elif(name == "Spock"):
        return 1
    elif(name == "paper"):
        return 2
    elif(name == "lizard"):
        return 3
    elif(name == "scissors"):
        return 4    
    else:
        return "none"
        



def number_to_name(number):
    
    if(number == 0):
        return "rock"
    elif(number == 1):
        return "Spock"
    elif(number == 2):
        return "paper"
    elif(number == 3):
        return "lizard"
    elif(number == 4):
        return "scissors"    
    else:
        return "none"
    

def rpsls(player_choice): 
    
    print "Player chooses",player_choice
    
    player_number = name_to_number(player_choice)
    
    comp_number=random.randrange(player_number)
    
    comp_choice=number_to_name(comp_number)
    
    print "Computer chooses", comp_choice
    
    difference = comp_number - player_number
    
    modulo = difference % 5
    
    if(modulo == 0 ):
        print "Player and computer tie!"
    
    elif(3 <= modulo <=4 ):
        print "Player wins!"
    
    elif(1 <= modulo <= 2 ):
        print "Computer wins!"
    
    else:
        print "your choice is invalid"
    print
   
    

rpsls("rock")
rpsls("Spock")
rpsls("paper")
rpsls("lizard")
rpsls("scissors")




