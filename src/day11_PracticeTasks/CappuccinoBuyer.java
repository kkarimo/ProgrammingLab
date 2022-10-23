package day11_PracticeTasks;

import javax.swing.*;

public class CappuccinoBuyer {
    public static void main(String[] args) {

        String size = "Tall";


        if(size=="Tall"){
            System.out.println("price is $3.69" + "\n" + "90 calories");
        } else if (size=="Grande") {
            System.out.println("price is $3.99" + "\n" + "120 calories");
        }else if (size=="Venti") {
            System.out.println("price is $4.29" + "\n" + "150 calories");
        }else{
            System.out.println("Invalid Size");
        }

        System.out.println("------------------------");

        switch (size){
            case "Tall":
                System.out.println("price is $3.69" + "\n" + "90 calories");
                break;
            case "Grande":
                System.out.println("price is $3.99" + "\n" + "120 calories");
                break;
            case "Venti":
                System.out.println("price is $4.29" + "\n" + "150 calories");
                break;
            default:
                System.out.println("Invalid Size");
                break;




        }


    }
}

/*
1. Create a class called  CappuccinoBuyer. A variable named Size is given, write a program that can display the price and calories of cappuccino
			Valid sizes are tall, grande, venti and their price & calories are:

						tall:
								price is $3.69
								90 calories

						grande:
								price is $3.99;
								120 calories

						venti:
								price is $4.29
								150 calories

			If the size is invalid then the output should be "Invalid Size"


			Note:
			 	Solution 1: use if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed
 */