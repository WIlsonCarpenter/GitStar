package p1;
import java.util.Scanner;
/**
 * Computes the factorial of a number entered by the user.
 * @author Wilson Carpenter
 *
 */
public class Factorial {

    public static void main(String[] args) {
        int userNum;
        int factorial = 1;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter a positive integer: ");
        userNum = scan.nextInt();
        
        //verifies the input is valid
        while (userNum < 0) {
            System.out.print("Number must be positive! Please re-enter: ");
            userNum = scan.nextInt();
        }
        
        //computes the factorial of input number.
        while (userNum > 0) {
            factorial = factorial * userNum;
            userNum--;
            
        }
        scan.close();
        System.out.println(factorial);
    }

}
