class Circle{
	
	float radius;  //member variable
		
	float area(){  //member method
		return Math.PI * radius * radius
	}
	
	float perimeter(){
		return 2 * Math.PI * radius
	}
}

public class Bclass {
	public static void main(String[] args){
	Circle c1=new Circle(); // c1 or any object shows address location of object ,when we print c1
	Circle c2=new Circle();
	Circle c3=new Circle();
	 
	c1.radius=Float.parseFloat(args[0]);
	
	System.out.println("the area of a circle having radius = " + c1.radius + " is " + c1.area());
		
	}
}
