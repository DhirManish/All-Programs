public class NewRec{
	static int power(int x){
		return x * power(x);
	}
	static int recursion(int x, int y) {
		if(y == 1)
			return x;
		else
			return x * power(x);
}
	public static void main(String[] args){
		System.out.println(recursion(2,1));
		}
}
	
