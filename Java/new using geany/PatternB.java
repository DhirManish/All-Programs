public class PatternB {
	public static void main(String[] args) {
	char ch='A';
	for (int i = 1; i <= 5; i++) {
	char temp=ch++;
		for (int j = 1; j <= 5-i+1; j++) 
		System.out.print(temp++ + " ");
		System.out.println();
		}
	}
}
