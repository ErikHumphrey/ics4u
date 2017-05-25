import java.util.*;
import java.lang.ArrayIndexOutOfBoundsException;

public class SeatingPlan {

    public int rows = 0, columns = 0;

    private boolean seatInvalid = true, spaceAvailable = true;

    private String[][] layout;

    /**
     * constructor
     * pre: none
     * post: SeatingPlan object created. Array layout initialized with array parameter.
     */
    public SeatingPlan(int[] a) {
        layout = new String[a[1]][a[0]];
    }

    /**
     * Gets the layout
     * pre: none
     * post: The layout array has been returned.
     */
    public String[][] getLayout() {
        return layout;
    }

    /**
     * Prompts the user for the name of a student and the seat to put them in
     * pre: none
     * post: The setStudent method has been called
     */
    public void addStudent() {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        Interrogator ir = new Interrogator();
        spaceAvailable = true;

        System.out.print("Who do you want to add to the seating plan? ");
        String student = input.nextLine();

        if (!student.equals("0")) {
            int row = 0, column = 0;
            do {
                seatInvalid = true;
                column = ir.ask("Enter the column you want " + student + " to sit in. ");
                row = ir.ask("Enter the row you want " + student + " to sit in. ");
                setStudent(student, column - 1, row - 1);
            }
            while (seatInvalid);

            System.out.println("Seated " + student + " at (" + (column) + ", " + (row) + ").");

            // Sets spaceAvailable to false if all seats are filled
            // ArrayList.contains would be better for this but I couldn't get it to work properly
            int seatsFilled = 0;
            for (int i = 0; i < layout.length; i++) {
                for (int j = 0; j < layout[0].length; j++)
                    if (!layout[i][j].equals("EMPTY")) {
                        seatsFilled++;
                    };

                if (seatsFilled == layout.length * layout[0].length) {
                    spaceAvailable = false;
                    System.out.println("All seats filled.");
                }
            }
        } else spaceAvailable = false; // 0 entered
    }

    /**
     * Sets the String element in the layout array to a name if it is a valid position 
     * pre: none
     * post: none
     */
    public void setStudent(String name, int x, int y) {
        try {
            layout[y][x] = name;
            seatInvalid = false;
        } catch (ArrayIndexOutOfBoundsException e) {
            seatInvalid = true;
            System.out.println("(" + (x + 1) + ", " + (y + 1) + ") is not a valid seat.");
        }
    }

    /**
     * Gets name of student at a position in layout array
     * pre: [x][y] inside bounds of layout
     * post: String at a position in array has been returned
     */
    public String getStudent(int x, int y) {
        return layout[y][x];
    }

    /**
     * Prints a visual representation of the class separated by spaces 
     * pre: none
     * post: The layout array has been printed with brackets and spaces between each element
     */
    public void displayClass() {
        System.out.println();
        for (int i = 0; i < layout.length; i++) {
            for (int j = 0; j < layout[0].length; j++)
                System.out.print("[" + layout[i][j] + "] ");
            System.out.println("\n");
        }
    }

    /**
     * Gets whether or not there are still empty seats
     * pre: none
     * post: The seatsEmpty boolean has been returned.
     */
    public boolean getStatus() {
        return spaceAvailable;
    }
}