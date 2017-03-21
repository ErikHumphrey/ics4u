import java.util.Scanner;

public class HeyYou {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.print("Welcome. Please enter your title followed by your name.\nNAME: ");
		String userName = userInput.next();
		if (userName.toLowerCase().startsWith("mr.")) { System.out.print("Hello, sir."); }
		else if (userName.toLowerCase().matches("ms.|mrs.|miss")) { System.out.print("Hello, ma'am."); }
		else { System.out.print("Hello, " + userName + "."); }
		userInput.close(); // Close scanner to save resources
	}
}