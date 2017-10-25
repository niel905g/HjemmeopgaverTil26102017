package dk.niel905g;
import java.io.File;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * Opgave 12.14:
 *  (Process scores in a text file)
 *   Suppose that a text file contains an unspecified number of scores
 *   separated by blanks. Write a program that prompts the user to enter
 *   the file, reads the scores from the file, and displays their total
 *   and average.
 */
public class ReadFromFile {
    public static void main(String[] args) throws Exception {
        // Create a File instance

        // Create a Scanner for input of file location
        Scanner input = new Scanner(System.in);
        //
        System.out.print("Type file name: ");
        String filename = input.next();
        //int score = input.nextInt();
        java.io.File file = new java.io.File(filename);
        Scanner scanner = new Scanner(file);

        int total = 0;
        // Read data from a file
        while (scanner.hasNext()) {

            String line = scanner.nextLine();
     //       int count = line.length();
            total = total + Integer.parseInt(line);

            System.out.println("Printing the scores " + line);
            System.out.println(" Totaling: " + total);
        }
        // Close the file
        input.close();
    }
}