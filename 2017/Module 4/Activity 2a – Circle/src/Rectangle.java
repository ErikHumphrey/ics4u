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

    public static void displayAreaFormula() {
        System.out.println("The formula for the area of a rectangle is a = l*w.");
    }

    /**
     * Determines if the object is equal to another Rectangle object.
     * pre: r is a Rectangle object
     * post: true has been returned if the objects have
     * the same areas. False has been returned otherwise
     */

    public boolean equals(Object r) {
        Rectangle testObj = (Rectangle)r;
        if (testObj.getArea() == area) {
            return (true);
        } else {
            return (false);
        }
    }

    /**
     * Returns a String that represents the Circle object.
     * pre: none
     * post: A String representing the Circle object has been returned.
     */

    public String toString() {
        String rectangleString;
        rectangleString = "Rectangle area: " + area;
        return (rectangleString);
    }
}