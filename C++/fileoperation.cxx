/*
 * fileoperation.cxx
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
#include<string>
#include<fstream>
using namespace std;
void printMessage(void);
int times;

int main(int argc, char **argv)
{
	ofstream file;
	char c;	
	times = 0;
	do
	{
		cout<<"enter the value ";
		cin>>c;
	if(c == 's')
		cout<<"input stopped\n";
	else
		printMessage();	
	}while(c != 's');
	file.open("newsql.R", ios::trunc | ios::binary);
	file << "hello world"<<endl;
	file << argv <<endl;
	
	file.close();
	return 0;
}
void printMessage (void)
{
	times++;
	cout<<"number  of times function called "<<times<<"\n"<<endl;
	//cout<<"you entered "<<s<<"\n";
}

