package day16_PracticeTasks;

import java.util.Scanner;

public class PositiveNegativeNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int positive = 0;
        int negative = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("enter number for 5 times:");
            int number = scanner.nextInt();

            if (number>0){
                positive +=1;
            }

            if (number<0){
                negative +=1;
            }

            }

        System.out.println("positive = " + positive);
        System.out.println("negative = " + negative);

        }


    }


/*
1. Write a program that asks user to enter number for 5 times, and print how many positive and negative numbers user entered
			Ex:
				Inputs:
					10
					20
					-1
					0
					3

				Output:
					3 positive and 1 negative
 */