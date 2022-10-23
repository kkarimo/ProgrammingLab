package day38_PracticeTasks.animalTask;

public class Tiger extends Animal {

    public Tiger(String name, String breed, int age, char gender, String size, String colour) {
        super(name, breed, age, gender, size, colour);
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating dog deer");
    }

}
/*
3. Tiger
					eat(): eats deer
 */