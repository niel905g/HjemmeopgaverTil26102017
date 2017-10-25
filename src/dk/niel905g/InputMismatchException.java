package dk.niel905g;
//import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * Opgave 12.2:
 *
 *      (InputMismatchException)
 *      Write a program that prompts the user to read two integers and
 *      displays their sum. Your program should prompt the user to read
 *      the number again if the input is incorrect.
 *
  */
public class InputMismatchException extends Throwable {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.print("Enter two integers: ");
            int num1 = 0;
            int num2 = 0;
            boolean isValid = false;
            while (!isValid) {
                try {
                    num1 = input.nextInt();
                    num2 = input.nextInt();
                    isValid = true;
                } catch (java.util.InputMismatchException ex)
                 {
                    input.nextLine();
                    System.out.println("Invalid input..." );
                    System.out.print("Enter two integers: ");
                }
            }
            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        }
    }