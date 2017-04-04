/**
 * Project: Module 4 Assignment: High or Low Game
 * Author: Erik Humphrey
 * Description: Dice game in which the player wagers points on random outcomes
 * Date: April 4, 2017
 */
import java.util.Scanner;
/**
 * Client code: A "high or low" game is played.
 */

// TODO: Make something happen when player runs out of points
// TODO: Add something from each part of the module
public class Game {
    public static void main(String[] args) {
        final int QUIT = -1;
        final int LOW = 0, HIGH = 1;
        Player player = new Player(); 
        int pointsToRisk, call;
        Scanner input = new Scanner(System.in);
        /* play High or Low game */
        System.out.println("You have " + player.getPoints() + " points.");
        System.out.print("How many points do you want to risk? (-1 to quit) ");
        pointsToRisk = input.nextInt();
        while (pointsToRisk != QUIT) {
        	if (pointsToRisk != -400) {
            player.riskPoints(pointsToRisk);
            do {
                System.out.print("Make a call (0 for low, 1 for high): ");
                call = input.nextInt();
            } while (call != LOW && call != HIGH);
            player.makeCall(call);
            player.rollDice();
            System.out.println("You rolled: " + player.getRoll());
            System.out.println("You now have " + player.getPoints() +
                " points.");

        	else {
        		player.rollDice();
                System.out.println("You rolled: " + player.getRoll(-400));
        	}
            System.out.print("How many points do you want to risk? (-1 to quit) ");
            pointsToRisk = input.nextInt();
        	}
        }
        input.close();
    }
}