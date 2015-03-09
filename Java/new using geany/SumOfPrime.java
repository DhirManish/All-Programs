public class SumOfPrime{
     public static void main(String[] args){
	int n=Integer.parseInt(args[0]);
	for (int i = 2; i < n; i++) {
	int s=n % i;
	int sum=0;
	//sum+=s;
	System.out.println("SUM IS  " + s);
	}
     }
}

