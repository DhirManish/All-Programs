public class ReturnTypes{
	static void one(Object obj){
		System.out.println(obj);
	}
	
	static int two(Object obj1){
		System.out.println(obj1);
		return 0;
	}
	static float three(Object obj2){
		System.out.println(obj2);
	return 0;
	}
	
	static double four(Object obj3){
		System.out.println(obj3);
	return 0;
	}
	
	public static void main(String[] args){
	one("void");
	two("int");
	three("float");
	four("double");
	
	
	}
}
