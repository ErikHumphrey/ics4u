import java.util.Scanner;

public class coolPatterns {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.print("Please enter a character or word: ");
		String userString1 = userInput.next();
		System.out.print("Please enter another character or word: ");
		String userString2 = userInput.next();
		System.out.print("Please enter a number: ");
		int userInt;
		// Not necessary, but requires a number to be entered
		while (!userInput.hasNextInt()) { 
			System.out.print("Please input a whole number: ");
			userInput.next();
			} 
		userInt = userInput.nextInt();
		
		String pattern1 = showPattern(userString1, userInt);
		String pattern2 = showPattern(userString2, userInt);
		String pattern3 = showPattern(userString1, userString2, userInt);
		
		System.out.println("\nHere are your patterns:");
		System.out.println(pattern1);
		System.out.println(pattern2);
		System.out.println(pattern3);
		userInput.close();
		
	}
	
	public static String showPattern(String str1, String str2, int i) {
	
		String output = "";
		;
		for (int n = 0; n < i; n++){
		output += (str1 + str2);
		}
		return(output);
	}
	
	public static String showPattern(String str, int i) {
		
		String output = "";
		;
		for (int n = 0; n < i; n++){
		output += (str);
		}
		return(output);
	}

}
