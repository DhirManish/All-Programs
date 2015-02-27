/*
 * rectangleAlgo.cxx
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
#include <graphics.h>
using namespace std;

int main(int argc, char **argv)
{
	int gd=DETECT,gm,x,y,x2,y2,l,b,xl,yb; 	
	l = 160;
	b = 140;
	x = 150;
	y = 100;
	xl = x + l;
	yb = y + b;
	cout<<x<<y<<endl;
	x2 = x;
	y2 = y;
	initgraph(&gd,&gm,NULL);
	for(y=100;y<=yb;y++){
		putpixel(x,y,4);
		putpixel(x+l, y, 4);
	}
	for(x2=150;x2<xl;x2++){ 
		putpixel(x2,y2,4);
		putpixel(x2,y2+b,4);
	}
	delay(5000);
	closegraph();
	return 0;
}

