package dk.niel905g;
/* Opgave 12.15
 * (Write/Read data) Write a program to create a file named Exercise12_15.txt
 * if it does not exist. Write 120 integers created randomly into the file
 * using text I/O. Integers are separated by spaces in the file. Read the
 * data back from the file and display the data in increasing order.*/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteReadData {
    public static void main(String[] args) throws Exception {
     //
     java.io.File file = new java.io.File("Exercise12_15.txt");
     if ((file.exists())) {
         System.out.println("File already exists");
         System.exit(0);
     }
     // writing 120 integers into the file Exercise12_15.txt
        try {
            java.io.PrintWriter output = new java.io.PrintWriter(file);

            output.print("120 ? ikke løst endnu");

            output.close();
        } catch (FileNotFoundException ex) {
         ex.printStackTrace();
        }

    }
public class ReadData {
       public void main(String[] args) throws Exception {
           java.io.File file = new java.io.File(("Exercise12_15.txt"));
           Scanner input = new Scanner(file);

           while (input.hasNext()) {
               String firstName = input.next();
               String mi = input.next();
               String lastName = input.next();

               int score = input.nextInt();

               System.out.println(firstName + " " + lastName + " " + score);
               input.close();
           }

       }

    }
}
