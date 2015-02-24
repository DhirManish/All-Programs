/*
 * graphicalgoriothm.cxx
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
int big(int, int);

int big(int a, int b){
	return (a>b)?a:b;
	}

int main(int argc, char **argv)
{
	int gd = DETECT, gm, x, i, y, xo = 100, xt = 100, yo = 250, yt = 250, b, max;
	float m, dx, dy;
	max = big(big(xo,xt),big(yo,yt));
	initgraph(&gd,&gm,NULL);
	if(xo == xt){
	xt++;
	}
	dx = xt - xo;
	dy = yt - yo;
	m = dy / dx;
	b = yo - (m * xo);
	if(dx < 0 ){
		y = yt;
		x = xt;
		for(i = xo; i <= max; i++ ){
			if(m <= 1){
				x++;  
				y = (m * x) + b;
			}
			else {
				y++;
				y = (y - b) / m;
			}
			putpixel(x,y,4);
		}
	}
	else {
		y = yo;
		x = xo;
		for(i = xo; i < max; i++ ){
			if(m <= 1){
				y = (m * x) + b;
				x++;  
			}
			else {
				x = (y - b) / m;
				y++;
			}
			putpixel(x,y,4);
		}
	}
	delay(5000);
	closegraph();
	return 0;
}

