/**
 * Models the player in a high or low game
 */
public class Player {

    private String userName;

    private int call, points, lastRoll, bet; // Put these in order
    
    private Die die1, die2;
    

    /**
     * constructor
     * pre: none
     * post: Player object created. Two die objects are created. 
     */
    public Player() {
    	die1 = new Die();
    	die2 = new Die();
    }
    
    /**
     * constructor
     * pre: none
     * post: Player object created. Two dice are initialized with parameters. 
     */
    public Player(int s1, int s2) {
    	die1 = new Die(s1);
    	die2 = new Die(s2);
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
    public int getRoll() {
        return (lastRoll);
    }
    
    /**
     * Set the player's call.
     * pre: none
     * post: Player's call has been set.
     */
    public void makeCall(int prediction) {
    	call = prediction;
    }
    
    /**
     * Rolls both dice.
     * pre: none
     * post: The last roll has been set to the sum of the dice rolls.
     */
    public void rollDice() {
    	lastRoll = (die1.roll() + die2.roll());
    	if ((lastRoll > (die1.sides)) && call == 1) {
    	
    	}
    }
    
    /**
     * Wagers points.
     * pre: none
     * post: The player's points have been deducted and their wager has been set.
     */
    public void riskPoints(int wager)
    {
    	points -= wager;
    	bet = wager;
    }
}