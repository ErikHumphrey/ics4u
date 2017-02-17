// Accepts only integer input but outputs doubles for minutes to hours and hours to days

import java.util.Scanner;
import java.text.DecimalFormat;

public class TimeChanger {
	static final String INPUT_MISMATCH_ERROR = "Please input a whole number.\n";
	static final String UNWISE_DECISION = "\nThat would not be wise. Enter ";
	static Scanner userInput = new Scanner(System.in);
	static DecimalFormat df = new DecimalFormat("0.00");
	
	public static void main(String[] args) {
		
		System.out.println("What conversion would you like to do? Enter a number from the menu below.");
		promptConvert();
	}
	
	public static void promptConvert() {
		System.out.println("\n1. Hours to Minutes");
		System.out.println("2. Days to Hours");
		System.out.println("3. Minutes to Hours");
		System.out.println("4. Hours to Days\n");
		
		int selection = userInput.nextInt();
		
		switch (selection) {
		case 1:
			convertHoursToMinutes();
			break;
		case 2:
			convertDaysToHours();
			break;
		case 3:
			convertMinutesToHours();
			break;
		case 4:
			convertHoursToDays();
			break;
		default:
			System.out.println(UNWISE_DECISION + "a number from 1 to 4.");
			promptConvert();
			break;
		}
	}
	
	public static void convertHoursToMinutes() {
		System.out.println("\nHow many hours?\n");
		if (userInput.hasNext() == true){
		while (!userInput.hasNextInt()) {
			System.out.println(INPUT_MISMATCH_ERROR);
			userInput.next();
			}
		}
		int hours = userInput.nextInt();
		int minutes = hours * 60;
		System.out.println("\n" + hours + " hours is " + minutes + " minutes.");
		doMoreConversions();
	}
	
	public static void convertDaysToHours() {
		System.out.println("\nHow many days?\n");
		if (userInput.hasNext() == true){
		while (!userInput.hasNextInt()) {
			System.out.println(INPUT_MISMATCH_ERROR);
			userInput.next();
			}
		}
		int days = userInput.nextInt();
		int hours = days * 24;
		System.out.println("\n" + days + " days is " + hours + " hours.");
		doMoreConversions();
	}
	
	public static void convertMinutesToHours() {
		System.out.println("\nHow many minutes?\n");
		if (userInput.hasNext() == true){
		while (!userInput.hasNextInt()) {
			System.out.println(INPUT_MISMATCH_ERROR);
			userInput.next();
			}
		}
		int minutes = userInput.nextInt();
		double hours = (double)minutes / 60;
		System.out.println("\n" + minutes + " minutes is " + df.format(hours) + " hours.");
		doMoreConversions();
	}
	
	public static void convertHoursToDays() {
		System.out.println("\nHow many minutes?\n");
		if (userInput.hasNext() == true){
		while (!userInput.hasNextInt()) {
			System.out.println(INPUT_MISMATCH_ERROR);
			userInput.next();
			}
		}
		int hours = userInput.nextInt();
		double days = (double)hours / 24;
		System.out.println("\n" + hours + " hours is " + df.format(days) + " days.");
		doMoreConversions();
	}
	
	public static void doMoreConversions() {
		System.out.println("Do you do another conversion?\n");
		System.out.println("1. Yes");
		System.out.println("2. No\n");
		int selection = userInput.nextInt();
		switch (selection){case 1:  promptConvert(); break;
		                   case 2:  userInput.close(); break;
		                   default: System.out.println(UNWISE_DECISION + "1 or 2."); break;}
	}
}
