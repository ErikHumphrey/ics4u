/* Author: Erik Humphrey
 * Date started: February 3rd, 2017
 * Project title: Module 2 Assignment - Tic Tac Toe
 * Description: Program that prints a static tic-tac-toe board to the console.
 */

import java.util.Scanner;

public class TicTacToe {
	public static final String HORIZONTAL_LINE = "\n   ———————————————\n";
	public static void main(String[] args) {

		System.out.format("%2s %2s %2s %2s %2s %2s\n", " ", "A", " ", "B", " ", "C");
		System.out.format("%2s %2s %2s %2s %2s %2s", "1", " ", "|", " ", "|", " ");
		System.out.print(HORIZONTAL_LINE);
		System.out.format("%2s %2s %2s %2s %2s %2s", "2", " ", "|", " ", "|", " ");
		System.out.print(HORIZONTAL_LINE);
		System.out.format("%2s %2s %2s %2s %2s %2s\n", "3", " ", "|", " ", "|", " ");
		System.out.print("\nPlayer's turn.");
		playerTurn();
		// Note to self: Something something don't use global variables
	}
	
	public static class Game{
		public static int boardState = 0;
		public static int board[][] = {(1, 2), (3, 3)};
		public static String expendedMoves;
	} 
	
	public static enum Mark { EMPTY, X, O }
	
	public static void playerTurn() {
		String playerMove;
	    Scanner userInput = new Scanner(System.in);
	    
	    // Prompt the player to enter the coordinate pair of the space place their mark
	    System.out.print(" Make your move: ");
		playerMove = userInput.next();
		if (playerMove.equalsIgnoreCase("A1") ||
			playerMove.equalsIgnoreCase("A2") ||
			playerMove.equalsIgnoreCase("A3") ||
			playerMove.equalsIgnoreCase("B1") || 
			playerMove.equalsIgnoreCase("B2") ||
			playerMove.equalsIgnoreCase("B3") ||
			playerMove.equalsIgnoreCase("C1") ||
			playerMove.equalsIgnoreCase("C2") ||
			playerMove.equalsIgnoreCase("C3"))
		{ 
			
			System.out.println("The player plays X in cell " + playerMove.toUpperCase() + ".\n");
			// I'll figure out how 2D arrays and enumerables work later; I've spent too much time trying to make this work
			System.out.println("If the move was B2 the board would look something like this, but implementing this is too complicated for now.");
			System.out.format("%2s %2s %2s %2s %2s %2s\n", " ", "A", " ", "B", " ", "C");
			System.out.format("%2s %2s %2s %2s %2s %2s", "1", " ", "|", " ", "|", " ");
			System.out.print(HORIZONTAL_LINE);
			System.out.format("%2s %2s %2s %2s %2s %2s", "2", " ", "|", "X", "|", " ");
			System.out.print(HORIZONTAL_LINE);
			System.out.format("%2s %2s %2s %2s %2s %2s\n", "3", " ", "|", " ", "|", " ");
			System.out.print("\nPlayer's turn.");
			playerTurn();
		}
		else {
			// Call the method again if the player inputs an invalid move
			System.out.print("That would not be wise.");
			playerTurn();}
		
		// TODO: Print the updated board
		
		userInput.close(); // Close scanner to remove resource leak
		
		
		
	}

}
