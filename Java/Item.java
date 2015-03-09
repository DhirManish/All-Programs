class A{
	private int a;
	private int b;
	private int sum;
	
	public A(int a, int b){
		//a=10;
		//b=20;
		this.a=a;
		this.b=b;
		sum = a + b;
		System.out.println("sum of " + a +" and "+ b + " is " + sum);
}	
} 	
public class Item{
	public static void main(String args[]){
	A a=new A(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
	}
}
 
