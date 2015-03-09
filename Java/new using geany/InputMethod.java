import java.util.Scanner;
public class InputMethod{
	public static void main(String[] args){
		int a=Integer.parseInt(args[0]);
		System.out.print("enter the number: ");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		System.out.println("number entered are: ");	
		System.out.println("argument method "+a);
		System.out.println("Scanner method "+n);	
	}
}
		
	
