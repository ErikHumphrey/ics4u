/* Author: Erik Humphrey
 * Project title: Module 2 Assignment - Tic Tac Toe
 * Date started: February 3rd, 2017
 * Description: Program that prints a static tic-tac-toe board to the console, probably.
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
		int boardState = 000000000;
		System.out.print("\nPlayer's turn.");
		playerTurn();
		// Note to self: Something something don't use global variables
	}
	
	public static class Game{
		public static int boardState = 0;
		public static String expendedMoves;
	} 
	
	public static enum Tile { EMPTY, X, O }
	
	public static void playerTurn() {
		String playerMove;
	    Scanner userInput = new Scanner(System.in);
	    
		Tile[] tiles = new Tile[3*3];
	    
	    // Prompt the player to enter the coordinate pair of the space place their mark
	    System.out.print(" Make your move: ");
		playerMove = userInput.next();
		if (Game.expendedMoves.toUpperCase().contains(playerMove.toUpperCase())
		 && playerMove.equalsIgnoreCase("A1") ||
			playerMove.equalsIgnoreCase("A2") ||
			playerMove.equalsIgnoreCase("A3") ||
			playerMove.equalsIgnoreCase("B1") || 
			playerMove.equalsIgnoreCase("B2") ||
			playerMove.equalsIgnoreCase("B3") ||
			playerMove.equalsIgnoreCase("C1") ||
			playerMove.equalsIgnoreCase("C2") ||
			playerMove.equalsIgnoreCase("C3"))
		{ 
			Game.expendedMoves += playerMove; // Mark the cell as filled so it can't be picked again
			System.out.println("The player plays X in cell " + playerMove.toUpperCase() + ".\n");
			// Really inefficient way of updating the board state
		    // At this point I'm too experienced to do this properly and just want it to work
			// TODO: Use binary instead
			
			String A1; String A2; String A3; String B1; String B2; String B3; String C1; String C2; String C3;
			
			String X = "X";
			
			if (playerMove.equalsIgnoreCase("A1")){Game.boardState +=100000000; A1 = X;}
			if (playerMove.equalsIgnoreCase("B1")){Game.boardState +=010000000; B1 = X;}
			if (playerMove.equalsIgnoreCase("C1")){Game.boardState +=001000000; C1 = X;}
			if (playerMove.equalsIgnoreCase("A2")){Game.boardState +=000100000; A2 = X;}
			if (playerMove.equalsIgnoreCase("B2")){Game.boardState +=000010000; B2 = X;}
			if (playerMove.equalsIgnoreCase("C2")){Game.boardState +=000001000; C2 = X;}
			if (playerMove.equalsIgnoreCase("A3")){Game.boardState +=000000100; A3 = X;}
			if (playerMove.equalsIgnoreCase("B3")){Game.boardState +=000000010; B3 = X;}
			if (playerMove.equalsIgnoreCase("C3")){Game.boardState +=000000001; C3 = X;}
			
			
			System.out.format("%2s %2s %2s %2s %2s %2s\n", " ", "A", " ", "B", " ", "C");
			System.out.format("%2s %2s %2s %2s %2s %2s", "1", "X", "|", "X", "|", "X");
			System.out.print(HORIZONTAL_LINE);
			System.out.format("%2s %2s %2s %2s %2s %2s", "2", "X", "|", "X", "|", "X");
			System.out.print(HORIZONTAL_LINE);
			System.out.format("%2s %2s %2s %2s %2s %2s\n", "3", "X", "|", "X", "|", "X");
		}
		else {
			// Call the method again if the player inputs an invalid move
			System.out.print("That would not be wise.");
			playerTurn();}
		


		

		
		// Victory conditions
		
		
		//System.out.format("%6s %4s %5s\n", "A", "B", "C");
		System.out.format("%2s %2s %2s %2s %2s %2s\n", " ", "A", " ", "B", " ", "C");
		System.out.format("%2s %2s %2s %2s %2s %2s", "1", "X", "|", "X", "|", "X");
		System.out.print(HORIZONTAL_LINE);
		System.out.format("%2s %2s %2s %2s %2s %2s", "2", "X", "|", "X", "|", "X");
		System.out.print(HORIZONTAL_LINE);
		System.out.format("%2s %2s %2s %2s %2s %2s\n", "3", "X", "|", "X", "|", "X");
		
		// TODO: Print the updated board
		// TODO: Count number of turns
		
		userInput.close(); // Close scanner to remove resource leak
		

		Tile[0,3] = Tile.EMPTY;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
