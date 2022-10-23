package day28_PracticeTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class MinumumNumber {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,20,30,4,5));

        int min = Integer.MAX_VALUE;

        for (Integer each : list) {
            if ( min > each ){
                min = each;
            }
        }
        System.out.println("min = " + min);
    }
}
/*
6. Write a program that can find the minimum number from an ArrayList of integers
		Ex:
			list = [1,2,3,4,5];
			output:
				1
 */