/*
 * DDAgorithm.cxx
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

int big(int a, int b){
	return (a>b)?a:b;
	}
int small(int j, int k){
	return (j<k)?j:k;
}

int main(int argc, char **argv)
{
	int gd = DETECT, gm, xo = 50, xt = 100, yo = 150, yt = 250, yk, xk, xkp, ykp;
	if(xo == xt){xt++;}
	if(yo == yt){yt++;}
	int min = small(small(xo,xt),small(yo,yt));
	int max = big(big(xo,xt),big(yo,yt));
	float dx = xt - xo;
	float dy = yt - yo;
	float m = dy / dx;
	cout<<m;
	initgraph(&gd, &gm, NULL);
	for(int i = min; i <= max; i++){
		if(m <= 1){
			cout<<"working 1";
			xk = xt;
			yk = yt;
			yk = yk - (int)m;
			xk = xk + (1 / m);
		}
		else{
			cout<<"working 2";
			xk = xo;
			yk = yo;
			yk = yk + m;
			xk = xk + dx;
			//xk = xk - (1 / (int)m);
		}
		putpixel(xk,yk,4);
	}
	line(50,100,150,250);
	delay(5000);
	closegraph();
	return 0;
}
