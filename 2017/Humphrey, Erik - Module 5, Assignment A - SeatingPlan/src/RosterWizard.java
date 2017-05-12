import java.util.Scanner;

import org.apache.commons.lang3.ArrayUtils;

public class RosterWizard {

	// TODO: ADD COMMENTS
	// TODO: ADD COMMENTS
	// TODO: ADD COMMENTS
	// TODO: ADD COMMENTS
	// TODO: ADD COMMENTS
	
    public static void main(String[] args) {

        int rows = 0, columns = 0;

        Interrogator director = new Interrogator();

        SeatingPlan class1 = new SeatingPlan(new int[] {
        		director.ask("How many rows of seating does your class have? "), 
                director.ask("How many columns of seating does your class have? ")
        		});
        
        System.out.println("Class1 rows: " + class1.getLayout().length);
        System.out.println("Class1 columns: " + class1.getLayout()[0].length);
        System.out.println("Class1 seats: " + class1.getLayout().length * class1.getLayout()[0].length);

        // Populate array with empty seats
        for (int i = 0; i < class1.getLayout().length; i++)
        	for (int j = 0; j < class1.getLayout()[0].length; j++)
        		class1.setStudent("[EMPTY]", i, j);
        
        Scanner input = new Scanner(System.in);;
        
        System.out.println("Begin assigning students to seats.");
        for (int i = 0; i < class1.getLayout().length * class1.getLayout()[0].length; i++) {
        		System.out.print("Enter the name of the student to put here. ");
        		String student = input.nextLine();
            	int row = director.ask("Enter the row you want " + student + " to sit in. ");
            	int column = director.ask("Enter the column you want " + student + " to sit in. ");
            	class1.setStudent(student, row - 1, column - 1);
            	// err on side of caution
            	director.skip(); // Possibly not necessary, but was essential to the code before I refactored it into its own class.
            	System.out.println("Seated " + student + " at (" + (row) + ", " + (column) + ").");
            }
        
        System.out.println("");
        
        
        //for (int i = 0; i < class1.getLayout().length; i++)
        //    for (int j = 0; j < class1.getLayout()[0].length; i++)
        //        System.out.println(class1.getLayout()[i][j]);
        
        //for (int i = 0; i < (class1.getLayout().length); i++)
        //    for (int j = 0; j < (class1.getLayout()[0].length); i++) {
        //        System.out.println("Enter the name of the next student. (Enter 0 when done)");
        //       class1.getLayout()[i][j] = input.nextLine();
        //    }
        
        class1.displayClass();
        input.close();
    }
}