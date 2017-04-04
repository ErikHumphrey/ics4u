/**
 * Models the player in a high or low game
 */
import java.util.stream.IntStream;
import org.apache.commons.lang3.ArrayUtils; // Importing libraries is fun for when writing the code yourself is complex

public class Player {

    private String userName;

    private int call, points, lastRoll, wager; // Put these in order
    
    int[] rolls1, rolls2 = IntStream.rangeClosed(1, 6).toArray();
	int[] rollsSum = IntStream.rangeClosed(2, 12).toArray();
    
    private Die die1, die2;
    

    /**
     * constructor
     * pre: none
     * post: Player object created with default points value. Two die objects are created. 
     */
    public Player() {
    	points = 1000;
    	die1 = new Die();
    	die2 = new Die();
    	
    	
    }
    
    /**
     * constructor
     * pre: none
     * post: Player object created. Two dice are initialized with parameters. 
     */
    public Player(int s1, int s2) {
    	points = 1000;
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
     * Returns player's rolls separately.
     * pre: none
     * post: Player's roll has been returned.
     */
    public String getRoll(int debug) {
    	rolls1 = ArrayUtils.removeElement(rolls1, die1.roll()); // Remove roll from array
    	
    	// Print the arrays 
    	
        return ("Rolled " + die1.roll() + " + " + die2.roll() + " = " + lastRoll
        	+ "\nDie 1 hasn't rolled: "
    	    + "\nDie 2 hasn't rolled:"
    	    + "These sums haven't come up: ");
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
    	// if ((lastRoll > (die1.sides)) && call == 1) {
    	if ((lastRoll < 7 && call == 0 || lastRoll > 7 && call == 1))
    		points += (wager << 1);
    	else
    		points -= wager;
    }
    
    /**
     * Wagers points.
     * pre: none
     * post: Player's wager has been set.
     */
    public void riskPoints(int bet)
    {
    	wager = bet;
    }
}