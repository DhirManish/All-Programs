public class Byte1{
	public static void main(String[] args){
		//if(args[0]=="byte"){
			byte a=Byte.parseByte(args[0]);
			byte b=Byte.parseByte(args[1]);
			byte c=(byte)(a+b);	
			System.out.println("sum of " + a + " and " + b + " is " );
	}
}
