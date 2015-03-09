public class PatternOPS{
	public static void main(String[] args){
		StringBuilder Pattern=new StringBuilder(args[0]);
		for(int i=1;i<=5;i++){
			if(i%2==1)
				System.out.println(Pattern);
			else{
				System.out.println(Pattern.reverse());
				Pattern.reverse();
			}
		}	
	}	
}
