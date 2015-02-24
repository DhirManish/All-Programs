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
int small(int, int);
int pixelpoints(int,int,int,int);

int big(int a, int b){
	return (a>b)?a:b;
	}
int small(int j, int k){
	return (j<k)?j:k;
}
int pixelpoints(int m,int b,int x,int y){
	if(m <= 1){
		y = (m * x) + b;
		x++;
		return x;
	}
	else{
		x = (y - b) / m;
		y++;
		return y;
	}
}

int main(int argc, char **argv)
{
	int gd = DETECT, gm, x, i, y, xo = 50, xt = 100, yo = 100, yt = 200, b, max,min;
	float m, dx, dy;
	max = big(big(xo,xt),big(yo,yt));
	min = small(small(xo,xt),small(yo,yt));
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
		cout<<"difference is negitive"<<endl;
		for(i = min; i <= max; i++){
			y = pixelpoints(m,b,x,y);
			putpixel(x,y,4);
		}
	}
	else {
		y = yo;
		x = xo;
		cout<<"difference is positive"<<endl;
		for(i = min; i <= max; i++){
			y = pixelpoints(m,b,x,y);
			putpixel(x,y,4);
		}
	}
	delay(5000);
	closegraph();
	return 0;
}

