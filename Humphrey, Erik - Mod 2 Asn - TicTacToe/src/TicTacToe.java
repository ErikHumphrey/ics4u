/* Author: Erik Humphrey
 * Project title: Module 2 Assignment - Tic Tac Toe
 * Date started: February 3rd, 2017
 * Description: Program that prints a static tic-tac-toe board to the console, probably.
 */

import java.util.Scanner;

public class TicTacToe {
	public static final String HORIZONTAL_LINE = "\n   ——————————————\n";
	public static void main(String[] args) {

		System.out.format("%5s %4s %5s\n", "A", "B", "C");
		System.out.format("%2s %4s %5s", "1", "|", "|");
		System.out.print(HORIZONTAL_LINE);
		System.out.format("%2s %4s %5s", "2", "|", "|");
		System.out.print(HORIZONTAL_LINE);
		System.out.format("%2s %4s %5s\n", "3", "|", "|");
		
		System.out.print("\nPlayer's turn.");
		playerTurn();
		// Note to self: Something something don't use global variables
	}
	
	public static void playerTurn() {
		String playerMove;
	    Scanner userInput = new Scanner(System.in);
	    
	    // Prompt the player to enter the coordinate pair of the space place their mark
	    System.out.print(" Make your move: ");
		playerMove = userInput.next();
		if (playerMove.equals("A1")||
			playerMove.equals("A2") ||
			playerMove.equals("A3") ||
			playerMove.equals("B1") || 
			playerMove.equals("B2") ||
			playerMove.equals("B3") ||
			playerMove.equals("C1") ||
			playerMove.equals("C2") ||
			playerMove.equals("C3"))
		{ System.out.println("The player plays X in cell " + playerMove + ".");}
		else {
			// Call the method again if the player inputs an invalid move
			System.out.print("That would not be wise.");
			playerTurn();}

		// TODO: Print the updated board
		// TODO: Count number of turns
		
		userInput.close(); // Close scanner to remove resource leak
	}

}
