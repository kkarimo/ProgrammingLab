package day23_PracticeTasks;

public class PrintOddNumbers1To100 {

    public static void main(String[] args) {
        PrintOddNumbers1To100();

    }

    public static void PrintOddNumbers1To100() {

        for (int i = 1; i < 101; i+=2) {
            System.out.print(i + " ");
        }
    }

}
/*
1. create a method that can print odd numbers between 1~100 in a same line separated by space
 */