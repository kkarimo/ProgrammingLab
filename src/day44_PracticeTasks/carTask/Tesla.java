package day44_PracticeTasks.carTask;

public class Tesla extends Car implements AutoPark, AutoPilot{

    public Tesla(String model, double price, String colour) {
        super("Tesla", model, price, colour);
    }

    @Override
    public void start() {
        System.out.println("Say start to start " + getMake() + " " + getModel());
    }

    @Override
    public void drive() {
        System.out.println(getMake() + " " + getModel() + " can drive up to 60 miles per hour under 2.5 seconds");
    }

    @Override
    public void autoPark() {
        System.out.println(getMake() + " " + getModel() + " can park by itself");
    }

    @Override
    public void selfDrive() {
        System.out.println(getMake() + " " + getModel() + " is on self drive mode");
    }
}
/*
9. Create Two sub classes of Car named Tesla & Nio that implements AutoPark & AutoPilot interfaces
 */