#include <iostream>
#include <graphics.h>
using namespace std;

int main(int argc, char **argv){
	int gd=DETECT,gm;
	initgraph(&gd,&gm,NULL);
	rectangle(200,200,400,400);
	delay(50000);
	closegraph();
	return 0;
	}
