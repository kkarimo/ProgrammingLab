package day33_PracticeTasks.carTask;

public class Test {
    public static void main(String[] args) {

        Car car1 = new Car("Nissan", "Pulsar", "Blue", 2016, 6500);
        Car car2 = new Car("Tesla", "Model X", "White", 2023, 90000);

        System.out.println(car1);
        System.out.println(car2);

        car1.drive();
        car2.drive();

    }
}
