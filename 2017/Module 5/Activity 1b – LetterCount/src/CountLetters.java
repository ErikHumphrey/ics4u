import java.util.Scanner;
public class CountLetters {
    public static void main(String[] args) {
        final int LOW = 'A'; // Smallest possible value
        final int HIGH = 'Z'; // Highest possible value
        int[] letterCounts = new int[HIGH - LOW + 1];
        Scanner input = new Scanner(System.in);
        String phrase;
        char[] phraseLetters;
        int offset; //array index
        /* Prompt user for a phrase */
        System.out.print("Enter a group of words: ");
        phrase = input.nextLine();
        /* Convert phrase to char array and count letter occurrences */
        phrase = phrase.toUpperCase();
        phraseLetters = phrase.toCharArray();
        for (int letter = 0; letter < phraseLetters.length; letter++) {
            offset = phraseLetters[letter] - LOW;
            if (phraseLetters[letter] != ' ' || phraseLetters[letter])
            letterCounts[offset] += 1;
        }
        /* Print letter occurrences */
        for (int i = LOW; i <= HIGH; i++) {
            System.out.println((char) i + ": " + letterCounts[i - LOW]);
        }
    }
}
