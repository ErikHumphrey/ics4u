public class TryCircle {
public static void main(String[] args) {
Circle spot = new Circle();
spot.setRadius(3);
System.out.println("Circle radius: " + spot.getRadius());
System.out.println("Circle circumference: " + spot.circumference(spot.getRadius()));
}
}