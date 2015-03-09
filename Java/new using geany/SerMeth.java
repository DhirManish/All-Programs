public class SerMeth{
     public static int pow(int x,int y) {
	if (y==0)
	return 1;
	else 
	return x + pow(x, y);	
	}
	
//public static int evenser(int n){
	//int s=0;
public static void main(String[] args){
	int x=Integer.parseInt(args[0]);
	int y=Integer.parseInt(args[1]);
	System.out.println(x + " raise to power " + y + " is " + pow(x, y));
	}
}
	 
