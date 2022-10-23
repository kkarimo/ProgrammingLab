package day23_PracticeTasks;

public class EachElement {

    public static void main(String[] args) {

        printEachElement(new int []{1,2,3,4,5});

    }

    public static void printEachElement (int[] arr){

        for (int each : arr) {
            System.out.print(each + " ");
        }

    }


}

/*
14. create a method named printEachElement that can print each elements of an integer array

 */