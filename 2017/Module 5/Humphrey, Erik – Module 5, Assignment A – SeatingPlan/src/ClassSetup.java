/**
 * Project: Module 4 Assignment: High or Low Game
 * Author: Erik Humphrey
 * Description: Dice game in which the player wagers points on random outcomes
 * Date: April 7, 2017
 */

/**
 * Client code: User inputs specifications of class to print out a visual representation of the seating plan
 */

public class ClassSetup {

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
                class1.setStudent("EMPTY", i, j);

        System.out.println("Begin assigning students to seats.");
        System.out.println("To stop adding students, enter 0 instead of the next name.\n");

        for (int i = 0; i < class1.getLayout().length * class1.getLayout()[0].length; i++) {
            class1.addStudent();
            class1.displayClass();
        }
    }
}