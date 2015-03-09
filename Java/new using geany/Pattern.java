public class Pattern {
public static void main(String[] args) {
char ch, r, temp = 'A';

for (int i = 1; i <= 5; i++) {
ch = temp;
r = 'A';
for (int j = 5 - (i - 1); j > 0; j--)
System.out.print(ch++ + " ");

for (int k = 1; k <= i - 1; k++)
System.out.print(r++ + " ");

temp++;	
System.out.println();
}
}
}
