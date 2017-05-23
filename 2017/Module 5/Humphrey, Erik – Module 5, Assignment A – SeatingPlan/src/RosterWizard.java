import java.util.Scanner;

import org.apache.commons.lang3.ArrayUtils;

public class RosterWizard {

    // TODO: ADD COMMENTS
    // TODO: ADD COMMENTS
    // TODO: ADD COMMENTS
    // TODO: ADD COMMENTS
    // TODO: ADD COMMENTS

    public static void main(String[] args) {

        Interrogator ir = new Interrogator();

        SeatingPlan class1 = new SeatingPlan(new int[] {
            ir.ask("How many rows of seating does your class have? "),
                ir.ask("How many columns of seating does your class have? ")
        });

        System.out.println("\nYour class has " +
            class1.getLayout().length + " rows and " +
            class1.getLayout()[0].length + " columns (" +
            class1.getLayout().length * class1.getLayout()[0].length + " seats total).");

        // Populate array with empty seats
        for (int i = 0; i < class1.getLayout().length; i++)
            for (int j = 0; j < class1.getLayout()[0].length; j++)
                class1.setStudent("[EMPTY]", i, j);

        Scanner input = new Scanner(System.in);;

        System.out.println("Begin assigning students to seats.");
        System.out.println("To stop adding students, enter 0 instead of the next name.\n");

        for (int i = 0; i < class1.getLayout().length * class1.getLayout()[0].length; i++) {
            System.out.print("Who do you want to add to the seating plan? ");
            String student = input.nextLine();
            if (student.equals("0"))
                break;
            else {
                int row = ir.ask("Enter the row you want " + student + " to sit in. ");
                int column = ir.ask("Enter the column you want " + student + " to sit in. ");
                class1.setStudent(student, row - 1, column - 1);
                ir.skip(); // Possibly not necessary, but was essential before so it exists to err on the side of caution
                System.out.println("Seated " + student + " at (" + (row) + ", " + (column) + ").");
            }
        }

        class1.displayClass();
        input.close();
    }
}