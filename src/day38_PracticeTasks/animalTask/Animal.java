package day38_PracticeTasks.animalTask;

public class Animal {

    public String name, breed;
    public int age;
    public char gender;
    public String size, colour;

    public Animal(String name, String breed, int age, char gender, String size, String colour) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.gender = gender;
        this.size = size;
        this.colour = colour;
    }

    public void eat(){
        System.out.println(name + " is eating");
    }

    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }
}
/*
1. Create a class named Animal:
			Variables:
				name, breed, age, gender, size, color

			Add a constructor to set all the fields

			methods:
				eat()
				toString()
 */