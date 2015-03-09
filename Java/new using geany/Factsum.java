import java.util.Scanner;
public class Factsum{
	public static void main(String[] args){
		System.out.print("enter the number: ");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++){
		int fact=1;
		if(n==1){
		fact=1;
		}
		else{
		for(int j=1;j<=i;j++){
		fact=fact*j;
		}
		}
		sum+=fact;
		System.out.println("series upto "+n+" is "+fact);
		}	
		System.out.println("Sum of numbers are "+ sum);	
	}
}
		
	
