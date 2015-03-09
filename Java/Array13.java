public class Array13{
	public static void main(String[] args){

		int a[]=new int[args.length];
		a[0]=1;
		for(int i=0;i<args.length;i++){
				a[i]=Integer.parseInt(args[i]);
				System.out.println(" element at location : "+ i +" is: "+a[i]);
			}
		System.out.println();
	}
}
		
