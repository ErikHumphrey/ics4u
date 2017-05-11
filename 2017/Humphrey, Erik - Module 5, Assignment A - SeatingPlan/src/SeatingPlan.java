import java.util.*;

public class SeatingPlan {

	// TODO: ADD COMMENTS
	// TODO: ADD COMMENTS
	// TODO: ADD COMMENTS
	// TODO: ADD COMMENTS
	// TODO: ADD COMMENTS
	
    public int rows = 0, columns = 0;

    private String[][] layout;
    
    public SeatingPlan(int[] a) {
        layout = new String[a[0]][a[1]];
        System.out.println(Arrays.toString(layout));
    }

    public String[][] getLayout() {
    	return layout;
    }
    
    public void setStudent(String name, int x, int y) {
		layout[x][y] = name;
	} 
    
    public String getStudent(int x, int y) {
		return layout[x][y];
	} 
    
    public void displayClass() {
    	System.out.println(Arrays.deepToString(layout));
    	String row = "";
    	System.out.println(layout[0].length);
    	for (int i = 0; i < layout.length; i++) {
					System.out.println("\nRow is before: "+ row + "\n");
    				row += layout[0][i] + (" yay");
    				System.out.println("\nRow is after: "+ row + "\n");
    				System.out.format(row);
    	}
    }
}