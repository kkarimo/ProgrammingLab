package day20_PracticeTasks;

import java.util.Arrays;

public class Items {
    public static void main(String[] args) {

        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};

        int indexOfGloves = 0;
        for (int i = 0; i < items.length; i++) {
            String itemName = items[i];
            if (itemName.equals("Gloves")){
                indexOfGloves=i;
            }
        }

        System.out.println(indexOfGloves);

        if (Arrays.toString(items).contains("iPad")){
            System.out.println("iPad is contained in the item list");
        }

        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i] + " - £" + prices[i] + " - #" + itemIDs[i]);

        }


    }
}

/*
3. Given the following arrays:
        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};
        1. find out the first index number of "Gloves"
        2. find out if "iPad" is contained in the item list
        3. Print the report of each shopping item
            name - price - #ID
 */