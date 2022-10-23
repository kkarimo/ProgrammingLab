package day38_PracticeTasks.animalTask;

public class Eagle extends Animal {
    public Eagle(String name, String breed, int age, char gender, String size, String colour) {
        super(name, breed, age, gender, size, colour);
    }

    @Override
    public void eat() {
        System.out.println(name + " eats snake");
    }

}
/*
4. Eagle
					eat(): eats snake
 */