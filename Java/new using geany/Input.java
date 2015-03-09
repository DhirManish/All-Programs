public class ParsingDataType{
	public static void main(String[] args){
		byte a=Byte.parseByte(args[0]);
			System.out.println(a);
		short b=Short.parseShort(args[1]);
			System.out.println(b);
		int c=Integer.parseInt(args[2]);
			System.out.println(c);
		float d=Float.parseFloat(args[3]);
			System.out.println(d);
		double e=Double.parseDouble(args[4]);
			System.out.println(e);
		boolean f=Boolean.parseBoolean(args[5]);
			System.out.println(f);
	}
}
