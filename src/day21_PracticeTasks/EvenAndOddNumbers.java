package day21_PracticeTasks;

import java.util.Arrays;

public class EvenAndOddNumbers {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9};
        int even = 0;
        int odd = 0;
        for (int each : arr) {
            if(each%2==0){
                even++;
            }else {
                odd++;
            }
        }

        System.out.println(Arrays.toString(arr) + " has " + even + " even numbers and " + odd + " odd numbers");



    }
}
/*
2. Write a program that can count the even and odd number from an array of integers
			Note: MUST use for each loop
 */