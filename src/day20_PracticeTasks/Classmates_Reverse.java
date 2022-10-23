package day20_PracticeTasks;

public class Classmates_Reverse {
    public static void main(String[] args) {

        String[] classmates = {"Maryam Wahed", "Ferida Saglam", "Zuleyha Dokuyucu", "Suleyman Sami", "Ilhan Cabuk", "Zeliha Aktan", "Tugba Duran"};

        for (int j = 0; j < classmates.length; j++) {

            String name = classmates[j];
            String reverse = "";
            for (int i = name.length()-1; i >=0 ; i--) {
                char ch = classmates[j].charAt(i);
                reverse += ch;
            }

            System.out.println(reverse);
        }



    }
}

/*
2. create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}
        		output:
        			avaJ
        			nohtyp
        			#c
 */