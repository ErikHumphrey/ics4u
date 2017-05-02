public class Search {
    /**
     * Returns the index of the element numToFind in array.
     * -1 returned if element not found.
     * pre: none
     * post: index of numToFind has been returned. -1 has been returned if element not found.
     */

    public static int linear(int[] array, int numToFind) {
        int index = 0;

        while ((array[index] != numToFind) && (index < array.length - 1))
            index += 1;

        if (array[index] == numToFind)
            return index;
        else
            return -1;
    }
    
    public static int linear(String[] array, String phraseToFind) {
    	int index = 0;
    	
    	while (!(array[index].equals(phraseToFind)) && (index < array.length - 1))
    		index++;
    	
    	if (array[index].equals(phraseToFind))
    		return index;
    	else
    		return -1;
    }
}