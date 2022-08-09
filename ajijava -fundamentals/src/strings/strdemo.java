package strings;
import java.util.Arrays;
public class strdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("===== String methods =====");
		System.out.println();
		
		String s = " Ajith ";
		System.out.println("s.length(): " + s.length());					
		System.out.println("s.contains(): " + s.contains(" "));		
		System.out.println("s.isEmpty: " + s.isEmpty());					
		System.out.println("s.toUpperCase(): " + s.toUpperCase());			
		System.out.println("s.startsWith(\"h\"): " + s.startsWith("h"));	
		System.out.println("s.endsWith(\" \"): "+ s.endsWith(" "));			
		System.out.println("s.replace(\"ll\", \"LL\"): " + s.replace("ll", "LL"));
	
		
		System.out.println("s.trim(): " + s.trim());						
		
		System.out.println("s.strip(): " + s.strip());						
		
		System.out.println("s.substring(0, 3): " + s.substring(0, 3));		
		
		System.out.println("Arrays.toString(s.getBytes()): " 
						+ Arrays.toString(s.getBytes()));
		
		System.out.println("Arrays.toString(s.toCharArray()): " 
						+ Arrays.toString(s.toCharArray()));	
		
		System.out.println("s.charAt(1): " + s.charAt(1));				
		
		System.out.println("Arrays.toString(s.split(\"e\")): " 
						+ Arrays.toString(s.split("i")));					
		
		System.out.println(s);		
		
		
	}

}
