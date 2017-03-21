import java.util.Scanner;

public class RaceSegments {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		final String INPUT_MISMATCH_ERROR = "Please input a whole number.";
		
		int segment1; int segment2; int segment3;
		
		// Prompt user to enter a value
		System.out.println("How long is the first segment of the race track?");
		// Continue only when a whole number (integer) from -2,147,483,648 to 2,147,483,647 is inputted
		while (!userInput.hasNextInt()) {
			System.out.println(INPUT_MISMATCH_ERROR);
			userInput.next();
			}
		segment1 = userInput.nextInt();
		System.out.println("How long is the second segment of the race track?");
		while (!userInput.hasNextInt()) {
			System.out.println(INPUT_MISMATCH_ERROR);
			userInput.next();
			}
		segment2 = userInput.nextInt();
		System.out.println("How long is the third segment of the race track?");
		while (!userInput.hasNextInt()) {
			System.out.println(INPUT_MISMATCH_ERROR);
			userInput.next();
			}
		segment3 = userInput.nextInt();
		userInput.close();
		
		// Find sum of track segments and print the result
		String trackLength = segment1 + segment2 + segment3 + " kilometres";
		System.out.println("The total distance of the race is " + trackLength + ".");
	}
}