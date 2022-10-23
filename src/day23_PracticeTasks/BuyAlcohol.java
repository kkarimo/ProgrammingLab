package day23_PracticeTasks;

public class BuyAlcohol {
    public static void main(String[] args) {

        buyAlcohol(15);

    }

    public static void buyAlcohol(int age) {
        if (age >= 18) {
            System.out.println("You are eligible to buy Alcohol");
        }else {
            System.out.println("You are NOT eligible to buy Alcohol");
        }
    }

}

/*
3. create a method that can check if a person is eligible to buy alcohol
 */