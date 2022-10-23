package day44_PracticeTasks.carTask;

public abstract class Car {

    private String make, model;
    private final int year = 2022;
    private double price;
    private String colour;

    public Car(String make, String model, double price, String colour) {
        setMake(make);
        setModel(model);
        setPrice(price);
        setColour(colour);
    }

    public void setMake(String make) {
        if (make == null || make.isEmpty()){
            throw new RuntimeException("Invalid make: " + make);
        }
        this.make = make;
    }

    public void setModel(String model) {
        if (model == null || model.isEmpty()){
            throw new RuntimeException("Invalid model: " + model);
        }
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price<=0){
            throw new RuntimeException("Invalid price: " + price);
        }
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        if (colour==null || colour.isEmpty()){
            throw new RuntimeException("Invalid colour: " + colour);
        }
        this.colour = colour;
    }


    public abstract void start();

    public abstract void drive();

    public void stop(){
        System.out.println(make + " " + model + " stops when the brake is released");
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=£" + price +
                ", colour='" + colour + '\'' +
                '}';
    }
}
/*
1. Create an Abstract class named Car:
				Variables:
					make (final), model (final), year (final), price, color

				Encapsulate all the fields

				Add a constructor that can set all the fields

				Condition for setting the fields:
						1. make, model, color can not be null
						2. make, model, color can not be empty
						2. year can not be less than 1886
						2. price can not be negative

					If invalid arguments are given for setting the instances, then manually throw an exception

				abstract methods:
					start();
					drive();

				none abstract methods:
					stop()
					toString()
 */