package day39_PracticeTasks.animalTask;

public class Dolphin extends FriendlyAnimal{

    public Dolphin(String name, String breed, char gender, int age, String size, String colour) {
        super(name, breed, gender, age, size, colour);
    }

    public void swim(){
        System.out.println(getName() + " is swimming under the water");
    }

    public void eat(){
        System.out.println(getName() + " is eating dolphin food");
    }
}
/*
3. Dolphin:
					Extra methods:
						swim()

 */