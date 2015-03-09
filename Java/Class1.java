/*
 * Class1.java
 * 
 * Copyright 2014 manishdhir <manishdhir@manishdhir-HP-d530-SFF-DG058A>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */

import java.util.Scanner;

class A{
	int a;
	int b;
	
	public A(int a,int b){
		this.a = a;
		this.b = b;
		System.out.println("a is " + a + " " + "\nb is " + b);
		System.out.println("a + b is = " + (a+b));
	}
} 
		

public class Class1 {
	
	public static void main (String args[]) {
	System.out.println("Values entered using constuctor call(argument passing)");
	new A(2,3);	//constructor call without using declaring variable object
	System.out.println("values entered using arguments input from prompt before running");
	new A(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
	Scanner scan = new Scanner(System.in);
	System.out.println("enter the values ");
	int x = scan.nextInt();
	int y = scan.nextInt();
	System.out.println("values entered using Scanner class after running");
	new A(x,y);
	}
}

