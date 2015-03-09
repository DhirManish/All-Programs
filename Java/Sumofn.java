public class Sumofn{
	public static void main(String[] args){
		int n=Integer.parseInt(args[0]);
		int sum=0;
		while(n>0){
			int r=n%10;
			n=n/10;
		sum+=r;
		}
	System.out.println(sum);
	}
}	
