public class Pattern3 {
public static void main(String[] args) {
char last = args[0].charAt(0);

char ch = 'A';

for(int i = 1; i <= last - 64; i++) {
char temp = ch++;
for (int j = 1; j <= last - 64; j++) {
if (temp == last + 1)
temp = 'A';

System.out.print(temp++ + " ");
}

System.out.println();
}
}
}
