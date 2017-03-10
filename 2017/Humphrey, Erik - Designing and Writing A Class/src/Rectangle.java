public class Rectangle {
	
    private double length, width, perimeter, area;
    
	// TODO: CHECK ALL THESE COMMENTS
    /**
     * constructor
     * pre: none
     * post: A Circle object created. Length and width initialized to 2 and 1 respectively.
     */
	public Rectangle() {
		length = 2;
		width = 1;
	}
	
    /**
     * Calculates the length, width, and perimeter of the rectangle
     * pre: none
     * post: Length and width have been changed
     */
    public Rectangle(double l, double w) {
    	length = l;
    	width = w;
    	area = l * w;
    	perimeter = (l + w) * 2;
    }
    
    public double getLength() {
    	return (length);
    }
    
    public double getWidth() {
    	return (width);
    }
    
    public double getPerimeter() {
    	return (perimeter);
    }
   
    public double getArea() {
    	return (area);
    }
    
}
