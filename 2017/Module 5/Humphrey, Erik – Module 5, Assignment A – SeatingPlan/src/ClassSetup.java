/**
 * @Project > Module 5 Assignment A: Seating Plan
 * @Author > Erik Humphrey
 * @Description > Console program that allows the user to create a custom classroom, assign students to seats, and print the layout of the seating plan
 * @Completed > May 24, 2017
 */

/**
 * Client code: User inputs specifications of class to print out a visual representation of the seating plan
 */

public class ClassSetup {

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
                class1.setStudent("EMPTY", j, i);

        System.out.println("Begin assigning students to seats.");
        System.out.println("To stop adding students, enter 0 instead of the next name.\n");

        // It is a lot easier to enter students if the layout is printed every time.
        // It stops when there are no more EMPTY seats, allowing the user to make changes at virtually any time.
        
        while (class1.getStatus()) {
        	class1.addStudent();
            class1.displayClass();
        }
        
        System.out.println("Seating plan complete.");
    }
}