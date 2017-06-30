import java.util.Scanner;

/**
 * Created by Matt on 6/30/2017.
 */
public class ExceptionDemo {

    public static void main(String[] args) {

        System.out.println("Hello World");
        Scanner scan = new Scanner(System.in);

        // This program will catch for invalid input

        String choice = "y";
        String line;

        while (choice.equalsIgnoreCase("y")) {
            //Get input from user
            System.out.println("Please enter a monthly investment");
            double monthlyInv;

            try{
                line = scan.nextLine();
                monthlyInv = Double.parseDouble(line);
            } catch (NumberFormatException e){
                System.out.println("Error! Invalid Number!");
                continue; // pushes back to top of loop -------- a break would exit loop
            }

            System.out.println(monthlyInv);

            System.out.println("Continue? (y/n):");
            choice = scan.nextLine();

        } // end while

    } //end main
}// end class
