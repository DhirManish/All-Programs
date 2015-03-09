## CodeSkulptor runs Python programs in your browser.
## Click the upper left button to run this simple demo.
#
## CodeSkulptor runs in Chrome 18+, Firefox 11+, and Safari 6+.
## Some features may work in other browsers, but do not expect
## full functionality.  It does NOT run in Internet Explorer.
#
import simplegui
#
message = "Welcome!"
#
# Handler for mouse click
def click():
    global message
    message = "Good job!"
#
## Handler to draw on canvas
def draw(canvas):
    #canvas.draw_text(message, [100,100], 48, "Red")
    canvas.draw_circle([90 ,200], 100, 20, "white")  
    canvas.draw_circle([210 , 200], 100, 20, "white")  
    canvas.draw_line((90, 200), (210, 200), 10, "Green")
    canvas.draw_line((50, 180), (250, 180), 40, "Red") 
    canvas.draw_line((55, 170), (90, 120), 5, "Red") 
    canvas.draw_line((90, 120), (130, 120), 5, "Red")
    canvas.draw_line((180,108), (180,160) , 140, "Red") 
    
    
## Create a frame and assign callbacks to event handlers
frame = simplegui.create_frame("Home", 300, 300)
frame.add_button("Click me", click)
frame.set_draw_handler(draw)
#
## Start the frame animation
frame.start()



