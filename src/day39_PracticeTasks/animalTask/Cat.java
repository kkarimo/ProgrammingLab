package day39_PracticeTasks.animalTask;

public class Cat extends FriendlyAnimal{

    public Cat(String name, String breed, char gender, int age, String size, String colour) {
        super(name, breed, gender, age, size, colour);
    }

    public void scratch(){
        System.out.println(getName()+" scratching");
    }

    public void meow(){
        System.out.println(getName()+" meowing");
    }

    public void eat(){
        System.out.println(getName() + " is eating cat food");
    }

}
/*
2. Cat:
					Extra methods:
						scratch()
						meow()
 */