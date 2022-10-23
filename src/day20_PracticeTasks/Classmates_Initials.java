package day20_PracticeTasks;

public class Classmates_Initials {

    public static void main(String[] args) {

        String[] name = {"Maryam Wahed", "Ferida Saglam", "Zuleyha Dokuyucu", "Suleyman Sami", "Ilhan Cabuk", "Zeliha Aktan", "Tugba Duran"};


        for (int i = 0; i < name.length; i++) {
            String initials = "";

            initials += name[i].charAt(0) + "." + name[i].charAt( name[i].indexOf(" ")+1 );
            System.out.println(initials);
        }


    }
}

/*
1. create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmates in separate lines

 */