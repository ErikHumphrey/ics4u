public class TestCircle {
    public static void main(String[] args) {
        Circle.displayAreaFormula();
    	
        Circle spotA = new Circle(5);
        System.out.println(spotA.getClass().getName().toUpperCase() + " A"); // Print the name of the class of the object IN UPPERCASE plus a letter
        System.out.println(spotA.toString());
        System.out.println("Circle area: " + spotA.area()); // Print area
        System.out.printf("Circle circumference: %.1f\n\n", spotA.circumference(spotA.getRadius())); // Print circumference rounded to 1 decimal place

        Circle spotB = new Circle(10);
        System.out.println(spotB.getClass().getName().toUpperCase() + " B");
        System.out.println(spotB.toString());
        System.out.println("Circle area: " + spotB.area());
        System.out.printf("Circle circumference: %.1f\n\n", spotB.circumference(spotB.getRadius()));
        
        System.out.println(
        		"Circle A's radius is equal to that of Circle B: "
                + spotA.equals(spotB));
        System.out.println(
        		"Circle A's radius is equal to that of another circle with radius of 5: "
        		+ spotA.equals(new Circle(5)));
    }
}