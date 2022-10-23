package day39_PracticeTasks.animalTask;

public class Dog extends FriendlyAnimal{

    public Dog(String name, String breed, char gender, int age, String size, String colour) {
        super(name, breed, gender, age, size, colour);
    }

    public void bark(){
        System.out.println(getName() + " is barking");
    }

    public void eat(){
        System.out.println(getName() + " is eating dog food");
    }

}
/*
1. Dog:
					Extra methods:
						bark()
 */