

import simplegui

# global state 

# helper functions

def init(start):
    """Initializes cuurenta."""
    
    global currenta
    
    currenta = start
    
    print currenta
    
    if( currenta % 2 == 0):
        currenta = currenta  / 2
    
    else:
        currenta = (currenta * 3) + 1
          
    return currenta
        

# timer callback

def update():
    """???  Part of mystery computation."""
    global iteration, result , currenta
    # Stop iterating after value reaching 1
    if currenta == 1:
        timer.stop()
        print currenta
    else:
        result = init(currenta)

# register event handlers

timer = simplegui.create_timer(1, update)

# start program
init(23)
timer.start()