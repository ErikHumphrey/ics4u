import java.text.NumberFormat;

import java.util.Scanner;
import org.apache.commons.lang.math.IntRange;
import org.apache.commons.lang3.StringUtils;

public class Bank {
    static Account munozAccount = new Account(250, "Maria", "Munoz", "110 Glades Road", "Mytown", "FL", "33445", 5656);

    public static void main(String[] args) {
        System.out.println("Welcome, " + munozAccount.getName() + ".");
        startBanking();
    }

    private static void startBanking() {
        final double FAST_CASH_AMOUNT = 50.00;

        Scanner input = new Scanner(System.in);
        double amount;
        int selection;

        NumberFormat money = NumberFormat.getCurrencyInstance();
        System.out.println("What would you like to do?\n");

        System.out.format("%-10s %22s\n", "1. My Account", "4. Fast Cash");
        System.out.format("%-10s %22s\n", "2. Deposit Funds", "5. PIN Services");
        System.out.format("%-10s %20s\n\n", "3. Withdraw Funds", "6. End Session");

        String nextString = input.next();
        while (!(StringUtils.isNumeric(nextString)) || (!new IntRange(1, 6).containsInteger(Integer.parseInt(nextString)))) {
            nextString = input.next();
        }
        selection = Integer.parseInt(nextString);

        switch (selection) {
            case 1:
                System.out.println("\n" + munozAccount.toString());
                System.out.println("\n1. Edit account information\n2. Back to menu\n");

                nextString = input.next();
                while (!(StringUtils.isNumeric(nextString)) || (!new IntRange(1, 2).containsInteger(Integer.parseInt(nextString)))) {
                    nextString = input.next();
                }
                selection = Integer.parseInt(nextString);

                input.useDelimiter("\\n");

                switch (selection) {
                    case 1:
                        System.out.println("Please enter your street number and street name. (e.g. 11 Wall Street)");
                        input.nextLine();
                        String newStreet = input.nextLine();
                        System.out.println("Please enter your city.");
                        String newCity = input.nextLine();
                        System.out.println("Please enter the ANSI abbreviation for your state. (e.g. NY)");
                        String newState = input.nextLine();
                        System.out.println("Please enter your ZIP code.");
                        String newZip = input.nextLine();

                        System.out.println("\n" + new Account(munozAccount.getBalance(), munozAccount.getName(), munozAccount.getSurname(), newStreet, newCity, newState, newZip, munozAccount.getPassword()));

                        System.out.println("\nDoes this information look correct?\n\n1. Yes\n2. No\n");

                        input.useDelimiter("");

                        nextString = input.next();
                        while (!(StringUtils.isNumeric(nextString)) || (!new IntRange(1, 2).containsInteger(Integer.parseInt(nextString)))) {
                            nextString = input.next();
                        }
                        selection = Integer.parseInt(nextString);

                        switch (selection) {
                            case 1:
                                munozAccount.changeAddress(newStreet, newCity, newState, newZip);
                                System.out.println("\nAccount information changed successfully.\nTo change the name associated with your account, please visit or call your local branch.");
                                break;
                            case 2:
                                break;
                        }

                    case 2:
                        System.out.println();
                        startBanking();
                        break;
                }

                break;
            case 2:
                System.out.print("Enter deposit amount: ");
                amount = input.nextDouble();
                munozAccount.deposit(amount);
                System.out.println("Balance is now" + money.format(munozAccount.getBalance()) + ".");
                break;
            case 3:
                System.out.print("Enter withdrawal amount: ");
                amount = input.nextDouble();
                munozAccount.withdraw(amount);
                System.out.println("Balance is now " + money.format(munozAccount.getBalance()) + ".");
                break;
            case 4:
                System.out.format("Withdrawing $%.2f.\n", FAST_CASH_AMOUNT);
                munozAccount.withdraw(FAST_CASH_AMOUNT);
                System.out.println("Balance is now " + money.format(munozAccount.getBalance()) + ".");
                break;
            case 5:
                // ANECDOTE: java.io.Console has a cool readPassword() method, but it only works
                //           from the console and not the IDE
                int currentPin;

                System.out.println("Please enter your current PIN.");
                while (!input.hasNextInt())
                    input.next();
                currentPin = input.nextInt();
                if (currentPin == munozAccount.getPassword()) {
                    System.out.println("Now enter the new PIN.");
                    nextString = input.next();
                    while (((nextString.length() != 4)) || !(StringUtils.isNumeric(nextString))) {
                        System.out.println("Invalid PIN. Please enter a 4-digit number.");
                        nextString = input.next();
                    }
                    int newPassword = Integer.parseInt(nextString);
                    System.out.println("Confirm by entering the PIN again.");
                    while (!input.hasNextInt())
                        input.next();
                    int confirmPassword = input.nextInt();
                    if (confirmPassword == newPassword) {
                        munozAccount.setPassword(newPassword);
                        System.out.println("PIN saved.");
                    } else
                        System.out.println("New passwords don't match.");
                } else {
                    System.out.println("Incorrect PIN.");
                }
                break;

            case 6:
                break;
        }

        System.out.println("\nAre you finished banking?\n\n1. Yes\n2. No\n");

        while (!(StringUtils.isNumeric(nextString)) || (!new IntRange(1, 2).containsInteger(Integer.parseInt(nextString)))) {
            nextString = input.next();
        }
        selection = Integer.parseInt(nextString);

        switch (selection) {
            case 1:
                System.out.println("\nThanks for banking with WithdrawalSymptoms, the modern American banking software.");
                input.close();
                break;
            case 2:
                System.out.println();
                startBanking();
                break;
        }


    }

}