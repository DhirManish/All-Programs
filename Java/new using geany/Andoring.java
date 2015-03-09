import java.util.Scanner;
public class Andoring{
	public static void main(String[] args){
		System.out.print("enter the numbers: ");
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		System.out.print("enter the second numbers: ");
		int b=scan.nextInt();
		System.out.println("anding of a and b = " +(a&b));
		System.out.println("oring of a and b = " +(a|b));
		}
} 
		
		
