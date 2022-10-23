package day16_PracticeTasks;


import java.util.Scanner;

public class MultiplyTwoNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two positive numbers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int sum = 0;

        if (num1>0 && num2 >0){
            for (int i = num1; i < num1+num1; i++) {
                sum += num2;

            }
            System.out.println(sum);
        }else {
            System.out.println("Invalid");
        }




    }
}
/*
3. Write a program that asks user to enter two positive numbers,
     then multiply those two numbers without using multiplication (*) operator.
        if user enters any negative numbers, print Invalid
            Ex:
                inputs:
                    10
                    20
                output:
                    200
 */