package strings;

public class StringFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("===== String formatting =====");
		System.out.println();
		String firstName = "Ajith";
		
		String greetingsTemplate = "Hello, dear %s! Good %s! , %s! , %s whatever poda ";
		
		String morning = "morning";
		String afternoon = "afternoon";
		String evening = "evening";
		String formattedString = String.format(greetingsTemplate, firstName, morning,afternoon,evening);
		System.out.println(formattedString);
		
		System.out.printf("You have %d computers available at store\n", 10);
		
	}

}
