import java.util.InputMismatchException;
import java.util.Scanner;
/*
“Fizz” if an integer is divisible by 3,
“Buzz” if an integer is divisible by 5,
and “FizzBuzz” if an integer is divisible by both 3 and 5.
 */

public class FizzBuzz {
    public static void main(String[] args) {
        int input = 0;
        boolean success = false;

        System.out.print("Number: ");
        while (!success) {
            try { // try to insert a number
                Scanner sc = new Scanner(System.in);
                input = sc.nextInt();
                success = true;
            } catch (InputMismatchException e) { /* if the input is not a
            number catch the error and ask the user to insert the number again*/
                System.out.println("Not a number");
                System.out.println("Re-enter Number");
            }
        }

        if (input % 3 == 0 && input % 5 == 0) // check if number is divisible by 3 or 5
            System.out.println("FizzBuzz");
        else if (input % 3 == 0)
            System.out.println("Fizz"); //check if number is divisible by 5
        else if (input % 5 == 0)
            System.out.println("Buzz"); //check if number is divisible by 3
        else
            System.out.println(input + " Not divisible by 3 or 5");
    }
}
