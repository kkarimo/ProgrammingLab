package day19_PracticeTasks;

import java.util.Scanner;

public class CircleCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.println("Enter the radius of the circle:");
            double radius = scan.nextDouble();

            if (radius <=0){
                System.out.println("Invalid Entry for the radius of the circle");
                System.exit(0);
            }

            System.out.println("Diameter of circle: " + 2*radius);
            System.out.println("Area of circle: " + 3.14*radius*radius);
            System.out.println("Perimeter of circle: " + 3.14*2*radius);

            System.out.println("Would you like to calculate another circle? (yes/no)");
            String reply = scan.next();

            while ( !(reply.equalsIgnoreCase("yes")||reply.equalsIgnoreCase("no"))  ){// while the reply is invalid
                System.out.println("Invalid entry, re-enter");
                reply = scan.next();
            }

            if (reply.equalsIgnoreCase("no")){
                System.out.println("Thank you for using Cydeo Circle Calculator APP");
                break;
            }



        }

       scan.close();



    }
}

/*
1. Write a program that can calculate the area and perimeter of a circle:
			1. Ask the user "Enter the radius of the circle:"
				if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the radius of the circle"

			2. Display:
					1. Diameter of circle
					2. Area of circle
					3. Perimeter of circle

			3. Ask the user "Would you like to calculate another circle?"
					If "yes" --> repeat the previous steps
					If "No" --> Print "Thank you for using Cydeo Circle Calculator APP"

				If user enters an invalid entry, ask the user to re-enter until user provides a valid entry
 */