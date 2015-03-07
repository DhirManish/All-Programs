//1 1 2 6 24 . . . . .

public class Series2{
     public static void main(String[] args){
	int n=Integer.parseInt(args[0]);
	for (int i = 1; i <=n; i++) {
	int f = 1;
	for (int j = 1; j <= i; j++)
	f *= j;
	int s=f/i;	
	System.out.println(s);
	}
     }
}

