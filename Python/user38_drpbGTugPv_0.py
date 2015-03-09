

a = range(5)

def mutate(a):
    a[3] = 100

mutate(a)
print a[3]

a = range(5)

def mutate(b):
    a[3] = 100

mutate(a)
print a[3]

a = range(5)

def mutate(b):
    b[3] = 100

mutate(a)
print a[3]


position = [50, 50]
print position
delta = [1, -2]
print delta
position = position + delta
print position


a = ["green", "blue", "white", "black"]
b = a
c = list(a)
d = c
a[3] = "red"
c[2] = a[1]
b = a[1 : 3]
b[1] = c[2]

print a,b,c,d