public class Funcomb {
	static int abc(int a){
		int r=0;
		for(int i=1;i<=a;i++)
		r+=i;
		return r; 
	}
	public static void main(String[] args){
		int a=abc(Integer.parseInt(args[0]));
		System.out.println(a);
	}
}
