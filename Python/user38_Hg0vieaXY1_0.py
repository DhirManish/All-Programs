global a
global b

def fibonacci(a,b):
    l=list([0],[1])
    for i in range (1,40):
        c=a+b
        a=b
        b=c
        l.append(c)
    return c



print fibonacci(0,1)

