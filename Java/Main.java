public class Main{
	static int pai(int f){
	int r=1;
	for(int i=1;i<=f;i++)
	r*=i;
	return r;
	}

	static int per(int a, int b){
	
	int ans=pai(a)/	pai(b)*pai(a-b);
	return ans;
	}
	public static void main(String[] args){
	int h=per(5,1);
	System.out.println(h);
	}
}
