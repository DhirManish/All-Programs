
import java.util.Scanner;

public class CodingChallenge {
	
	public static void main (String args[]) {
		String s = args[0];
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int blockone = m / 2;
		int blocktwo = m / 3;
		int blockthree = m / 4;
		int output = blockone + blocktwo + blockthree;
		System.out.println(s);
		System.out.println(output);
	}
}

