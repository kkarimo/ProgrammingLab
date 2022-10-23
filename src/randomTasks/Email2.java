package randomTasks;

import java.util.Scanner;

public class Email2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        String firstName = email.substring(0, email.indexOf('_'));
        firstName = firstName.substring(0,1).toUpperCase()+firstName.substring(1);
        String lastName = email.substring( firstName.length() +1, email.indexOf('@'));
        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1);
        String domain = email.substring( email.indexOf('@')+1, email.lastIndexOf('.')  );


        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Domain: " + domain);

        scan.close();



    }
}
/*
Write a program that will print out information about user based on email. Print first name, last name, and domain.
First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.

Example:

Input: craig_federighi@apple.com
Output:
First name: Craig
Last name: Federighi
Domain: apple
 */