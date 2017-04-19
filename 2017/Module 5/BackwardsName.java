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
        name = "Erik Humphrey";
        /* convert name to char array and count letter occurrences */
        name = name.toUpperCase();
        nameLetters = name.toCharArray();
        /* for (int letter = 0; letter < nameLetters.length; letter++) {
            offset = nameLetters[letter] - LOW;
            letterCounts[offset] += 1;
        } */
        /* show letter occurrences */
       
        for (int i = nameLetters.length - 1; i >= 0; i--) {
            System.out.print(nameLetters[i]);
        } 
    }
}
