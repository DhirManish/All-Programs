class Circle{
	double radius=12.00;
	
	double area(){
		return Math.PI*radius*radius;
	}
	double Perimeter(){
		return 2 * Math.PI * radius;
	}
}
public class CalCircle{
	public static void main(String[] args){
		Circle c1=new Circle();
		Circle c2=new Circle();
		Circle c3=new Circle();
		
		System.out.println("area of circle1 :" + c1.area());
		System.out.println("area of circle2 :" + c2.area());
		System.out.println("area of circle3 :" + c3.area());
		
		System.out.println("perimeter of circle1 :" + c1.Perimeter());
		System.out.println("perimeter of circle2 :" + c2.Perimeter());
		System.out.println("perimeter of circle3 :" + c3.Perimeter());
	}
}
