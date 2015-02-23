#include <iostream>
#include <graphics.h>
using namespace std;

int main(int argc, char **argv){
	int gd=DETECT,gm;
	initgraph(&gd,&gm,NULL);
	line(0,0,200,200);
	line(640,0,400,200);
	line(0,0,640,0);
	rectangle(200,200,400,400);
	circle(300,300,50);
	circle(300,300,40);
	circle(300,300,30);
	circle(300,300,20);
	circle(300,300,10);
	circle(300,300,5);
	circle(300,300,2);
	line(639,639,639,0);
	line(0,480,200,400);	
	line(400,400,639,480);	
	line(0,480,0,0);
	circle(0,480,12);	
	circle(600,0,12);	
	line(0,30,480,479);	
	delay(50000);
	closegraph();
	return 0;
	}
