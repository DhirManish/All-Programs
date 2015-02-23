/*
 * graphicalfloodfill.cxx
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
	int gd = DETECT, gm;
	initgraph(&gd, &gm, NULL);
	setcolor(4);
	//void ellipse(int xc, int yc, int stangle, int endangle, int rx, int ry);
	ellipse(200,300,0,360,100,30);
	floodfill(200,300,BLUE);
	//trianle
	setcolor(1);
	line(190,50,150,150);
	setcolor(3);
	line(190,50,240,150);
	setcolor(5);
	line(150,150,240,150);
	//circle 
	setcolor(3);
	circle(193,120,28);
	floodfill(193,120,GREEN);
	//circle
	setcolor(2);
	circle(195,195,30);
	floodfill(190,190,RED);
	delay(3000);
	closegraph();
	return 0;
}

