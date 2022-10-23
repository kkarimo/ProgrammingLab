package day15_PracticeTasks;

import java.util.Scanner;

public class FactorialNumber {

    public static void main(String[] args) {

        System.out.println("Enter a number:");
        Scanner scan = new Scanner(System.in);
        double num = scan.nextDouble();
        double fac = 1;
        for (int i = (int) num; i >= 1; i--) {

            fac *= i;

        }

        System.out.println(fac);

    }
}
/*
4. Write a program that can return the factorial number of any given number

            Ex:
                input: 5
                output: 120

                	( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )

 */