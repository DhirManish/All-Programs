/*
 * CodingChalange1.cxx
 * 
 * Copyright 2015 manishdhir <manishdhir@manishdhir-HP-d530-SFF-DG058A>
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


#include <iostream>
using namespace std;
int large(int,int);

int large(int a,int b){
	if(a>b){
		return a;
	}
	else{
		return b;
	}
}
	
int main(int argc, char **argv)
{
	int a,d1,d2,d3,d4;
	cout<<"enter given number:";
	cin>>a;
	d1=a/1000;
	a=a%1000;
	d2=a/100;
	a=a%100;
	d3=a/10;
	d4=a%10;
	int l = large(large(d1,d2),large(d3,d4));
	cout<<"largest value in"<<a<<" is "<<l;
	return 0;
}

