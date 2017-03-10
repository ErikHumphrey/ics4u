public class TryCircle {
public static void main(String[] args) {
Circle spot = new Circle(5);
System.out.println("Circle radius: " + spot.getRadius());
System.out.println("Circle circumference: " + spot.circumference(spot.getRadius()));
}
}