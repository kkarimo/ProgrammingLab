package day36_PracticeTasks.phoneTask;

public class Phone {

    public String brand, model, size;
    public double price;
    public String colour;

    public void setInfo(String brand, String model, String size, double price, String colour) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.price = price;
        this.colour = colour;
    }

    public void call(long phoneNumber) {
        System.out.println(brand +  " is calling " + phoneNumber);
    }

    public void text(long phoneNumber) {
        System.out.println(brand +  " is texting " + phoneNumber);
    }

    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price= £" + price +
                ", colour='" + colour + '\'' +
                '}';
    }
}

/*
1.1 Create a class named Phone:
				Variables:
					brand, model, size, price, color

				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					toString()

 */