package day13_PracticeTasks;

import java.util.Scanner;

public class Initial {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first name:");
        String firstName = scanner.next();

        System.out.println("Enter last name:");
        String lastName = scanner.next();

        char ch1 = firstName.charAt(0);
        char ch2 = lastName.charAt(0);

        System.out.println(ch1+"."+ch2);


        scanner.close();


    }
}

/*
4. write a program that can return the initials of the user

            ex:
                cybertek
                school

            output:
                C.S

        Note: Pay attention to the example output
 */