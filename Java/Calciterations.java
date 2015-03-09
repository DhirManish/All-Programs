public class Calciterations {
		static int iteration(int n){
			System.out.println("hello      " + n);

			if (n<3500){
				n++;			
			iteration(n);
				//System.out.println(n);	
		}
			return n;	
		}
	public static void main(String args[]){
		iteration(1);
	}
}
