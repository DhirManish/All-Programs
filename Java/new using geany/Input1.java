import java.util.Scanner;
public class Input1{
	public static void main(String[] args){
		
		Scanner scan=new Scanner(System.in);
			System.out.print("enter the length of string:");
				int l=scan.nextInt();
				System.out.print("type the string:");
					for(int j=0;j<l;j++){
						char ch=scan.next().charAt(0);
					System.out.println(ch);
		}
	}
}	
		
	
	
