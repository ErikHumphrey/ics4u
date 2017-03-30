/*
 * TODO: Header information
 */
import java.util.Scanner;
/**
 * A HighOrLow game is played.
 */
public class Game {
    public static void main(String[] args) {
        final int QUIT = -1;
        final int LOW = 0, HIGH = 1;
        HLPlayer player = new HLPlayer(); // HLPlayer isn't a good class name, try Player
        int pointsToRisk, call;
        Scanner input = new Scanner(System.in);
        /* play High or Low game */
        System.out.println("You have " + player.showPoints() + "points.");
        System.out.print("How many points do you want to risk? (-1 to quit)");
        pointsToRisk = input.nextInt();
        while (pointsToRisk != QUIT) {
            player.riskPoints(pointsToRisk);
            do {
                System.out.print("Make a call (0 for low, 1 for high): ");
                call = input.nextInt();
            } while (call != LOW && call != HIGH);
            player.makeCall(call);
            player.rollDice();
            System.out.println("You rolled: " + player.showRoll());
            System.out.println("You now have " + player.showPoints() +
                " points.");
            System.out.print("How many points do you want to risk? (-1 to quit) "); // TODO: Set this as a predefined string?
            pointsToRisk = input.nextInt();
        }
    }
}