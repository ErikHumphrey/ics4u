/**
 * Receives integer input and handles exceptions
 */

import java.util.Scanner;
import java.util.InputMismatchException;

public class Interrogator {

    boolean badInput = true;
    private Scanner input = new Scanner(System.in);

    /**
     * constructor
     * pre: none
     * post: Interrogator object created.
     */
    public Interrogator() {
    }

    /**
     * Print a 
     * pre: none
     * post: COMPLETE ME AAAAAAAAAAAAAAAAAAAA
     */
    public int ask(String question) {
    	badInput = true;
        do {
            try {
                System.out.print(question);
                int next = input.nextInt();
                if (next > 0) {
                    badInput = false;
                    return next;
                } else badInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Please input a positive whole number.");
            }
            input.nextLine();
        } while (badInput);

        badInput = true;
        // CHANGE THIS TO CLOSE THE PROGRAM and PRINT THE EXCEPTION
        System.out.println("ERROR OCCURRED. You shouldn't see this message. Error code: 100");
        return 100;
    }

    // SEE IF NECESSARY, IF NOT REMOVE.
    public void skip() {
        input.nextLine();
    }
}