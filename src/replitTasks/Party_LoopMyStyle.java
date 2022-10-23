package replitTasks;

import java.util.Scanner;

public class Party_LoopMyStyle {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String result = "";


        while (true){

            System.out.println("Please enter guest name:");
            String name = scan.next();
            result += name;

            System.out.println("Do you want to enter new guest name:");
            String answer = scan.next().toLowerCase();

            while ( !(answer.equals("yes")) ){

                if (answer.equals("yes")){
                    System.out.println("Please enter guest name:");
                    name = scan.next();
                    result += name;
                }

                if (answer.equals("no")){
                    break;
                }

                }

            if (answer.equals("no")){
                break;
            }


            }


        System.out.println("Guest's list: " + result);

        }

    }

