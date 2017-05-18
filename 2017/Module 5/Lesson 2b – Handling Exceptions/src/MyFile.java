import java.io.*;
import java.util.Scanner;

public class MyFile {
    public static void main(String[] args) {
    	
    	System.out.println("This program will created a file called zzz.txt and ask you whether you want to keep or delete the file.\n");
    	
        File textFile = new File("L:\\mailbox\\Shannon McDougall\\testTextWriteToDropbox.txt");
        
        if (textFile.exists()) {
            System.out.println("File " + textFile.getName() + " already exists.");
            keepOrDelete(textFile);
        } else {
            try {
            	textFile.createNewFile();
            	System.out.println("New file created named " + textFile.getName() + ".");
                keepOrDelete(textFile);
            }
            catch (IOException e) {
            	System.out.println("New file could not be created.");
            	System.out.println("IOException: " + e.getMessage());
            }
        }
    }
    
    protected static void keepOrDelete(File f) {
    	Scanner input = new Scanner(System.in);
    	
    	System.out.print("Would you like to keep or delete the file? ");
    	
    	String choice = "";
    	
    	boolean badInput = true;
    	
    	do {
        	System.out.println("Enter \"keep\" or \"delete\".");
    		choice = input.next();
        	if (choice.toLowerCase().equals("keep") || choice.toLowerCase().equals("delete"))
        		badInput = false;
    	}
    	while (badInput);
    	
    	// Seems to work without throwing an exception even if something deletes the file while the program is running
    	if (choice.toLowerCase().startsWith("delete")) {
    		f.delete();
    		System.out.println(f.getName() + " deleted successfully.");
    	}
    	else if (choice.toLowerCase().startsWith("keep"))
    		System.out.println(f.getName() + " was not deleted.");
    	
    	input.close();
    }
}