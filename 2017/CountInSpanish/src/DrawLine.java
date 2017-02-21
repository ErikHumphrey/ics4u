public class DrawLine {
    public static void drawLine(int length) {
        for (int i = 1; i <= length; i++) {
            System.out.print("*\n");
        }
        System.out.println();
    }
    public static void drawLine(int length, String mark) {
        for (int i = 1; i <= length; i++) {
            System.out.print(mark);
        }
    }
    public static void main(String[] args) {
        drawLine(10);
        drawLine(5, "0\n");
    }
}