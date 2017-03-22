import java.text.NumberFormat;
import java.util.Scanner;
import org.apache.commons.lang.math.IntRange;

public class Bank {

    public static void main(String[] args) {
        Account munozAccount = new Account(250, "Maria", "Munoz", "110 Glades Road", "Mytown", "FL", "33445");

        Scanner input = new Scanner(System.in);
        double data;
        int selection;
        
        NumberFormat money = NumberFormat.getCurrencyInstance();

        System.out.println("Welcome, " + munozAccount.getName() + ".");

        // Convert this part to its own method?
        System.out.println("What would you like to do?\n");
        
        System.out.format("%-10s %22s\n", "1. My Account", "4. Fast Cash");
        System.out.format("%-10s %22s\n", "2. Deposit Funds", "5. PIN Services");
        System.out.format("%-10s %20s\n\n", "3. Withdraw Funds", "6. End Session");
        
		while (!input.hasNextInt() || new IntRange(1,6).containsInteger(input.nextInt())) { 
			input.next();
			} 
		selection = input.nextInt();
        
        System.out.print("Enter deposit amount: ");
        data = input.nextDouble();
        munozAccount.deposit(data);
        System.out.println("Balance is " + money.format(munozAccount.getBalance()));

        System.out.print("Enter withdrawal amount: ");
        data = input.nextDouble();
        munozAccount.withdrawal(data);
        System.out.println("Balance is " + money.format(munozAccount.getBalance()));
        System.out.println("Thanks for banking with WithdrawalSymptoms, the modern American banking software.");
        input.close();
    }
}