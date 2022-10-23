package day39_PracticeTasks.animalTask;

public class Parrot extends FriendlyAnimal{

    public Parrot(String name, String breed, char gender, int age, String size, String colour) {
        super(name, breed, gender, age, size, colour);
    }

    public void fly(){
        System.out.println(getName() + " is flying");
    }

    public void sing(){
        System.out.println(getName() + " is singing");
    }

    public void eat(){
        System.out.println(getName() + " is eating parrot food");
    }

}
/*
4. Parrot:
					Extra methods:
						fly()
						sing()
 */