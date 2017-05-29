import java.util.Scanner;
import java.io.*;
import java.net.URL;

public class Assign {

    public static void main(String[] args) {
        File f = new File("instructions.txt");
        FileReader fr;
        BufferedReader br;
        String text;

        try {
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            while ((text = br.readLine()) != null)
                System.out.println(text);
            br.close();
            fr.close();
        } catch (FileNotFoundException e1) {
            System.out.println("File does not exist or could not be found.");
            System.err.println("FileNotFoundException: " + e1.getMessage());
            Scanner s = new Scanner(System.in);
            System.out.println("\nThe program can download the Assignment from Pastebin for you.");
            System.out.println("Press y to start the download, or enter anything else to close the program.");
            if (s.nextLine().equals("y"))
            	try (Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(f), "UTF-8"))) {
            		   Scanner web = new Scanner(new URL("https://pastebin.com/raw/JeScz3jR").openStream(), "UTF-8");
            		   web.useDelimiter("\\A");
            		   String out = web.next();
            		   web.close();
            		   writer.write(out);
            		   
            		   // Doesn't print new downloaded file, program just ends :(
                       fr = new FileReader(f);
                       br = new BufferedReader(fr);
                       while ((text = br.readLine()) != null)
                           System.out.println(text);
                       br.close();
                       fr.close();
            	}
            	catch (IOException e3) {
            		System.out.println("Problem reading or writing file.");
            		System.err.println("IOException: " + e3.getMessage());
            	}
        } catch (IOException e2) {
            System.out.println("Problem reading file.");
            System.err.println("IOException: " + e2.getMessage());
        }
    }
}