public class Circle {
    private static final double PI = 3.14;
    private double radius;
    
    /**
     * constructor
     * pre: none
     * post: A Circle object created with radius r
     */

    public Circle(double r) {
        radius = r;
    }

    /**
     * Calculates the area of the circle.
     * pre: none
     * post: The area of the circle has been returned
     */

    public double area() {
        double circleArea;
        circleArea = PI * radius * radius;
        return (circleArea);
    }

    /**
     * Returns the radius of the circle
     * pre: none
     * post: The radius of the circle has been returned
     */

    public double getRadius() {
        return (radius);
    }
    
    /**
     * Returns the circumference of the circle
     * pre: none
     * post: The circumference of the circle has been returned
     */
    
    public double circumference(double radius) {
        double circumference = 2 * (PI) * radius;
        return (circumference);
    }

    /**
     * Displays the formula for the area of a circle
     * pre: none
     * post: The formula for area of a circle
     * has been displayed
     */
    public static void displayAreaFormula() {
        System.out.println(
        		"The formula for the area of a circle is a = pi*r*r.\n");
    }

    /**
     * Determines if the object is equal to another Circle object.
     * pre: c is a Circle object
     * post: true has been returned if the objects have
     * the same radii. False has been returned otherwise
     */

    public boolean equals(Object c) {
        Circle testObj = (Circle)c;
        if (testObj.getRadius() == radius) {
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
        String circleString;
        circleString = "Circle radius: " + radius;
        return (circleString);
    }
}