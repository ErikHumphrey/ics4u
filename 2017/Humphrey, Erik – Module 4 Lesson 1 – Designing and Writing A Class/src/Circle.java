public class Circle {
    private static final double PI = 3.14;
    private double radius;
    /**
     * constructor
     * pre: none
     * post: A Circle object created. Radius initialized to 1.
     */
    public Circle() {
        radius = 1; //default radius
    }
    /**
     * Calculates the radius of the circle
     * pre: none
     * post: Radius has been changed
     */
    
    public Circle(double r) {
    	radius = r;
    }
    public void setRadius(double newRadius) {
        radius = newRadius;
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
    public double circumference(double radius) {
    	double circumference = 2 * (PI) * radius;
    	return (circumference);
    }
    
    /**
     * constructor
     * pre: none
     * post: A Circle object created with radius r
     */
 
    }