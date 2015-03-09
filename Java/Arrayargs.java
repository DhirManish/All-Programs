public class Arrayargs{
	public static void main(String[] args){
		int a[]=new int[Integer.parseInt(args[0])];
		for(int i=0;i<a.length;i++){
			a[i]=i;
			System.out.println(a[i]);
		}
	}
}
