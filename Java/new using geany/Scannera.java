import java.util.Scanner;

public class Scannera{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
			System.out.print("enter the length of string:");
				int l=scan.nextInt();
					for(int j=0;j<l;j++){
						System.out.print("type the string:");
						char ch=scan.next().charAt(j);
					System.out.println(ch);
					System.out.println(ch);
					}
		}
}
