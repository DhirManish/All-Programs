import java.util.Scanner;
public class Agechk{
	public static void main(String[] args){
		System.out.print("enter the number: ");
		Scanner scan=new Scanner(System.in);
		int age=scan.nextInt();
		int result=(age>18)?1:0;
		System.out.println(result);
		if(result==1)
		System.out.println("you are eligible for voting");
		else
		System.out.println("you are not eligible for voting");
		}
}
