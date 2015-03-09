public class Funfact{
	static void print(Object obj){
	System.out.println(obj);
	}
	static int fact(int a){
			int r=1;
			for(int i=1;i<=a;i++)
			r*=i;
			return r;
		}
		public static void main(String[] args){
			int f=fact(5);
			print(f);
	}
}

		
