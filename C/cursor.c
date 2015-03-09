/*
 * cursor.c
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

void move_cursor(int);

void move_cursor(int direction)
{
     switch (direction)
     {
          case UP:     cursor_up();
                       break;
          case DOWN:   cursor_down();
                       break;
          case LEFT:   cursor_left();
                       break;
          case RIGHT:  cursor_right();
                       break;
          default:     printf("Logic error on line number %ld!!!\n",
                               __LINE__);
                       break;
     }
}
int main(int argc, char **argv)
{
	move_cursor(1);
	return 0;
}

