import java.util.Random;
import java.util.Scanner;

public class GuessNumberz {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int someNum = rand.nextInt(101) + 1;
		int userGuess;
		char answer = 'y';

		/*do {
			System.out.println("Welcome to the Guess A Number Game! \n");
			System.out.println("I'm thinking of a number between 1 and 100.");
			System.out.println("Try to guess it: ");
			userGuess = scan.nextInt();
			
			if (userGuess < 1 || userGuess > 100) {
				System.out.println("Invalid entry. Please enter a number between 1 and 100: ");
				userGuess = scan.nextInt();
			}
			int userTries = 1;

			while (userGuess != someNum) {
				int distGuess = someNum - userGuess;
				if (distGuess <= 10 && distGuess > 0) {
					System.out.println("Too low.");
					System.out.println("Guess again: ");
					userGuess = scan.nextInt();
					userTries++;
				} else if (distGuess > 10) {
					System.out.println("Way too low.");
					System.out.println("Guess again: ");
					userGuess = scan.nextInt();
					userTries++;
				} else if (distGuess >= -10 && distGuess < 0) {
					System.out.println("Too high.");
					System.out.println("Guess again: ");
					userGuess = scan.nextInt();
					userTries++;
				} else if (distGuess < -10) {
					System.out.println("Way too high.");
					System.out.println("Guess again: ");
					userGuess = scan.nextInt();
					userTries++;
				}

			}

			System.out.println("You guessed right!");
			if (userTries <= 10) {
				System.out.println("It only took you " + userTries + " tries!");
			} else {
				System.out.println("...Dang. It took you " + userTries + " tries...");
			}*/
			System.out.println("Want to play again? y/n");
			answer = scan.next().charAt(0);
			while (answer != 'y' && answer != 'n') {
				System.out.println("Invalid entry. Please enter y or n");
				answer = scan.next().charAt(0);
			}

		//} while (answer == 'y');

		System.out.println("Goodbye!");
		scan.close();

	}

}
