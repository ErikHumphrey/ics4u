/**
 * Models the player in a game of rock–paper–scissors
 * @Author Erik Humphrey
 * @Since 1.0
 */
public class Player {

    private String userName;

    private int playerThrow; //ROCK = 1, PAPER = 2, SCISSORS = 3

    /**
     * constructor
     * pre: none
     * post: Player object created. The player is given a default throw.
     */
    public Player() {
        playerThrow = 1; // Default throw
    }

    /**
     * Sets the player's throw.
     * pre: newThrow is the integer 1, 2, or 3.
     * post: Player's throw has been made.
     */
    public void makeThrow(int newThrow) {
        playerThrow = newThrow;
    }

    /**
     * Returns the player's throw.
     * pre: none
     * post: Player's throw has been returned.
     */
    public int getThrow() {
        return (playerThrow);
    }

    /**
     * Sets the player's name.
     * pre: none
     * post: Player's name has been changed.
     */
    public void setName(String name) {
        userName = name;
    }

    /**
     * Returns the player's name.
     * pre: none
     * post: Player's name has been returned.
     */
    public String getName() {
        return (userName);
    }
}