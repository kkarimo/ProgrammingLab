package day38_PracticeTasks.animalTask;

public class Cat extends Animal{

    public Cat(String name, String breed, int age, char gender, String size, String colour) {
        super(name, breed, age, gender, size, colour);
    }

    public void eat(){
        System.out.println(name + " is eating cat food");
    }
}
/*
1. Cat
					eat(): eats cat food
 */