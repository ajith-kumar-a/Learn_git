package misc;

public class Refactor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printToConsole();

	}

	private static void printToConsole() {
		printToConsol();
	}

	private static void printToConsol() {
		int i = 10;
		System.out.println("Some code that are not aligned");
		int sum = 10 + 5;
		System.out.println(sum);
		System.out.println(sum);
	}

}
