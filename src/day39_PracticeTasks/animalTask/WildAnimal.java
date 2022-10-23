package day39_PracticeTasks.animalTask;

public class WildAnimal extends Animal{

    private static boolean isWild = true,
            isFriendly = false,
            isPlayable = false;

    public WildAnimal(String name, String breed, char gender, int age, String size, String colour) {
        super(name, breed, gender, age, size, colour);
    }

    public void hunt(){
        System.out.println(getName()+" is hunting");
    }
}
/*
3. Create a sub class of Animal named WildAnimal:
				Variable:
						isWild, isFriendly, isPlayable

				Extra Methods:
					hunt()
 */