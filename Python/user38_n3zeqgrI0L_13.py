import simplegui

store=0
operand=0


def print_val():
    print "store= ",store 
    print "operand= ",operand
    print ""
    
def swap():
    global store,operand
    store ,operand = operand , store
    print_val()
    
def add():
    global store,operand
    store += operand
    print_val()
    
def sub():
    global store,operand
    store -= operand
    print_val()  

def multi():
    global store,operand
    store *= operand
    print_val()
    
def div():
    global store,operand
    store /= operand
    print_val()

def enter(value):
    global operand
    operand = int(value)
    print_val()
    
frame = simplegui.create_frame("calculator",200,300)


frame.add_button("print",print_val,100)
frame.add_button("swap",swap,100)
frame.add_button("add",add,100)
frame.add_button("subtract",sub,100)
frame.add_button("multiply",multi,100)
frame.add_button("division",div,100)
frame.add_input("submit a value",enter,100)



frame.start()