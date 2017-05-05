import java.util.*;

public class StudentRoster {
    public static void main(String[] args) {
        int students = 0;

        boolean badInput = true;
        Scanner input = new Scanner(System.in);
        do {
            try {
                System.out.println("How many students are in the class?");
                int next = input.nextInt();
                if (next > 0) {
                    students = next;
                    badInput = false;
                } else badInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Please input a positive whole number.");
            }
            input.nextLine();
        } while (badInput);
        badInput = true;

        String[] student = new String[students];

        for (int i = 0; i < student.length; i++) {
            System.out.println("Enter the name of the next student. (" + (student.length - i) + " left)");
            student[i] = input.nextLine();
        }

        input.close();

        System.out.println("------------------\nStudent Roster\n");

        for (int i = 0; i < student.length; i++)
            System.out.println(student[i]);
        
        System.out.println("------------------");
    }
}