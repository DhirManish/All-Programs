#23, 70, 35, 106, 53, 160, 80, 40, 20, 10, 5, 16, 8, 4, 2, 1 


import simplegui

# global state 
result = 1
iteration = 0
max_iterations = 10

# helper functions

def init(start):
    """Initializes n."""
    global n
    n = start
    print "Input is", n
    
def get_next(current):
    """???  even.odd part."""
    global currenta
    currenta = current
    if( current % 2 == 0):
        current = current  / 2
        
    else:
        current = (current * 3) + 1
        
    return current

# timer callback

def update():
    """???  Part of mystery computation."""
    global iteration, result , currenta
    iteration += 1
    # Stop iterating after max_iterations
    if currenta == 160:
        timer.stop()
        print "Output is", result
    else:
        result = get_next(result)

# register event handlers

timer = simplegui.create_timer(1, update)

# start program
init(23)
timer.start()