def is_leap_year(year):
  if(year%400)==0:
     return True
  elif(year%100)==0:
     return False
  else:
     return False
 
year=2000
leap_year=is_leap_year(year)
if leap_year:
     print year ,"is leap year"
else:
     print year ,"is leap not  year"
 

 

