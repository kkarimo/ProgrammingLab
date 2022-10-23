package day33_PracticeTasks.circleTask;

public class Test {
    public static void main(String[] args) {

        Circle circle1 = new Circle(2.5);
        System.out.println(circle1);

        Circle.printPi();
        System.out.println("Area : " + circle1.calcArea());
    }
}
