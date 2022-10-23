package day39_PracticeTasks.animalTask;

public class FriendlyAnimal extends Animal{

    private static boolean isWild = false,
                            isFriendly = true,
                            isPlayable = true;

    public FriendlyAnimal(String name, String breed, char gender, int age, String size, String colour) {
        super(name, breed, gender, age, size, colour);
    }

    public void play(){
        System.out.println(getName() + " is playing");
    }

    public void pet(){
        System.out.println(getName() + " likes being petted");
    }

}
/*
2. Create a sub class of Animal named FriendlyAnimal:
				Variable:
					isWild
					isFriendly
					isPlayable

				Extra methods:
					play()
					pet()
 */