import java.util.Scanner;
public class Sumodd2{
	public static void main(String[] args){
		System.out.print("enter the number: ");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int i=1;
		int s=1;
		int sum=0;
		while(i<=n){
		if(i!=n)
		System.out.print(s+"+");
		else
		System.out.println(s);
		sum+=s;
		s+=2;
		i++;
		}
		System.out.println("="+sum);
	}
}	
