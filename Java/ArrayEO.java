public class ArrayEO{
	public static void main(String[] args){
		int a[]=new int[100];
		for(int i=0;i<a.length;i++){
			a[i]=(int)(Math.random());
			int evencount=0;
			int oddcount=0;
			for(int item : a)
			System.out.println(item + " ");
			if( item % 2 == 0){
				evencount++;
			}
			else{
				oddcount++;
			}
		System.out.println("even" + evencount + "odd" + oddcount);
	}
	}
}
