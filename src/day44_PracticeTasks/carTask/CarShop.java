package day44_PracticeTasks.carTask;

import java.util.Arrays;

public class CarShop {

    public static void main(String[] args) {

        Audi audi = new Audi("e-tron", 70000, "White");

        BMW bmw = new BMW("X6", 50000, "Black");

        Honda honda = new Honda("Accord", 40000, "Milk");

        Mercedes mercedes = new Mercedes("EQS SUV", 130000, "Black");

        Nio nio = new Nio("ES6", 100000, "Yellow");

        Tesla tesla = new Tesla("Model S", 120000, "Red");

        CydeoCar cydeoCar = new CydeoCar("EU9", 90000, "White");

        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(honda);
        System.out.println(mercedes);
        System.out.println(nio);
        System.out.println(tesla);
        System.out.println(cydeoCar);

        System.out.println("--------------------------------------------------");
        audi.autoPark();
        audi.drive();
        audi.start();

        System.out.println("-------------------------------------------------------");
        tesla.autoPark();
        tesla.drive();
        tesla.start();
        tesla.selfDrive();



    }
}
/*
11. Create a class named CarShop:
			Create an object from each concrete class

			Test all the functions of each objects

            Analyze the relationships between the classes
 */