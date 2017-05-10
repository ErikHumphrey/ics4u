import java.util.InputMismatchException;
import java.util.Scanner;

import org.apache.commons.lang3.ArrayUtils;

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
                System.out.println("Please input a positive whole number.");
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
                System.out.println("Please input a positive whole number.");
            }
            input.nextLine();
        } while (badInput);
        badInput = true;

        SeatingPlan class1 = new SeatingPlan(new int[] {rows, columns});
        
        System.out.println("Class1 rows: " + class1.getLayout().length);
        System.out.println("Class1 columns: " + class1.getLayout()[0].length);
        System.out.println("Class1 seats: " + class1.getLayout().length * class1.getLayout()[0].length);

        // Populate array with available seats
        
        
        
        System.out.println("Begin assigning students to seats.");
        for (int i = 0; i < class1.getLayout().length * class1.getLayout()[0].length; i++) {
        		System.out.print("Enter the name of the student to put here. ");
        		String student = input.nextLine();
            	System.out.print("Enter the row you want " + student + " to sit in. ");
            	int row = input.nextInt();
            	System.out.print("Enter the column you want " + student + " to sit in. ");
            	int column = input.nextInt();
            	input.nextLine();
            	class1.setStudent(student, row, column);
            	System.out.println("Seated " + student + " at (" + (row + 1) + ", " + (column + 1) + ").");
            }
        
        //for (int i = 0; i < class1.getLayout().length; i++)
        //    for (int j = 0; j < class1.getLayout()[0].length; i++)
        //        System.out.println(class1.getLayout()[i][j]);
        
        //for (int i = 0; i < (class1.getLayout().length); i++)
        //    for (int j = 0; j < (class1.getLayout()[0].length); i++) {
        //        System.out.println("Enter the name of the next student. (Enter 0 when done)");
        //       class1.getLayout()[i][j] = input.nextLine();
        //    }
        
        input.close();
        class1.displayClass();
    }
}