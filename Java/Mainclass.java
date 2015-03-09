class Ar{
	private float a;
	private float cal_area;
	private float cal_area2;
	
	public Ar(float a){
		this.a=a;
		cal_area=(float)(3.14) * a * a;
		cal_area2 = area();
		System.out.println("area is :" + cal_area);
		System.out.println("second area is :" + cal_area2);
	}
	
	float area(){
		return (float)(3.14) * a * a  * a; 
	}
}
public class Mainclass{
	public static void main(String args[]){
	Ar obj=new Ar(10);
	obj.area();
	}
}
