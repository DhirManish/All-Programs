public class Arrayloop{
	public static void main(String args[]){
		int size=Integer.parseInt(args[0]);
		int a[][]=new int[size][size];		
		for(int i=1;i<size;i++){
		a[i][i]=i;
		System.out.println("loop with even " + (i+2) + " odd " + (i+1));
		System.out.println();
		}
	}
}
