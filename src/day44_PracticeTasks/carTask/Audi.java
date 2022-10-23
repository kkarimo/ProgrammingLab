package day44_PracticeTasks.carTask;

public class Audi extends Car implements AutoPark{

    public Audi(String model, double price, String colour) {
        super("Audi", model, price, colour);
    }

    @Override
    public void start() {

    }

    @Override
    public void drive() {
        System.out.println(getMake() + " " + getModel() + " is driving fast");
    }

    @Override
    public void autoPark() {
        System.out.println(getMake()+ " " + getModel() + " has auto park feature");
    }
}
/*
8. Create two sub class of Car named Audi &  Mercedes that implements AutoPark interface
 */