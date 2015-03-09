public class OpData{
	public static void main(String[] args){
		if(args[0]=="byte"){
			byte a=Byte.parseByte(args[1]);
			byte b=Byte.parseByte(args[2]);
			byte c=a+b;	
			System.out.println("sum of " + a + " and " + b + " is " + c);
		}
		else if(args[0]=="Short"){
			short a=Short.parseShort(args[1]);
			short b=Short.parseShort(args[2]);
			short c=a+b;	
			System.out.println("sum of " + a + " and " + b + " is " + c);
		}
		if(args[0].equals("int")){
			int a=Integer.parseInt(args[1]);
			int b=Integer.parseInt(args[2]);
			int c=a+b;	
			System.out.println("sum of " + a + " and " + b + " is " + c);
		}
		else if(args[0].equals("float")){
			float a=Float.parseFloat(args[1]);
			float b=Float.parseFloat(args[2]);
			float c=a+b;	
			System.out.println("sum of " + a + " and " + b + " is " + c);
		}
		else if(args[0].equals("double")){
			double a=Double.parseDouble(args[1]);
			double b=Double.parseDouble(args[2]);
			double c=a+b;	
			System.out.println("sum of " + a + " and " + b + " is " + c);
		}
		else{
			System.out.println(" no more data types" );
		}
	}
}
