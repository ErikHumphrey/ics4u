import java.util.Scanner;
public class BackwardsName {
    public static void main(String[] args) {
        final int LOW = 'A'; //smallest possible value
        final int HIGH = 'Z'; //highest possible value
        int[] letterCounts = new int[HIGH - LOW + 1];
        Scanner input = new Scanner(System.in);
        String name;
        char[] nameLetters;
        int offset; //array index
        /* Prompt user for their name: */
        System.out.print("Enter your name: ");
        name = input.nextLine();
        /* convert word to char array and count letter occurrences */
        name = word.toUpperCase();
        wordLetters = word.toCharArray();
        for (int letter = 0; letter < wordLetters.length; letter++) {
            offset = wordLetters[letter] - LOW;
            letterCounts[offset] += 1;
        }
        /* show letter occurrences */
        for (int i = LOW; i <= HIGH; i++) {
            System.out.println((char) i + ": " + letterCounts[i -
                LOW]);
        }

        // aaaa
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(char[i]);
        }
    }
}
