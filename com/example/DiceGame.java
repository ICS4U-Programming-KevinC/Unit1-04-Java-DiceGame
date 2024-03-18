import java.util.Random;
import java.util.Scanner;

/**
 * Change me.
 *
 * @author Kevin Csiffary
 * @version 1.0
 * @since 2024-03-18
 */

// DiceGame class
public final class DiceGame {

  /** Private constructor to prevent instantiation. */
  private DiceGame() {
    throw new UnsupportedOperationException("Cannot instantiate");
  }

  /**
   * This is the main method.
   *
   * @param args Unused
   */
  public static void main(final String[] args) {

    boolean quit = false;

    int guessCounter = 0;

    // Create the scanner.
    Scanner sc = new Scanner(System.in);

    Random rand = new Random();

    // Tell the user what the program does.
    System.out.print("This program is a guessing game, ");
    System.out.println(" guess until you get the right answer!");

    do {
      // Increments guess counter
      guessCounter++;

      // Calculate random number.
      int randNum = rand.nextInt(6) + 1;

      // Setup try catch
      try {
        // Get user input.
        System.out.println("\nGuess a number between 1 and 6");
        int guess = sc.nextInt();

        // Checks if the guess is in the range
        if (guess >= 1 && guess <= 6) {
          if (randNum == guess) {
            System.out.print("Congratulations! ");
            System.out.println("You guessed correctly. :)");
            System.out.print(" it took you " + guessCounter);
            System.out.println(" trie(s) to get it right!");
            guessCounter = 0;
          } else {
            System.out.println("Nope, thats not right! :(");
          }
        } else {
          System.out.println("NO guess a number between 1 and 6!");
        }

        sc.nextLine();

        System.out.println("\nWould you like to try again?");
        System.out.println("Enter q to quit");
        String userQuit = sc.nextLine();

        if (userQuit.equals("q")) {
          break;
        }

      } catch (Exception e) {
        System.out.println("Please enter a proper number!");
        sc.nextLine();
        guessCounter--;
        continue;
      }
    } while (!quit);
  }
}
