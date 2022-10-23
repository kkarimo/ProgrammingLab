package day38_PracticeTasks.animalTask;

public class Dog extends Animal{

    public Dog(String name, String breed, int age, char gender, String size, String colour) {
        super(name, breed, age, gender, size, colour);
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating dog food");
    }
}
/*
2. Dog
					eat(): eats dog food

 */