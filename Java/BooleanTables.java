public class BooleanTables{
	public static void main(String[] args){
		boolean t=Boolean.parseBoolean(args[0]);
		boolean f=Boolean.parseBoolean(args[1]);
		System.out.println("boolean value 1 " + "boolean value 2 "+ "result");
			if(t==true && f==true){
				System.out.print("true              |" + "true           |");
				System.out.println(t&&f);
			}
			else if(t==true && f==false){
				System.out.print("true            |" + "false          |");
				System.out.println(t&&f);
			}
			else if(t==false && f==true){
				System.out.print("false           |" + "true           |");
				System.out.println(t&&f);
			}
			else if(t==false && f==false){
				System.out.print("false           |" + "true           |");
				System.out.println(t&&f);
			}	
			else{
			System.out.println("try or");
			}
	}
}
