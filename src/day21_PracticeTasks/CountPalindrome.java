package day21_PracticeTasks;

public class CountPalindrome {
    public static void main(String[] args) {

        String[] arr = {"anna", "level", "Java", "aka"};
        int count = 0;
        for (String each : arr) {
            String result = "";

            for (int i = each.length()-1; i >=0 ; i--) {
                char ch = each.charAt(i);
                result += ch;
                if (each.equals(result)){
                    count++;
                }
            }
        }
        System.out.println(count);

    }
}

/*
 4. write a program that can count how many palindromes in an array of string
        Ex:
            {"anna", "level", "Java"};
            output:
                2
 */