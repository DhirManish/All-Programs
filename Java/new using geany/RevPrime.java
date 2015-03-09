import java.util.ArrayList;
import java.util.Collections;

public class RevPrime {
public static void main(String[] args) {
ArrayList list = new ArrayList();

for (int i = 2; i <= 100; i++) {
if (PrimeChecker.isPrime(i)) {
int n = PalindromeNumber.reverse(i);
if (PrimeChecker.isPrime(n))
//System.out.print(n + " ");
list.add(n);
}
}

Collections.sort(list);
System.out.println(list);
}
} 

