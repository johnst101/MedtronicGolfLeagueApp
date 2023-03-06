import java.util.Scanner;

public class Main {
	private static Scanner scnr = new Scanner(System.in);
	
	public static void main(String[] args) {
		//declare variables
		int menuChoice = 0;

		//main actions
		while (menuChoice != 6) {
			displayMainMenu();
			menuChoice = getMenuChoice();
		
			if (menuChoice == 1) {
				System.out.println("Choice 1 Selected");
			}
			else if (menuChoice == 2) {
				System.out.println("Choice 2 Selected");
			}
			else if (menuChoice == 3) {
				System.out.println("Choice 3 Selected");
			}
			else if (menuChoice == 4) {
				System.out.println("Choice 4 Selected");
			}
			else if (menuChoice == 5) {
				System.out.println("Choice 5 Selected");
			}
			else if (menuChoice == 6) {
				System.out.println("====== QUITTING PROGRAM ======");
			}
			else {
				System.out.println("INVALID CHOICE. Please enter a number on the menu.");
			}
			
			System.out.println();
		}
	}

	public static void displayMainMenu() {
		System.out.println("====== MAIN MENU ======");
		System.out.println("1) Schedule");
		System.out.println("2) Teams");
		System.out.println("3) Standings");
		System.out.println("4) League Roster");
		System.out.println("5) Rules");
		System.out.println("6) Quit App");
		System.out.println();
	}
	
	public static int getMenuChoice() {
		System.out.print("Enter menu choice number: ");
		return scnr.nextInt();
	}
}
