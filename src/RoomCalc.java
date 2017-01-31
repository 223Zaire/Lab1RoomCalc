import java.util.Scanner;

/** Teron Briggs
 * 1/30/17
 * RoomCalc.java
 * This program takes the length and width of a rectangle
 * and calculates the area
 * Created by teronb1005 on 1/30/2017.
 */
public class RoomCalc {
    public static void main (String [] args) {
        //1. set up resources
        Scanner scan = new Scanner(System.in);

        //2. description of what we're setting up to do
        System.out.println("Welcome, this is where the area of the calculator will display.");

        String userInput = "Yes";

        while (userInput.equals("Yes")) {

            //3. this is where we ask user for input for RoomCalc
            System.out.print("Please enter length of classroom: ");
            double length = scan.nextDouble();

            System.out.print("Please enter width of classroom: ");
            double width = scan.nextDouble();

            //4. this is where the imput computes, put in by the user.
            double perimeter = 2 * length + 2 * width;

            double area = length * width;

            //5. results of the amounts put in will printout
            System.out.println("The perimiter is " + perimeter);

            System.out.println("The area is " + area);

            // Ask the user if they want to continue
            System.out.println("Continue? (Yes / No) must be entered exactly how it's written! ");

            // If userInput is Yes continue, if userInput is No Exit. Received by Scanner
            userInput = scan.next();
        }

        // Thank userInput for participation
            System.out.println("No problem, have a nice day");

        //6. close out resources
        scan.close();

    }
}
