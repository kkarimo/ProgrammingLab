package day21_PracticeTasks;

import java.util.Arrays;

public class SortingArrayInDescendingOrder {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arrr2 = new int[arr1.length];

        for (int i = arr1.length - 1, j = 0; i >= 0; i--, j++) {

            arrr2[j]=arr1[i];

        }
        System.out.println(Arrays.toString(arrr2));

    }
}

/*
1. Write a program that sort the array of integer in descending order
 */