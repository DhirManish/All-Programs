class programminglanguages{
	String name;
	String environment_used_generally;
	String tracebility;
	String level;
	String levelis(){
	return level;	
	} 
}
public class ConceptClasses{
	public static void main(String[] args){
		programminglanguages pl=new programminglanguages();
		pl.name="c";
		pl.environment_used_generally="command line env";
		pl.tracebility="good";
		pl.level="middle level";
		System.out.println("name of programming language is :" + pl.name);
		System.out.println("environment used generally in programming language is :" + pl.environment_used_generally);
		System.out.println("tracebility is :" + pl.tracebility);
		System.out.println("level of language is :" + pl.levelis());
		
	}
}
