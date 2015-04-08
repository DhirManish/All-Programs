/*
 * circlepolynomial.cxx
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
#include <math.h>
using namespace std;

int main(int argc, char **argv)
{
	int gd=DETECT,gm;
	int x,y,r,h,k;
	x=1;
	h=100;k=100;
	r=50;
	int xend=r/sqrt(2);
	initgraph(&gd,&gm,NULL);
	//while(x>xend){
	for(x=1;x<xend;x++){
		y=sqrt((r*r)-(x*x));
		putpixel(x+h,y+k,4);
		putpixel(y+h,x+k,4);
		putpixel(-y+h,x+k,4);
		putpixel(-x+h,y+k,4);
		putpixel(-x+h,-y+k,4);
		putpixel(-y+h,-x+k,4);
		putpixel(y+h,-x+k,4);
		putpixel(x+h,-y+k,4);
	}
	delay(5000);
	closegraph();
	return 0;
}

