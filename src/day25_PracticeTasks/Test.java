package day25_PracticeTasks;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

    String[] arr1 = {"Yusuf" ,"Khurshid", "Aziza", "Faiza", "Usman"};
    String[] arr2 = {"Bobur", "Mohira", "Farruh", "Ibrohim", "Omina"};

    String [] merged =  MergeTwoArrays.merge(arr1, arr2);

        System.out.println(Arrays.toString(merged));

        for (String each : merged) {
            System.out.println(each);
        }

    }
}
