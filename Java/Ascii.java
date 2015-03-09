import java.util.Scanner;
public class Ascii{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("enter your choise int or char");
				System.out.println("1.parse the character");
						System.out.println("2.parse the integer");
		int n=scan.nextInt();
		System.out.println();
		System.out.println("enter the particular value: ");	
		if(n==1){
		char ch=scan.next().charAt(0);
		System.out.println("ascii value of " + ch +" is " + (int)(ch));
		}
		else{
		int nm=scan.nextInt();
		System.out.println("numeric value of " + nm +" is " + (char)(nm));
		}
		int a=63;
		int b=63;
		int ab=a + b;
		System.out.println((char)(ab));
		System.out.println("total of " + a + " + " + b + " is " + ab);
	}
}
