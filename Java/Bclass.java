class Circle{
	
	double radius;  //member variable
		
	double area(){  //member method
		return Math.PI * radius * radius;
	}
	
	double perimeter(){
		return 2 * Math.PI * radius;
	}
}

public class Bclass {
	public static void main(String[] args){
	Circle c1=new Circle(); // c1 or any object shows address location of object ,when we print c1
	Circle c2=new Circle();
	Circle c3=new Circle();
	 
	c1.radius=Float.parseFloat(args[0]);
	c2.radius=Float.parseFloat(args[1]);
	c3.radius=Float.parseFloat(args[2]);
	
	System.out.println("the area of a circle having radius = " + c1.radius + " is " + c1.area());
	System.out.println("the area of a circle having radius = " + c2.radius + " is " + c2.area());
	System.out.println("the area of a circle having radius = " + c2.radius + " is " + c2.area());
	
	System.out.println("the address of location of object c1 of circle is = " + c1);
		
	}
}
