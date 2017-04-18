/**
 * Models the player in a high or low game
 */
import java.util.Arrays;
import java.util.stream.IntStream;
import org.apache.commons.lang3.ArrayUtils; // Using libraries for when the code to do something extra would be unnecessarily complex

public class Player {

    private int call, lastRoll, middleNumber, points, wager;

    int[] rollsSum;

    private Die die1, die2;

    /**
     * constructor
     * pre: none
     * post: Player object created with default points value. Two die objects are created. Middle number and debug array given initial values.
     */
    public Player() {
        points = 1000;
        die1 = new Die();
        die2 = new Die();

        middleNumber = 7; // Number to be neither high nor low
        rollsSum = IntStream.rangeClosed(2, 12).toArray();
    }

    /**
     * constructor
     * pre: none
     * post: Player object created. Two dice are initialized with parameters. Middle number and debug array given initial values based on number of sides.
     */
    public Player(int s1, int s2) {
        points = 1000;
        die1 = new Die(s1);
        die2 = new Die(s2);

        /* The middle number always causes the wager to be lost.
         * The middle number is always equal to the half the sum of number of sides minus 1
         * E.g., with the default six-sided die, (6 + 6) / 2 + 1 = 7. */

        middleNumber = (die1.sides + die2.sides) / 2 + 1;
        rollsSum = IntStream.rangeClosed(2, die1.sides + die2.sides).toArray();
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
     * Wagers points.
     * pre: none
     * post: Player's wager has been set.
     */
    public void riskPoints(int bet) {
        wager = bet;
    }

    /**
     * Rolls both dice.
     * pre: none
     * post: The last roll has been set to the sum of the dice rolls. Points increased by double wager if player call correct; else wager is lost.
     */
    public void rollDice() {
        lastRoll = (die1.roll() + die2.roll());

        // See the overloaded Player() method above for how middleNumber is determined

        if (((die1.sides + die2.sides) & 1) == 0) // Boolean that uses the bitwise AND operator to check if the sum is even. Easier than using modulo.
            if ((lastRoll < middleNumber && call == 0 || lastRoll > middleNumber && call == 1))
                points += (wager << 1);
            else points -= wager;
        /* With two different dice where the sum of the sides is an odd number, the decimal is rounded down to have an integer.
         * Example: a 5-sided die and an 8-sided die, 13 / 2 + 1 = 7.5 --> Integer is 7, but middle numbers are 7 and 8
         * This statement uses two middle numbers instead of one. */
        else
        if (((lastRoll < middleNumber || lastRoll < middleNumber++) && call == 0 || (lastRoll > middleNumber || (lastRoll < middleNumber++) && call == 1)))
            points += (wager << 1);
        else points -= wager;
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
     * For debugging. Returns player's rolls separately.
     * pre: none
     * post: Printed rolls and sum of rolls. Sum of player's roll removed from the array of unrolled numbers.
     */
    public String getRoll(int debug) {
        int roll1 = die1.roll();
        int roll2 = die2.roll();
        lastRoll = roll1 + roll2;
        rollsSum = ArrayUtils.removeElement(rollsSum, lastRoll);

        return "Rolled " + roll1 + " + " + roll2 + " = " + lastRoll; // Print the addition operation to get the sum
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
     * For debugging. Returns numbers that haven't been rolled (only with debug wager).
     * pre: rollsSum != null
     * post: Array of unrolled numbers has been returned.
     */
    public String getMissing() {
        if (rollsSum.length > 0)
            return ("These sums haven't come up: " + Arrays.toString(rollsSum));
        else
            return ("All possible values have been rolled!");
    }
}