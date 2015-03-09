/*
 * RWCSV.java
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

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.io.BufferedReader;

class CSVR{
	
	CSVR(){
		}	
	
}

public class RWCSV {
	public static void main (String args[]) throws Exception{
		FileWriter fw = new FileWriter(new File("rw.txt"));
		ArrayList<String> words = new ArrayList<>();
		words.add("hello agian agian\n");
		try{			
			BufferedReader br = new BufferedReader(new FileReader("experiment.csv"));
			String s = br.readLine();
			while(s != null){
				words.add(s);
				words.add("\n");
				s = br.readLine();
				fw.append(s);
			}
			System.out.println();			 
			fw.close();
			br.close();
			System.out.println(words);
			CSVR si = new CSVR();
			}
			catch(Exception e) {} 
		}
}
