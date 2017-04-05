/**
 * Project: Module 4 Assignment: High or Low Game
 * Author: Erik Humphrey
 * Description: Dice game in which the player wagers points on random outcomes
 * Date: April 4, 2017
 */
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * Client code: A "high or low" game is played.
 */

// TODO: Make something happen when player runs out of points?
// TODO: Add something from each part of the module
public class Game {
    public static void main(String[] args) {
        final int QUIT = -1;
        final int LOW = 0, HIGH = 1;
        Player player = new Player(); 
        int pointsToRisk = 0, call = 0;
        Scanner input = new Scanner(System.in);
        /* play High or Low game */
        System.out.print("You have " + player.getPoints() + " points.");
        
        boolean badInput = true;
        do {
        	try{        
        		System.out.print("\nHow many points do you want to risk? (-1 to quit) ");
                int next = input.nextInt();
                // If the input is positive or one of the functional negative inputs, accept the number.
                if (next > 0 || next == -1 || next == -400) {
                	pointsToRisk = next;
                    badInput = false;
                }
                else
                	badInput = true;
        	}
        	catch (InputMismatchException e) {
        		System.out.print("Please input a positive whole number, or -1 to quit. ");
        	}
        	input.nextLine();
        } while (badInput);
    
        while (pointsToRisk != QUIT) {
        	if (pointsToRisk != -400) {
            player.riskPoints(pointsToRisk);
            do {
                badInput = true;
                do {
                	try{        
                		System.out.print("\nMake a call (0 for low, 1 for high): ");
                        int next = input.nextInt();
                        if (next > 0 || next == -1) {
                        	call = next;
                            badInput = false;
                        }
                        else
                        	badInput = true;
                	}
                	catch (InputMismatchException e) {
                		System.out.print("Please input a positive whole number, or -1 to quit. ");
                	}
                	input.nextLine();
                } while (badInput);
            } while (call != LOW && call != HIGH);
            player.makeCall(call);
            player.rollDice();
            System.out.println("You rolled: " + player.getRoll());
            System.out.println("You now have " + player.getPoints() +
                " points.");
        	}

        	else {
        		for(int x = 0; x < 5; x++)
        			System.out.println(player.getRoll(-400));
                System.out.println(player.getMissing());
        	}
            badInput = true;
            do {
            	try{        
            		System.out.print("\nHow many points do you want to risk? (-1 to quit) ");
                    int next = input.nextInt();
                    if (next > 0 || next == -1 || next == -400) {
                    	pointsToRisk = next;
                        badInput = false;
                    }
                    else
                    	badInput = true;
            	}
            	catch (InputMismatchException e) {
            		System.out.print("Please input a positive whole number, or -1 to quit. ");
            	}
            	input.nextLine();
            } while (badInput);
        	}

        System.out.print("Ending program.");
        input.close();
        }
    }