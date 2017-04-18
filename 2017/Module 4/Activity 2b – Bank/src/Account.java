import java.text.NumberFormat;

public class Account {
    private double balance;
    private String name;
    private String surname;
    private Customer cust;
    private int password;

    /**
     * constructor
     * pre: none
     * post: An account created. Balance and customer data intitialized with parameters.
     */

    public Account(double bal, String fName, String lName, String str, String city, String st, String zip, int pin) {
        balance = bal;
        name = fName;
        surname = lName;
        cust = new Customer(fName, lName, str, city, st, zip);
        password = pin;
    }

    /**
     * Returns the current balance
     * pre: none
     * post: The account balance has been returned.
     */

    public double getBalance() {
        return (balance);
    }

    /**
     * Returns the customer's first name
     * pre: none
     * post: The customer's first name has been returned.
     */

    public String getName() {
        return (name);
    }

    /**
     * Returns the customer's last name
     * pre: none
     * post: The customer's last name has been returned.
     */

    public String getSurname() {
        return (surname);
    }

    /**
     * A deposit is made to the account.
     * pre: none
     * post: The balance has been increased by the amount of the deposit.
     */

    public void deposit(double amt) {
        balance += amt;
    }

    /**
     * A withdrawal is made from the account if there is enough money.
     * pre: none
     * post: The balance has been decreased by the amount withdrawn.
     */

    public void withdraw(double amt) {
        if (amt <= balance) {
            balance -= amt;
        } else {
            System.out.println("Not enough money in account.");
        }

    }

    /**
     * Returns a string that represents the Account object.
     * pre: none
     * post: A string representing the Account object has been returned.
     */

    public String toString() {
        String accountString;
        NumberFormat money = NumberFormat.getCurrencyInstance();

        accountString = cust.toString();
        accountString += "Current balance is " + money.format(balance);
        return (accountString);
    }

    /**
     * Returns the current PIN
     * pre: none
     * post: The current PIN has been returned
     */

    public int getPassword() {
        return password;
    }

    /**
     * Sets a new PIN
     * pre: none
     * post: A new PIN has been set
     */

    public void setPassword(int pin) {
        password = pin;
    }

    /**
     * Changes account address information
     * pre: none
     * post: Account address information has been changed
     */

    public void changeAddress(String str, String c, String st, String z) {
        cust.changeStreet(str);
        cust.changeCity(c);
        cust.changeState(st);
        cust.changeZip(z);
    }
}