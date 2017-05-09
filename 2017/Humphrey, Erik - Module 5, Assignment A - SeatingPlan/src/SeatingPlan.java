import java.util.*;

public class SeatingPlan {

    public int rows = 0, columns = 0;

    public SeatingPlan(int[] a) {
        rows = a[0];
        columns = a[1];
    }

    String[][] layout = new String[rows][columns];

    System.out.println("Begin assigning students to seats.");
    //
    for (int i = 0; i < layout.length; i++)
        for (int j = 0; j < layout[0].length; i++) {
            System.out.println("Enter the name of the next student. (Enter 0 when done)");
            layout[i][j] = input.nextLine();
        }

    input.close();

    System.out.println("------------------\nStudent Roster\n");

    for (int i = 0; i < layout.length; i++)
        for (int j = 0;

		j < layout[0].length; i++)
            System.out.println(layout[i][j]);

    System.out.println("loic");
    
    public void addStudent() {
		// TODO Auto-generated method stub
		
	} 
}
}