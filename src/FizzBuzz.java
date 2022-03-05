import java.util.InputMismatchException;
import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = 0;
        System.out.print("Number: ");
        try {
            input = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Not a number");
        }

        if (input % 3 == 0 && input % 5 == 0) //divisible by 3 or 5
            System.out.println("FizzBuzz");
        else if (input % 3 == 0)
            System.out.println("Fizz"); //divisible by 5
        else if (input % 5 == 0)
            System.out.println("Buzz"); // divisible by 3
        else
            System.out.println(input + " Not divisible by 3 or 5");
    }
}
