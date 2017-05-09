import java.util.InputMismatchException;
import java.util.Scanner;


public class myClass {

    public static void main(String[] args) {

        int rows = 0, columns = 0;

        boolean badInput = true;
        Scanner input = new Scanner(System.in);
        do {
            try {
                System.out.print("How many rows of seating does your class have? ");
                int next = input.nextInt();
                if (next > 0) {
                    rows = next;
                    badInput = false;
                } else badInput = true;
            } catch (InputMismatchException e) {
                System.out.println("\nPlease input a positive whole number.");
            }
            input.nextLine();
        } while (badInput);
        badInput = true;

        do {
            try {
                System.out.print("How many columns of seating does your class have? ");
                int next = input.nextInt();
                if (next > 0) {
                    columns = next;
                    badInput = false;
                } else badInput = true;
            } catch (InputMismatchException e) {
                System.out.println("\nPlease input a positive whole number.");
            }
            input.nextLine();
        } while (badInput);
        badInput = true;

        SeatingPlan class1 = new SeatingPlan(new int[] {
            rows,
            columns
        });
        class1.addStudent();

        
        
        input.close();
        System.out.println(class1);
    }

}