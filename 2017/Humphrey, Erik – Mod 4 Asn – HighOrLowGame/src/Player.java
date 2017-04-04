/**
 * Models the player in a high or low game
 */
public class Player {

    private String userName;

    private int playerThrow; //ROCK = 1, PAPER = 2, SCISSORS = 3
    private int points;

    /**
     * constructor
     * pre: none
     * post: Player object created. The player is given a default throw.
     */
    public Player() {
        // playerThrow = 1; // Default throw
    }

    /**
     * Returns the player's points.
     * pre: none
     * post: Player's points have been returned.
     */
    public int getPoints() {
        return (points);
    }
    
    /**
     * Returns the player's roll.
     * pre: none
     * post: Player's roll has been returned.
     */
    public String getRoll() {
        return (userName);
    }
    
    public void makeCall(int call) {
    
    }
    
    public void rollDice() {
    	Die die1 = new Die();
    	Die die2 = new Die();
    }
    
    public void riskPoints(int wager)
    {
    	
    }
}