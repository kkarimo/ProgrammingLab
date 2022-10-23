package day17_PracticeTasks;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number1:");
        int num1 = scan.nextInt();

        System.out.println("Enter number2:");
        int num2 = scan.nextInt();

        System.out.println("Enter math operator:");
        char operator = scan.next().charAt(0);

        int result = 0;

        while ( !(operator== '+' || operator == '-' || operator == '*' || operator == '/') ){

            System.out.println("Invalid operator, please re-enter");
            operator = scan.next().charAt(0);

        }

        if ( (operator== '+') ){
            result = num1 + num2;
        }else if ((operator== '-')){
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        }else {
            result = num1/num2;
        }

        System.out.println(result);

    }
}

/*
 3. write a program to ask user to enter two number and math operator, and return the result.
		if the operator is invalid operator, ask user to re-enter the operator until user provides a valid operator (+, -, *, /)
 */