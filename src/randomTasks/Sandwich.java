package randomTasks;

import java.util.Scanner;

public class Sandwich {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

       String str = scan.next();
       int count = 0;

        for (int i = 0; i < str.length() - 4; i++) {

            if ( str.substring(i, i+5).equalsIgnoreCase("bread") ){
                count++;
            }

        }


        if (count<2){
            System.out.println("nothing");
        }else {
            System.out.println( str.substring( str.indexOf("bread")+5,str.lastIndexOf("bread")  )  );
        }

        }
    }


