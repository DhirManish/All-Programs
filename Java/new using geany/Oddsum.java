import java.util.Scanner;
public class Oddsum{
	public static void main(String[] args){
		System.out.print("enter the number: ");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int prod=0;
		for(int i=1;i<=2*n-1;i+=2)
		prod=prod+i;
		System.out.println("Sum of numbers are "+prod);	
	}
}
		
	
