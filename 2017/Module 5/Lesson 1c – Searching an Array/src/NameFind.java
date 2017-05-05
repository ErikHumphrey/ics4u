import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Searches an array for a name
 */

public class NameFind {

    public static void main(String[] args) {
        int location;
        String name = null;

        int people = 0;

        Scanner input = new Scanner(System.in);

        // Code reused from Activity 1 - StudentRoster
        boolean badInput = true;
        do {
            try {
                System.out.println("How many names are on your list?");
                int next = input.nextInt();
                if (next > 0) {
                    people = next;
                    badInput = false;
                } else badInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Please input a positive whole number.");
            }
            input.nextLine();
        } while (badInput);
        badInput = true;

        String[] nameArray = new String[people];

        for (int i = 0; i < nameArray.length; i++) {
            System.out.println("Enter the next name. (" + (nameArray.length - i) + " left)");
            nameArray[i] = input.nextLine();
        }

        // Prints array in one line. Uncomment for debugging.
        System.out.println(Arrays.toString(nameArray));

        // Prompt user for anumber to search for 
        System.out.print("Enter a name to search for: ");
        name = input.nextLine();

        // Search for number and notify user of location
        location = Search.linear(nameArray, name);
        if (location == -1)
            System.out.println("Name not found in array.");
        else
            System.out.println(name + " was first found at element " + location);

        input.close();
    }

}