public class Power {
static int power(int x, int y) {
int result = 1;

for (int i = 1; i <= y; i++)
result *= x; //result = result * x;

return result;
}

public static void main(String[] args) {
int x = Integer.parseInt(args[0]);
int y = Integer.parseInt(args[1]);

System.out.println(x + " raise to power " + y + " is " + power(x, y));
}
}
