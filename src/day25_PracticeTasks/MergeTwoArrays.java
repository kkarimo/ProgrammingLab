package day25_PracticeTasks;

import java.util.Arrays;

public class MergeTwoArrays {

    // create a method that can merge two integer arrays.
    public static int [] merge (int[] arr1, int[] arr2){

        int[] result = new int[arr1.length+ arr2.length];
            int i = 0;
        for (int each : arr1) {
            result[i++] = each;
        }

        for (int each : arr2) {
            result[i++] = each;
        }

        return result;

    }

    public static double [] merge (double[] arr1, double[] arr2){

        double[] result = new double[arr1.length+ arr2.length];
        int i = 0;
        for (double each : arr1) {
            result[i++] = each;
        }

        for (double each : arr2) {
            result[i++] = each;
        }

        return result;

    }

    public static String [] merge (String[] arr1, String[] arr2){

        String[] result = new String[arr1.length+ arr2.length];
        int i = 0;
        for (String each : arr1) {
            result[i++] = each;
        }

        for (String each : arr2) {
            result[i++] = each;
        }

        return result;

    }
    
    

    // create a method that can return the max number from an integer array
    public static int max (int[] arr){
        Arrays.sort(arr);
       return arr[arr.length-1 ];
    }

    //Create a method that can reverse an integer array

    public static int[] reverse (int[] array) {

        int [] result = new int[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = array[i];
        }

        return result;

    }

}
