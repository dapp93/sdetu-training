package files;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	public static String arr[];
	public static void main(String[] args) throws Exception {
		
		String fiveFour="kkkkaaaaa";
		String condition="[a]{5}|[k]{1}";
		int size=0;
		regTest(condition,fiveFour,size);
	System.out.println(size);
		
		
		
	}
	
	public static int regTest(String regexThing, String toCheck, int size){
		Pattern pattern= Pattern.compile(regexThing);
		Matcher regexMatcher= pattern.matcher(toCheck);
		
		int i=0;
		
		while(regexMatcher.find()){
			i++;
			System.out.println(regexMatcher.group());
			if(regexMatcher.group().length()!=0){
				System.out.println(regexMatcher.group().length());
				
				
				
			}
			
			
		}
		
		return i++;
		
	}
	// work on return try maybe a increment and returning that at the end!
	//stacks
	
}