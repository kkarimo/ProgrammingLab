package day27_PracticeTasks;

public class UpperLowerEqual {

    public static void main(String[] args) {

        String str = "JAVA kasa";

        int upper = 0;
        int lower = 0;
        for (char each : str.toCharArray()) {
            if(Character.isUpperCase(each)){
                upper++;
            }

            if (Character.isLowerCase(each)){
                lower++;
            }
        }

        if(upper==lower){
            System.out.println(true);
        }else {
            System.out.println(false);
        }

    }
}
/*
4. Write program that returns true if the total number of upper case characters are equal to total number of Lowercase
    characters of a string
		Ex:
			str = "JAVA java";

		output:
			true

 */