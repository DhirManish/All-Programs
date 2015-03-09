public class AndTable{
	public static void main(String[] args){
		boolean and=Boolean.parseBoolean(args[0]);
		boolean or=Boolean.parseBoolean(args[1]);
		if(and==true && or==false){
		System.out.println("boolean value 1 " + "boolean value 2 "+ "result");
				System.out.print("|true              |" + "true           |");
				System.out.println(true && true);
				
				System.out.print("|true              |" + "false          |");
				System.out.println(true && false);
			
				System.out.print("|false             |" + "true           |");
				System.out.println(false && true);
				
				System.out.print("|false             |" + "true           |");
				System.out.println(false && false);
		}
		else {
			System.out.println("boolean value 1 " + "boolean value 2 "+ "result");
				System.out.print("|true              |" + "true           |");
				System.out.println(true || true);
				
				System.out.print("|true              |" + "false          |");
				System.out.println(true || false);
			
				System.out.print("|false             |" + "true           |");
				System.out.println(false || true);
				
				System.out.print("|false             |" + "true           |");
				System.out.println(false || false);
		}
		
			
			
	}
}
