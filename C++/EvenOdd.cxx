/*
 * EvenOdd.cxx
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

int main(int argc, char **argv)
{
	char a[3];
	int j=1;
	cout<<"enter given value:";
	cin>>a;
	char cp;
	cp=a[3];
	cp=int(cp);
	for(int i=0;i<9;i+=2){
		if(a[3] == char(i)){
			cout<<i;
			cout<<"even"<<endl;
		}
		else{
			goto: l
		}
	}
	l;
	for(int j=1;j<=9;j+=2){
		if(a[3]==char(j)){
			cout<<j;
			cout<<"odd";
		}
	}
	return 0;
}

