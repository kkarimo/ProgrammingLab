package day24_PracticeTasks;

public class Palindrome {
    public static void main(String[] args) {

        String str = "aziza";

       isPalindrome(str);




    }

public static boolean isPalindrome (String str){




        boolean result = false;

    String reversed = "";

    for (int i = str.length() - 1; i >= 0; i--) {
        char ch = str.charAt(i);
        reversed += ch;
    }


    if (str.equalsIgnoreCase(reversed)){
        System.out.println("isPalindrome = " + !result);
    }else {
        System.out.println("isPalindrome = " + result);
    }

        return result;

}

}


/*
4. By using the reverse method above to create another method named isPalindrome  that passes a String parameter,
the method returns true if the string is palindrome, otherwise returns false
				Ex:
					str = "Level"
					isPalindrome(str) ===> true
 */