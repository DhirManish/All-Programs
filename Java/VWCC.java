public class VWCC{
	public static void main(String args[]){
		//String se=args[0];
		for(int i=0;i<=255;i++){
			System.out.printf("%4c",(char)(i));
			System.out.print("=");
			System.out.printf("%3d",(int)(i));
			if(i=='a' || i=='A')
			System.out.println();
		}
	System.out.println();
	}
}
