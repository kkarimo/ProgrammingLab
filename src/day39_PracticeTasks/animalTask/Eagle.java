package day39_PracticeTasks.animalTask;

public class Eagle extends WildAnimal{

    public Eagle(String name, String breed, char gender, int age, String size, String colour) {
        super(name, breed, gender, age, size, colour);
    }

    public void hunt(){
        System.out.println(getName() + " is hunting snakes");
    }
}
