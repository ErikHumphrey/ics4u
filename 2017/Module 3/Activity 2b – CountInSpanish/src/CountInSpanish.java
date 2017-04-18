public class CountInSpanish {

    public static void main(String[] args) {
        for (int i = 0; i <= 9; i++) System.out.println(toSpanish(i));
    }

    private static String toSpanish(int i) {
        String[] spanish = {"uno","dos","tres","cuatro","cinco","seis","siete","ocho","nueve","diez"};
        return spanish[i];
    }
}