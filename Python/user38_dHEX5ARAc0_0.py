import simplegui


image=simplegui.load_image("https://commondatastorage.googleapis.com/codeskulptor-assets/gutenburg.jpg")


map_width=1521
map_height=1818

scale=3

can_width=map_width // scale
can_height=map_height // scale

mag_size = 120
mag_pos = [can_width // 2, can_height // 2]

def click(pos):
    global msg_pos
    msg_pos=list(pos)
    
def draw (canvas):
    canvas.draw_image(image,
                      [map_width // 2, map_height // 2],[map_width,map_height],
                      [can_width // 2, can_height // 2],[can_width,can_height])
    map_center=[scale* mag_pos[0],scale* mag_pos[1]]
    map_rectangle=[mag_size,mag_size]
    map_center=mag_pos
    mag_rectangle=[mag_size,mag_size]
    canvas.draw_image(image,map_center,map_rectangle,map_center,map_rectangle)
    
    
frame=simplegui.create_frame("map_magnifier", can_width,can_height)



frame.set_mouseclick_handler(click)
frame.set_draw_handler(draw)

frame.start()
             