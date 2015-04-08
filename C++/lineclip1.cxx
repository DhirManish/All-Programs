/*
 * lineclip1.cxx
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

#include<iostream>
using namespace std;
# include<graphics.h>
int main(){
int gd=DETECT,gm;
initgraph(&gd,&gm,NULL);
int xl,xh,yl,yh,bit1,bit2,x1,y1,x2,y2,b3,b4,b1,b2,d,e;
float m;
xl=200;
yl=400;
xh=400;
yh=250;
rectangle(xl,yl,xh,yh);
x1=100;
y1=100;
x2=450;
y2=300;
line(x1,y1,x2,y2);
//for 1st end-point
if(x1<xl && y1>yl)
bit1=5;
else--------
if(x1<xl && y1>yh && y1<yl)
bit1=1;
else
if(x1<xl && y1<yh)
bit1=9;
else
if(x1>xl && x1<xh && y1<yh)
bit1=8;
else
if(x1>xh && y1<yh)
bit1=10;
else
if(x1>xh && y1>yh && y1<yl)
bit1=2;
else
if(x1>xh && y1>yl)
bit1=6;
else
if(x1<xh && x1>xl && y1>yl)
bit1=4;
else
{bit1=0;}
//for 2nd end point
if(x2<xl && y2>yl)
bit2=5;
else
if(x2<xl && y2>yh && y2<yl)
bit2=1;
else
if(x2<xl && y2<yh)
bit2=9;
else
if(x2>xl && x2<xh && y2<yh)
bit2=8;
else
if(x2>xh && y2<yh)
bit2=10;
else
if(x2>xh && y2>yh && y2<yl)
bit2=2;
else
if(x2>xh && y2>yl)
bit2=6;
else
if(x2<xh && x2>xl && y2>yl)
bit2=4;
else
{bit2=0;}

m=(float)(y2-y1)/(x2-x1);
 b1=m*(xl-x1)+y1;
b2=m*(xh-x1)+y1;
 d=yh-y1;
 e=yl-y1;
 b3=x1+(d/m);
 b4=x1+(e/m);
if(bit1!=0 || bit2!=0)
{setcolor(4);
 if(b1<=yl && b1>=yh && b2<=yl && b2 >=yh)
  line(xl,b1,xh,b2);
else
 if(b1<=yl && b1>=yh && b3<=xh && b3 >=xl)
  line(xl,b1,b3,yh);
else
 if(b1<=yl && b1>=yh && b4<=xh && b4 >=xl)
  line(xl,b1,b4,yl);
else
 if(b2<=yl && b2>=yh && b3<=xh && b3>=xl)
  line(xh,b2,b3,yh);
else
 if(b2<=yl && b2>=yh && b4<=xh && b4 >=xl)
  line(xh,b2,b4,yl);
else
 if( b3<=xh && b3>=xl && b4<=xh && b4>=xl)
  line(b3,yh,b4,yl);
}
else
{cout<<"line lies inside the window";  }
delay(5000);
closegraph();
return 0;

}
