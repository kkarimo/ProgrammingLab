package day13_PracticeTasks;



public class StringWithThreeCharacters {

    public static void main(String[] args) {



        String str = "";

        if (str.isEmpty()){
            System.out.println(": string is empty");
        } else if (str.length()>3) {
            System.out.print( ""  + str.charAt(  str.length() -3) + str.charAt(  str.length() -2) + str.charAt(  str.length() -1)  );
        }else{
            System.out.println(str);
        }

    }
}

/*
5. Write a program that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than or equal 3 characters, print the string itself
 */