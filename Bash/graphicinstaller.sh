#run this script to use "graphics.h" and other some more libraries in your program 

#this script will run the following commands 
sudo apt-get install build-essentials

#1 to download the graph library in your system 

wget http://download.savannah.gnu.org/releases/libgraph/libgraph-1.0.2.tar.gz

#2 this will install other important libraries in your system
sudo apt-get install libsdl-image1.2 libsdl-image1.2-dev guile-1.8 guile-1.8-dev libsdl1.2debian libart-2.0-dev libaudiofile-dev libesd0-dev libdirectfb-dev libdirectfb-extra libfreetype6-dev libxext-dev x11proto-xext-dev libfreetype6 libaa1 libaa1-dev libslang2-dev libasound2 libasound2-dev

#now extraction process executes 
tar -xzf libgraph-1.0.2.tar.gz

#goto extracted file folder
cd libgraph-1.0.2/

#configure the source 
./configure

#command use to read files and change them to exercutable files
sudo make

#command used to make the executable install file
sudo make install

#cpying the libraries to system libraries folder
sudo cp /usr/local/lib/libgraph.* /usr/lib


echo " now try this program for checking whether the graphic libraries are installed or not

#include <iostream>
#include<graphics.h>

int main(int argc, char **argv)
{
	int gd = DETECT,gm,left=100,top=100,right=200,bottom=200,x= 300,y=150,radius=50;
   initgraph(&gd,&gm,NULL);
   line(left - 10, top + 150, left + 410, top + 150);
    delay(5000);
   closegraph();
	return 0;
}

"
