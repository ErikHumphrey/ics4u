public class Customer {
    private String firstName, lastName, street, city, state, zip;

    /**
     * constructor
     * pre: none
     * post: A customer object has been created.
     * Customer data has been initalized whith parameters
     */

    public Customer(String fName, String lName, String str, String c, String s, String z) {
        firstName = fName;
        lastName = lName;
        street = str;
        city = c;
        state = s;
        zip = z;
    }

    /**
     * Returns a string that represents the Customer object
     * pre: none
     * post: A string representing the Account object has been returned.
     */

    public String toString() {
        String custString;

        custString = firstName + " " + lastName + "\n";
        custString += street + "\n";
        custString += city + ", " + state + " " + zip + "\n";
        return (custString);
    }

    /**
     * Changes customer street
     * pre: none
     * post: Account address information has been changed
     */

    public void changeStreet(String str) {
        street = str;
    }

    /**
     * Changes customer city
     * pre: none
     * post: Account address information has been changed
     */

    public void changeCity(String c) {
        city = c;
    }

    /**
     * Changes customer state
     * pre: none
     * post: Account address information has been changed
     */

    public void changeState(String s) {
        state = s;
    }

    /**
     * Changes customer ZIP
     * pre: none
     * post: Account address information has been changed
     */

    public void changeZip(String z) {
        zip = z;
    }
}