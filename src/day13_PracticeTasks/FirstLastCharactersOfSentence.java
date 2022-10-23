package day13_PracticeTasks;

import java.util.Scanner;

public class FirstLastCharactersOfSentence {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a sentence:");
        String str = scanner.nextLine();

        char firstChar = str.charAt(0);
        char lastChar = str.charAt(str.length() - 1);

        System.out.println("firstChar = " + firstChar);
        System.out.println("lastChar = " + lastChar);

        scanner.close();

    }
}

/*
1. write a program that asks user to enter a sentence.
                then print the first & last characters of the sentence
 */