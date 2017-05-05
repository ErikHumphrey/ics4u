public class CountLetters {
    public static void main(String[] args) {
        final int LOW = 'A'; // Smallest possible value
        final int HIGH = 'Z'; // Highest possible value
        int[] letterCounts = new int[HIGH - LOW + 1];

        // Prompt user for a phrase
        System.out.print("Enter a group of words: ");
        @SuppressWarnings("resource")
        /* Convert phrase to character array and count letter occurrences
         * Replaces characters with a regular expression, removing anything that is not from A-Z */
        char[] phraseLetters = new java.util.Scanner(System.in).nextLine().toUpperCase().replaceAll("[^A-Z]", "").toCharArray();

        int offset;
        for (int letter = 0; letter < phraseLetters.length; letter++, letterCounts[offset] += 1)
        	offset = phraseLetters[letter] - LOW; // Array index
        
        // Print letter occurrences
        for (int i = LOW; i <= HIGH; i++)
            System.out.println((char) i + ": " + letterCounts[i - LOW]);
    }
}
