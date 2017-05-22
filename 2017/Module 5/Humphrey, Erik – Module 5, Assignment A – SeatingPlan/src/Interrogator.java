import java.util.Arrays;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Interrogator {

    boolean badInput = true;
    private Scanner input = new Scanner(System.in);
	
    public Interrogator() {
    	input = new Scanner(System.in);
    }
    
    public int ask(String question) {
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
        System.out.println("ERROR 100 OCCURRED. You shouldn't see this message; please contact the developer.");
        return 100;
    }
    
    // SEE IF NECESSARY, IF NOT REMOVE.
    public void skip() {
    	input.nextLine();
    }
}
