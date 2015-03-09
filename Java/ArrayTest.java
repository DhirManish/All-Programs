/*
 * ArrayTest.java
 * 
 * Copyright 2014 manishdhir <manishdhir@manishdhir-HP-d530-SFF-DG058A>
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


/*Write your code here*/
import java.util.Scanner;
public class ArrayTest{
  public static boolean prime(int n){
    for (int i = 2; i < n; i++) {
			if (n % i == 0)
				return true;
		}
    return false;
  }
  
  public static void main(String[] args){
   Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int[] n = new int[a];
    for(int i=0; i<n.length; i++){
      n[i] = scan.nextInt();
      if(n[i]==0)
        break;
      if(prime(n[i])){
        System.out.println(n[i]);
 	 }
    }
  }
}
