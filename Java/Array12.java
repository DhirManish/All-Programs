public class Array12{
	public static void main(String[] args){

		int a[]={1,2,3,4,5,6,7,8,9,10};
		int n=9;
		for(int i=0;i<a.length;i++){
		 int s=n-i;
			System.out.println("before swap the value is: " + a[i] );
			System.out.println("after swap the value is: " + a[s] );
			System.out.println();
		}
	}
}
		
