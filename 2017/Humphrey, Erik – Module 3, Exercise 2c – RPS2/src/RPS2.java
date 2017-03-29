/* Author: Erik Humphrey
 * Date started: March 29th, 2017
 * Project title: Module 3 – Exercise 2c – RPS2
 * Description: Game in which the user plays a series of rock–paper–scissors matches versus the computer 
 */

import java.util.Scanner;

public class RPS2 {
    public static void main(String[] args) {
        RPS2Game rps = new RPS2Game();
        RPSPlayer human = new RPSPlayer();
        int rounds;
        int playerThrow;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        human.setName(input.nextLine());
        System.out.print("How many rounds? ");
        rounds = input.nextInt();

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
                    break match;
            }
            while (rps.bigWinner("").equals("draw"));
        
        System.out.println(rps.bigWinner(human.getName()));
        
        input.close();
    }
}