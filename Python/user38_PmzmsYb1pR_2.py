# CodeSkulptor runs Python programs in your browser.
# Click the upper left button to run this simple demo.
#
# CodeSkulptor runs in Chrome 18+, Firefox 11+, and Safari 6+.
# Some features may work in other browsers, but do not expect
# full functionality.  It does NOT run in Internet Explorer.
#
#import simplegui
#
#message = "Welcome!"
#
# Handler for mouse click
#def click():
#    global message
#    message = "Good job!"
#
# Handler to draw on canvas
#def draw(canvas):
#    canvas.draw_text(message, [50,112], 48, "Red")
#
# Create a frame and assign callbacks to event handlers
#frame = simplegui.create_frame("Home", 300, 200)
#frame.add_button("Click me", click)
#frame.set_draw_handler(draw)
#
# Start the frame animation
#frame.start()
 
import simplegui

message="python is great"

def click():
    global message
    message="hey i have done it"
    message="yipeee"
    
def draw(canvas):
    canvas.draw_text(message, [50,112], 48, "Red")
    
frame=simplegui.create_frame("homee",500,400)
frame.add_button("click click",click)
frame.set_draw_handler(draw)

frame.start()