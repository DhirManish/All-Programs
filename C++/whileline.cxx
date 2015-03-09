/*
 * whileline.cxx
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
using  namespace std;

int main(int argc, char **argv)
{
	int gd=DETECT,gm;
	int x,y,x1=100,y1=200,xn=250,yn=300,b,m;
	initgraph(&gd,&gm,NULL);
	m=(yn-y1)/(xn-x1);
		b=y1-(m*x1);
		x=x1;
		y=y1;
	while((x<xn)||(y<=yn))
	{      if(m<1)
	{
	x=x+1;
	y=((m*x)+b);
	putpixel(x,y,GREEN);
	  }
	if(m>1)
	{
	y=y+1;
	x=(y-b)/m;
	putpixel(x,y,RED);
	}
	 }
	 delay(5000);
	closegraph();
	return 0;
}

