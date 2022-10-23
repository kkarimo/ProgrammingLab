package day44_PracticeTasks.carTask;

public class BMW extends Car{

    public BMW( String model, double price, String colour) {
        super("BMW", model, price, colour);
    }

    @Override
    public void start() {
        System.out.println("To start " + getMake() + " " + getModel() + " , you have to push the start/stop button");
    }

    @Override
    public void drive() {
        System.out.println(getMake() + " "+getModel() + " is driving slow");
    }
}

/*
7. Create a subclass of Car named BMW
 */