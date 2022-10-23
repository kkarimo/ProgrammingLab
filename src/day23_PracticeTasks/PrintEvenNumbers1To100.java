package day23_PracticeTasks;

public class PrintEvenNumbers1To100 {

    public static void main(String[] args) {

        PrintEvenNumbers1To100();


    }

    public static void PrintEvenNumbers1To100(){

        for (int i = 2; i < 101; i++) {
            if (i%2==0){
                System.out.print(i + " ");
            }
        }
    }

}
/*
2. create a method that can print even numbers between 1~100 in a same line separated by space
 */