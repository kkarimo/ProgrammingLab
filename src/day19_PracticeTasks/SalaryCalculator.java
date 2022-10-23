package day19_PracticeTasks;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.println("How much do you make an hour?");
            double hourlyRate = scan.nextDouble();
            if (hourlyRate<=0){
                System.out.println("Invalid Entry for Hourly Rate");
                System.exit(0);
            }

            System.out.println("How many hours do you work per week?");
            double weeklyHour = scan.nextDouble();
            if (weeklyHour<1 || weeklyHour>144){
                System.out.println("Invalid Entry for Weekly Hours");
                System.exit(0);
            }

            System.out.println("Enter your state tax rate:");
            double stateTaxRate = scan.nextDouble();
            if (stateTaxRate<0 || stateTaxRate>10){
                System.out.println("Invalid Entry for state tax Rate");
                System.exit(0);
            }

            System.out.println("Gross Salary: $" + hourlyRate*weeklyHour*52);
            System.out.println("Federal Tax: $" + hourlyRate*weeklyHour*52*0.26);
            System.out.println("State Tax: $" + hourlyRate*weeklyHour*52*0.05);
            System.out.println("Total Tax: $" + (hourlyRate*weeklyHour*52*0.26+hourlyRate*weeklyHour*52*0.05));
            System.out.println("Net Income: $" + (hourlyRate*weeklyHour*52 - hourlyRate*weeklyHour*52*0.26-hourlyRate*weeklyHour*52*0.05  ));

            System.out.println("Would you like to continue? (yes/no)");
            String reply = scan.next();

            while ( !(reply.equalsIgnoreCase("yes")||reply.equalsIgnoreCase("no")) ){
                System.out.println("Invalid Entry, please re-enter:");
                reply = scan.next();
            }

            if (reply.equalsIgnoreCase("no")){
                System.out.println("Thank you for using Cydeo Salary Calculator APP");
                break;
            }


        }

        scan.close();

    }
}

/*
5. Write a program for the salary calculator
			1. Ask the user "How much you make an hour?"
					If user entered hourlyRate is 0 or negative, terminate the program after displaying the error message
					"Invalid Entry for Hourly Rate"

			2. Ask the user  "How many hours do you work per week?"
					if user entered weeklyHour is less than 1 or greater than 144,
					terminate the program after displaying the error message "Invalid Entry for Weekly Hours"

			3. Ask the user  "Enter your state tax rate"
					if the state tax rate is less than 0% or greater than 10%, terminate the program after displaying
					the error message "Invalid Entry for state tax Rate"

			4. Display:
					1. Gross Salary
					2. Federal Tax (assume that federal tax rate is 26%)
					3. State Tax
					4. Total Tax
					5. Net Income

			5. Ask the user "Would you like to continue?"
				If "yes" --> repeat all the previous steps
				If "no" --> print "Thank you for using Cydeo Salary Calculator APP"

				If user enters an invalid entry, terminate the program after displaying the error message "Invalid Entry"

 */