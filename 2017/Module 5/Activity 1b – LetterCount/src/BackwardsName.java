import java.util.Scanner;
public class BackwardsName {
    @SuppressWarnings("resource")
	public static void main(String[] args) {
        // Prompt user for their name
        System.out.print("Enter your name: ");
        String name = new Scanner(System.in).nextLine();
        // Convert name to char array
        char[] nameLetters = name.toUpperCase().toCharArray();
        // Print array in backwards order
        for (int i = nameLetters.length - 1; i >= 0; i--) {
            System.out.print(nameLetters[i]);
        } 
    }
}