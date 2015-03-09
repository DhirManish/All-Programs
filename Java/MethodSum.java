public class MethodSum{
	static void print(Object obj){
	System.out.println(obj);
	}
	static int sum (int a , int b){
		return a+b; 
	}
	public static void main(String[] args){	
		int m=sum(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
		print(m);
		int val=sum(1,1);
		print(val);
	}
}
