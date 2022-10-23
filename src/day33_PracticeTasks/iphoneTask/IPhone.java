package day33_PracticeTasks.iphoneTask;

public class IPhone {

    public String model;
    public double price;
    public String colour;
    public String size;

    public static String brand = "Apple";
    public static String OS = "iOS";
    public static String madeIn = "China";

    public IPhone(String model, double price, String colour, String size) {
        this.model = model;
        this.price = price;
        this.colour = colour;
        this.size = size;
    }

    public void faceTime(long phoneNumber){
        System.out.println(model + " is facetiming with number " + phoneNumber);
    }

    public void faceTime(String email){
        System.out.println(model + " is facetiming with number " + email);
    }

    public void call(long phoneNumber){
        System.out.println(model + " is calling the number " + phoneNumber);
    }

    public void text(long phoneNumber){
        System.out.println(model + " is texting to " + phoneNumber);
    }

    public String toString() {
        return "IPhone{" +
                "model='" + model + '\'' +
                ", price= £" + price +
                ", colour='" + colour + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
/*
1. Creta a class named IPhone:

				Attributes:
					instance: model, price, color, size
					statics: brand, OS, madeIn

				Add a constructor that can set All the fields (instances)

				Actions:
					faceTime(long phoneNumber)
					faceTime(String email)
					call(long phoneNumber)
					text(long phoneNumber)
					toString()
 */