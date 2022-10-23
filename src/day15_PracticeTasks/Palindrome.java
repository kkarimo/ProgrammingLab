package day15_PracticeTasks;

public class Palindrome {
    public static void main(String[] args) {

        String str1 = "Level";

        String str2 = "";

        for (int i = str1.length()-1; i >=0 ; i--) {
            char ch = str1.charAt(i);
            str2 +=ch;

        }

        if (str1.equalsIgnoreCase(str2)){
            System.out.println(true);
        }else {
            System.out.println(false);
        }


        }



    }

/*
8. Write a program that can check if the given String is palindrome

			Ex:
				input:
					Level

				output:
					true


				input:
					Anna

				output:
					true
 */