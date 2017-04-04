/**
 * Models the dice (or a die) in a high or low game
 */
public class Die {
	
	int sides;
	private int roll;
	
    /**
     * constructor
     * pre: none
     * post: Die object created. The die is given a default number of sides.
     */
    public Die() {
        sides = 6; // Default number of sides
    }
    
    /**
     * constructor
     * pre: none
     * post: A Die object created with number of sides 's'
     */
    public Die(int s) {
        sides = s;
    }
    
    /**
     * Rolls the die.
     * pre: none
     * post: A random integer ranging from 1 to the number of sides has been returned.
     */
    public int roll() {
    	roll = (sides) * (int)Math.random() + 1;
    	return (roll);
    }
}
