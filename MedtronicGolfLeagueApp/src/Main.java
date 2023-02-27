import java.util.Scanner;

public class Main {
	private static Scanner scnr = new Scanner(System.in);
	
	public static void main(String[] args) {
		//declare variables
		int menuChoice;

		//main actions
		displayMenu();
		menuChoice = getMenuChoice();
		
		//FIX ME: FIGURE OUT THE LOOP ON THIS
		if (menuChoice > 0 && menuChoice < 7) {
			if (menuChoice == 1) {
				System.out.println("Choice 1 Selected");
			}
			if (menuChoice == 2) {
				System.out.println("Choice 2 Selected");
			}
			if (menuChoice == 3) {
				System.out.println("Choice 3 Selected");
			}
			if (menuChoice == 4) {
				System.out.println("Choice 4 Selected");
			}
			if (menuChoice == 5) {
				System.out.println("Choice 5 Selected");
			}
			if (menuChoice == 6) {
				System.out.println("====== QUITTING PROGRAM ======");
			}
		}
		else {
			System.out.println("INVALID CHOICE. Please enter a number on the menu.");
			displayMenu();
			getMenuChoice();
		}
	}

	public static void displayMenu() {
		System.out.println("====== MAIN MENU ======");
		System.out.println("1) Schedule");
		System.out.println("2) Teams");
		System.out.println("3) Standings");
		System.out.println("4) League Roster");
		System.out.println("5) Rules");
		System.out.println("6) Quit App");
	}
	
	public static int getMenuChoice() {
		int menuChoice;
		
		System.out.print("Enter menu choice number: ");
		return menuChoice = scnr.nextInt();
	}
}
