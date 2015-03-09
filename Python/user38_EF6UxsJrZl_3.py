# template for "Stopwatch: The Game"
import simplegui

# define global variables
game_time = 0
numbers_of_attempts = 0
correct_attempt = 0
running = False

# define helper function format that converts time
# in tenths of seconds into formatted string A:BC.D
def format(t):
    
    #if time is over 10 min then automatically return 
    if t > 5999:
        return "9:59.9"
    
    #Calculating Minutes     
    A = t / 10	#t/10 to convert to seconds
    A = A / 60  # /60 for # minutes in the total seconds
    
    #10s place of seconds
    B = t / 10   
    B = B % 60 
    B = B / 10 
    
    #1s place of seconds
    C = t / 10 
    C = C % 60 
    C = C % 10 
    
    #10ths place of seconds
    D =  t % 10
    
    #return formatted string of several variables
    return str(A) + ":" + str(B) + str(C) + "." + str(D)
    
# define event handlers for buttons; "Start", "Stop", "Reset"
def start():
    timer.start()
    global running
    running = True
    
def stop():
    timer.stop()
    global running

    if running:
        #update attempts
        global numbers_of_attempts
        numbers_of_attempts += 1
        #print "game time =" + format(game_time) + "last=" format(game_time)[-1]
        #check if a winner and update score
        if format(game_time)[-1] == '0':
            global correct_attempt
            correct_attempt += 1
    #set running to False to avoid just hitting stop while stopped to increase score
    running = False

def reset():
    global game_time
    global attempts
    global correct_attempt
    global running
    
    if timer.is_running():
        timer.stop()    
    game_time = 0   
    running = False
    numbers_of_attempts = 0
    correct = 0
        

# define event handler for timer with 0.1 sec interval
def timer_handler():
    global game_time
    game_time += 1
    
# define draw handler
def draw(canvas):    
    canvas.draw_text(format(game_time),[200, 200], 24, "White")
    canvas.draw_text("Score: "+str(correct_attempt)+"/"+str(numbers_of_attempts), [250,20], 24, "Green")
# create frame
frame = simplegui.create_frame("Stopwatch Game", 400, 400)

# register event handlers
frame.set_draw_handler(draw)
timer = simplegui.create_timer(100, timer_handler)
frame.add_button("Start", start)
frame.add_button("Stop", stop)
frame.add_button("Reset", reset)

# start frame 
frame.start()


# Please remember to review the grading rubric
