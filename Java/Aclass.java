class Fruits{
	
	String taste;
	String shape;
	String color;
	float size;
	String name;
	
	boolean isRooten(){
		return false;
	}
	boolean istasty(){
		return false;
	}
	
}
 
public class Aclass {
	public static void main(String[] args){
	Fruits apple= new Fruits();
	
	apple.taste="sweet";
	apple.shape="spherical";
	apple.color="redish";
	apple.size=12.00f;
	apple.name="seb";
	
	System.out.println(apple.size);
	//System.out.println(apple.);
	
	}
}
 
