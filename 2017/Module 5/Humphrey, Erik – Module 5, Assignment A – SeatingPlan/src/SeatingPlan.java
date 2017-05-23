import java.util.*;
import java.lang.ArrayIndexOutOfBoundsException;

public class SeatingPlan {

	// TODO: ADD COMMENTS
	// TODO: ADD COMMENTS
	// TODO: ADD COMMENTS
	// TODO: ADD COMMENTS
	// TODO: ADD COMMENTS
	
    public int rows = 0, columns = 0;
    
    private boolean seatInvalid = true;

    private String[][] layout;
    
    public SeatingPlan(int[] a) {
        layout = new String[a[0]][a[1]];
    }

    public String[][] getLayout() {
    	return layout;
    }
    
    public void addStudent() {
        Scanner input = new Scanner(System.in);
        Interrogator ir = new Interrogator();

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
                ir.skip(); // Possibly not necessary, but was essential before so it exists to err on the side of caution
                System.out.println("Seated " + student + " at (" + (column) + ", " + (row) + ").");
                
                
                //do {
            	for (int i = 0; i < layout.length; i++) {
            		for (int j = 0; j < layout[0].length; j++)
            			if (!layout[i][j].equals("EMPTY")){
            				
            				break;
            			};
            	//}
            	// while 
            }
            }
        }
    
    public void setStudent(String name, int x, int y) {
        try {
        	layout[x][y] = name;
        	seatInvalid = false;
        }
        catch (ArrayIndexOutOfBoundsException e) {
                seatInvalid = true;
        		System.out.println("(" + (x + 1) + ", " + (y + 1) + ") is not a valid seat.");
            }
	} 
    
    public String getStudent(int x, int y) {
		return layout[x][y];
	} 
    
    public void displayClass() {
		System.out.println();
    	for (int i = 0; i < layout.length; i++) {
    		for (int j = 0; j < layout[0].length; j++)
    			System.out.print("[" + layout[i][j] + "] ");
    			System.out.println("\n");
    	}
    }
}