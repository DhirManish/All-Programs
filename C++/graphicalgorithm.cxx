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

int pixelpoints(int m,int b,int x,int y){
	if(m < 1){
		//y = (m * x) + b;
		x++;
		return x;
	}
	if(m>1){
		//x = (y - b) / m;
		y++;
		return y;
	}
}

int main(int argc, char **argv)
{
	int gd = DETECT, gm, x, i, y, xo = 100, yo = 100, xt = 100, yt = 200, b, max,min,xend;
	float m, dx, dy;
	initgraph(&gd,&gm,NULL);
	if(xo == xo){
		xt++;
	}
	if(xt == yt){
		yt++;
	}
	dx = xt - xo;
	dy = yt - yo;
	m = dy / dx;
	cout<<m;
	b = yo - (m * xo);
	if(dx < 0){
		y = yt;
		x = xt;
		xend=xo;
		cout<<"difference is negitive"<<endl;
		for(i = x; i <= xend; i++){
			if(m < 1){
				cout<<"slope is negitive"<<endl;
				while(x<=xo){
					y = (m * x) + b;
					x++;
					putpixel(x,y,4);
				}
			}
			if(m>1){
				cout<<"slope is positive"<<endl;
				while(y<=yo){
					x = (y - b) / m;
					y++;
					putpixel(x,y,4);
				}
			}
		}
	}
	else {
		y = yo;
		x = xo;
		xend=xt;
		cout<<"difference is positive"<<endl;
		for(i = x; i <= xend; i++){
			if(m < 1){
				cout<<"slope is negitive"<<endl;
				while(x<=xt){
					y = (m * x) + b;
					x++;
					putpixel(x,y,4);
				}
			}
			if(m>1){
				cout<<"slope is positive"<<endl;
				while(y<=yt){
					x = (y - b) / m;
					y++;
					putpixel(x,y,4);
				}
			}
		}
	}
	line(xo,yo,xt,yt);
	delay(5000);
	closegraph();
	return 0;
}

