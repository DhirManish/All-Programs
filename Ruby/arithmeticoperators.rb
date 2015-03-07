#  arithmeticoperators.rb
#  
#  Copyright 2015 manishdhir <manishdhir@manishdhir-HP-d530-SFF-DG058A>
#  
#  This program is free software; you can redistribute it and/or modify
#  it under the terms of the GNU General Public License as published by
#  the Free Software Foundation; either version 2 of the License, or
#  (at your option) any later version.
#  
#  This program is distributed in the hope that it will be useful,
#  but WITHOUT ANY WARRANTY; without even the implied warranty of
#  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
#  GNU General Public License for more details.
#  
#  You should have received a copy of the GNU General Public License
#  along with this program; if not, write to the Free Software
#  Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
#  MA 02110-1301, USA.
#  
#  

print "enter first value: "

value_one = gets.to_i

print "enter second value: "

value_sec = gets.to_i

puts value_one.to_s + " + " + value_sec.to_s + " = " + (value_one + value_sec).to_s
puts value_one.to_s + " - " + value_sec.to_s + " = " + (value_one - value_sec).to_s
puts value_one.to_s + " * " + value_sec.to_s + " = " + (value_one * value_sec).to_s
puts value_one.to_s + " / " + value_sec.to_s + " = " + (value_one / value_sec).to_s
puts value_one.to_s + " % " + value_sec.to_s + " = " + (value_one % value_sec).to_s
