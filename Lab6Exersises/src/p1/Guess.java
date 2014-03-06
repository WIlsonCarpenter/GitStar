package p1;
import java.util.Scanner;
import java.util.Random;
/**
 * Plays a guessing game with the user, letting them try to
 * guess a number between 1 and 10.
 * @author Wilson
 * @version 1.0
 */
public class Guess {
    /**
     * The maximum upper range of numbers.
     */
    private static final int MAX = 10;
    /**
     * The minimum lower range of numbers.
     */
    private static final int MIN = 1;
    /**
     * Tells the user to guess a number between 1 and 10. If the user is wrong, 
     * they guess again. If they are right, they are congratulated.
     * @param args unused.
     */
    public static void main(String[] args) {             
        Scanner scan = new Scanner(System.in);
        Random generator = new Random();
        
        //randomly generates the number to guess between 1 and 10
        int numToGuess = generator.nextInt(MAX) + 1;
        
        //prompts for and reads in the user's guess
        System.out.print("Guess a number between 1 and 10: ");
        int guess = scan.nextInt();
        
        //verifies the user's guess is within range
        while (guess < MIN || guess > MAX) {
            System.out.print("Invalid guess. Number must be between 1 and"
                    + " 10\nGuess again: ");
            guess = scan.nextInt();
        }
        
        //tells the user to guess again if they were wrong
        while  (guess != numToGuess) {
            if (guess > numToGuess) {
                System.out.print("Too high! Guess again: "); 
                }
            else {
                System.out.print("Too low! Guess again: ");
            }
            guess = scan.nextInt();
        }
        
        System.out.println("Correct, you win!");
        scan.close();
            
        
    }

}
