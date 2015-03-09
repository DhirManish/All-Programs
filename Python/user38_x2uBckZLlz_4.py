# Compute the number of feet corresponding to a number of miles.

###################################################
# Miles to feet conversion formula
# Student should enter statement on the next line.

def miles_to_feet(length):
    length*=5280
    return length

l1=miles_to_feet(2)
print l1

###################################################
# Expected output
# Student should look at the following comments and compare to printed output.

#68640


#Hourse to Seconds conversion formula

def hours_to_seconds(time):
    time=time*60*60
    return time

t1= hours_to_seconds(1)
print t1