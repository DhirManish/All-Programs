import java.util.Scanner;
public class Numsum{
	public static void main(String[] args){
		System.out.print("enter the number: ");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int prod=0;
		for(int i=1;i<=n;i++)
		prod=prod+i;
		System.out.println("Sum of "+n+"numbers are "+prod);		
	}
}
		
	
