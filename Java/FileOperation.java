/*
 * FileOperation.java
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
import java.io.*;
import java.util.regex.*;

public class FileOperation {		
	public static void main (String args[]) {
		FileInputStream f1;
		int s;
		try{
			f1 = new FileInputStream("experiment.csv"); 
			int len = f1.available();
			s = len / 2;
			int i = 1;
			char c = ' ';
			while(i <= s){
				s = f1.read();
				String str1[]={s};
				Pattern pat = Pattern.compile(" ");
				Matcher mat = pat.matcher(str1);
				String s1 = mat.replaceAll(" ,");
				
				System.out.print((char)s);
			}
		}
		catch(IOException ie){
			System.out.println(ie);
			System.exit(-1);
		}
	}
}
