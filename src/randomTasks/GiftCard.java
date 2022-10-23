package randomTasks;

import java.util.Scanner;

public class GiftCard {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String item = scan.nextLine();
        int giftCard = 100;

        switch (item){
            case "Blanket":
                System.out.println("Thank you for your purchase! ");
                System.out.println("Your current balance is: " + (giftCard - 60)+"$" );
                break;
            case "Charger":
            case "Hat":
                System.out.println("Thank you for your purchase! ");
                System.out.println("Your current balance is: " + (giftCard - 25)+"$" );
                break;
            case "Headphones":
                System.out.println("Thank you for your purchase! ");
                System.out.println("Your current balance is: " + (giftCard - 30)+"$" );
                break;
            case "Laptop":
            case "Smartphone":
                System.out.println("Sorry, not enough funds on your gift card!");
                break;
            case "Pants":
                System.out.println("Thank you for your purchase! ");
                System.out.println("Your current balance is: " + (giftCard - 50)+"$" );
                break;
            case "Pillow":
                System.out.println("Thank you for your purchase! ");
                System.out.println("Your current balance is: " + (giftCard - 40)+"$" );
                break;
            case "Socks":
                System.out.println("Thank you for your purchase! ");
                System.out.println("Your current balance is: " + (giftCard - 5)+"$" );
                break;
            case "USB cable":
                System.out.println("Thank you for your purchase! ");
                System.out.println("Your current balance is: " + (giftCard - 10)+"$" );
                break;
            default:
                System.out.println("Invalid item!");

        }

        scan.close();


        }
    }


/*
Let's say I've got a 100$ gift card and you want to buy something in your online store . Write a program that
will help me to buy something and display leftover balance after purchase.

If item is not in the list, display message: "Invalid item!".
If price is more than 100$, display message: "Sorry, not enough funds on your gift card!".
List of items Blanket - 60$ Charger - 25$ Hat - 25$ Headphones - 30$ Laptop - 200$ Pants - 50$ Pillow - 40$
Smartphone - 1000$ Socks - 5$ USB cable - 10$

Hint: if/ else if / else or switch statement

Examples:

input: Hat
output:
Thank you for your purchase!
Your current balance is: 75$
input: Pants
output:
Thank you for your purchase!
Your current balance is: 50$
input: Laptop
Output:
Sorry, not enough funds on your gift card!
input: Cupcake
output: Invalid item!
 */