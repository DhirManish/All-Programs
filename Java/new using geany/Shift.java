import java.util.Scanner;
public class Shift{
	public static void main(String[] args){
		System.out.print("enter the numbers: ");
		Scanner scan=new Scanner(System.in);
		int l=scan.nextInt();
		int a=1;
		for(int i=0;i<=l;i++)
		System.out.println(a<<i);
		}
}
