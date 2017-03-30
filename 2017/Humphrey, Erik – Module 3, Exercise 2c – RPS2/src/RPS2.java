/**
 * @Author Erik Humphrey
 * @Started 2017-03-29
 * @Title Module 3 – Exercise 2c – RPS2
 * @Version 1.1
 * @Description Game in which the user plays a series of rock–paper–scissors matches versus the computer 
 */
import java.util.Scanner;

public class RPS2 {
    public static void main(String[] args) {
        RPS2Game rps = new RPS2Game();
        RPSPlayer human = new RPSPlayer();
        int rounds, playerThrow;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        human.setName(input.nextLine());
        System.out.print("How many rounds? ");
        rounds = input.nextInt();

        /* The very definition of spaghetti code
         * Game runs at least once (`do`) and repeats `while` there's a draw/tie
         * Usually in rock–paper–scissors, a draw (e.g. ROCK-ROCK) would simply repeat the round instead
         * This way, I can apply the same tiebreaker system to other games (e.g. hockey) in the future. 
         */

        match:
            do {
                for (int i = 0; i < rounds; i++) {
                    System.out.print("\nEnter your throw (ROCK = 1, PAPER = 2, SCISSORS = 3): ");
                    playerThrow = input.nextInt();
                    human.makeThrow(playerThrow);
                    rps.makeCompThrow();
                    rps.announceWinner(human.getThrow(), human.getName());
                }
                if (!rps.bigWinner("").equals("draw"))
                    break match; // Break out of the loop
                else {
                    rounds = 1;
                    System.out.println("The series ends in a draw!\nTIEBREAKER!!");
                };
            }
            while (rps.bigWinner("").equals("draw"));

        System.out.println(rps.bigWinner(human.getName())); // Display final result

        input.close();
    }
}