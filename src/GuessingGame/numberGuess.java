package GuessingGame;
import java.util.Scanner;
public class numberGuess {
	public static void guessingNumberGame() {
		Scanner sc = new Scanner(System.in);
		int K = 5;
		int guess;
		int noOfTries; //
		int number = 1 + (int) (100 * Math.random());
		System.out.println("A number is chosen" + " between 1 to 100." + "\nGuess the number" + " within 5 trials.");
		for (noOfTries = 0; noOfTries < K; noOfTries++) {
			System.out.println("Guess the number:");
			guess = sc.nextInt();
			if (number == guess) {
				System.out.println("Congratulations!!!" + " You guessed the number....");
				break;
			} else if (number > guess && noOfTries != K - 1) {
				System.out.println("The number is " + "greater than " + guess);
			} else if (number < guess && noOfTries != K - 1) {
				System.out.println("The number is" + " less than " + guess);
			}
		}
		if (noOfTries == K) {
			System.out.println("You have exhausted" + " K trials.");

			System.out.println("The number was " + number);
		}
	}
	public static void main(String arg[]) {
		guessingNumberGame();
	}
}

