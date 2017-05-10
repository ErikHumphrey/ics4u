import java.util.*;

public class SeatingPlan {

    public int rows = 0, columns = 0;

    private String[][] layout;
    
    public SeatingPlan(int[] a) {
        layout = new String[a[0]][a[1]];
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
    }
}