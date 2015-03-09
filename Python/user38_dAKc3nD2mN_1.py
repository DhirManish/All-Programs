import simplegui
import random

# initialize globals - pos and vel encode vertical info for paddles
WIDTH = 600
HEIGHT = 400       
BALL_RADIUS = 20
PAD_WIDTH = 8
PAD_HEIGHT = 80
HALF_PAD_WIDTH = PAD_WIDTH / 2
HALF_PAD_HEIGHT = PAD_HEIGHT / 2

# helper function that spawns a ball by updating the 
# ball's position vector and velocity vector
# if right is True, the ball's velocity is upper right, else upper left
def ball_init(right):
    global ball_pos, ball_vel # these are vectors stored as lists
    
    ball_pos,ball_vel= [0, 0], [0, 0]
         
    if right == True:
        ball_pos = [WIDTH / 2, HEIGHT / 2]
        ball_vel = [random.randrange(2, 4), -random.randrange(1, 3)]
    if right == False:
        ball_pos = [WIDTH / 2, HEIGHT / 2]
        ball_vel = [-random.randrange(2, 4), -random.randrange(1, 3)]
# define event handlers

def new_game():
    global paddle1_pos, paddle2_pos, paddle1_vel, paddle2_vel  # these are floats
    global score1, score2  # these are ints
    global score1_string, score2_string
    score1_string = "0"
    score2_string = "0"
    
    paddle1_pos = [PAD_WIDTH / 2, HEIGHT / 2]
    paddle2_pos = [WIDTH - PAD_WIDTH / 2, HEIGHT / 2]
    paddle1_vel, paddle2_vel, score1, score2 = 0, 0, 0, 0
    ball_init(True)

# limit keeps the paddle on the screen
def limit():
    global paddle1_pos, paddle2_pos, paddle1_vel, paddle2_vel
   
    # check for paddle 1
    if paddle1_pos[1] < HALF_PAD_HEIGHT:
       paddle1_pos[1] = HALF_PAD_HEIGHT
       paddle1_vel = 0
    elif paddle1_pos[1] > HEIGHT - HALF_PAD_HEIGHT:
       paddle1_pos[1] = HEIGHT - HALF_PAD_HEIGHT
       paddle1_vel = 0
     
    # check for paddle 2    
    if paddle2_pos[1] < HALF_PAD_HEIGHT:
       paddle2_pos[1] = HALF_PAD_HEIGHT
       paddle2_vel = 0
    elif paddle2_pos[1] > HEIGHT - HALF_PAD_HEIGHT:
       paddle2_pos[1] = HEIGHT - HALF_PAD_HEIGHT
       paddle2_vel = 0
    
def draw(c):
    global score1, score2, paddle1_pos, paddle2_pos, ball_pos, ball_vel
    global score1_string, score2_string
    # update paddle's vertical position, keep paddle on the screen
    limit()
    paddle1_pos[1] += paddle1_vel 
    paddle2_pos[1] += paddle2_vel
    
    # draw mid line and gutters
    c.draw_line([WIDTH / 2, 0],[WIDTH / 2, HEIGHT], 1, "White")
    c.draw_line([PAD_WIDTH, 0],[PAD_WIDTH, HEIGHT], 1, "White")
    c.draw_line([WIDTH - PAD_WIDTH, 0],[WIDTH - PAD_WIDTH, HEIGHT], 1, "White")
    
    # draw paddles
    # paddle 1
    pad1top =  [paddle1_pos[0], paddle1_pos[1] - HALF_PAD_HEIGHT]
    pad1bot =  [paddle1_pos[0], paddle1_pos[1] + HALF_PAD_HEIGHT]
    c.draw_line(pad1top, pad1bot, PAD_WIDTH, "White")
    # paddle 2
    pad2top =  [paddle2_pos[0], paddle2_pos[1] - HALF_PAD_HEIGHT]
    pad2bot =  [paddle2_pos[0], paddle2_pos[1] + HALF_PAD_HEIGHT]
    c.draw_line(pad2top, pad2bot, PAD_WIDTH, "White")
     
    # update ball
    ball_pos[0] += ball_vel[0]
    ball_pos[1] += ball_vel[1]
    
    
    # collide and reflect off of left hand side of canvas
    # y directions
    if ball_pos[1] <= BALL_RADIUS:
        ball_vel[1] = - ball_vel[1]
    if ball_pos[1] > (HEIGHT - 1 - BALL_RADIUS):
        ball_vel[1] = - ball_vel[1]
    # x directions
    # paddle1
    if ball_pos[0] <= PAD_WIDTH + BALL_RADIUS:
        if ( pad1top[1] <= ball_pos[1] <= pad1bot[1] ):
            ball_vel[0] = - ball_vel[0] * 1.1
        else:
            ball_init(1)
            score2 += 1
            score2_string = str(score2) 
            
    # paddle2
    if ball_pos[0] >= WIDTH - PAD_WIDTH - BALL_RADIUS:
        if ( pad2top[1] <= ball_pos[1] <= pad2bot[1] ):
            ball_vel[0] = - ball_vel[0] * 1.1
        else:
            ball_init(0)
            score1 += 1
            score1_string = str(score1) 
       
    # draw ball and scores
    c.draw_circle(ball_pos, BALL_RADIUS, 1, "White", "White")
    c.draw_text(score2_string, (450, 50), 36, "White")
    c.draw_text(score1_string, (150, 50), 36, "White")

        
def keydown(key):
    acc = 1
    global paddle1_vel, paddle2_vel
    if key==simplegui.KEY_MAP["s"]:
        paddle1_vel += acc
    if key==simplegui.KEY_MAP["down"]:
        paddle2_vel += acc
   
def keyup(key):
    acc = 1
    global paddle1_vel, paddle2_vel
    if key==simplegui.KEY_MAP["w"]:
        paddle1_vel -= acc
    if key==simplegui.KEY_MAP["up"]:
        paddle2_vel -= acc

def restart():
    new_game()

def exit():
    frame.stop()

# create frame
frame = simplegui.create_frame("Pong", WIDTH, HEIGHT)
frame.set_draw_handler(draw)
frame.set_keydown_handler(keydown)
frame.set_keyup_handler(keyup)
frame.add_button("Restart", restart, 100)
frame.add_button("Exit ",exit,100)

# start frame
frame.start()
new_game()