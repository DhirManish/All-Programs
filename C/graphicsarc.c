/*
 * graphicsarc.c
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


#include <stdio.h>
#include <graphics.h>

int main(int argc, char **argv)
{
	int gd = DETECT,gm;
	initgraph(&gd,&gm,NULL);
	// syntax for arc  void arc(int xc, int yc, int stangle, int endangle, int radius);
	arc(100,100,130,300,50);
	//kb hit is used in case you are using c
	while(!kbhit());
	closegraph();
	return 0;
}

