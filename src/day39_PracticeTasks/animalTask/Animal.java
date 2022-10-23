package day39_PracticeTasks.animalTask;

public class Animal {

    private String name, breed;
    private char gender;
    private int age;
    private String size, colour;

    public Animal(String name, String breed, char gender, int age, String size, String colour) {
        setName(name);
        setBreed(breed);
        setGender(gender);
        setAge(age);
        setSize(size);
        setColour(colour);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty() || name.isBlank()) {
            System.err.println("Invalid name: " + name);
            System.exit(1);
        }
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        if (breed == null || breed.isEmpty() || breed.isBlank()) {
            System.err.println("Invalid breed: " + breed);
            System.exit(1);
        }
        this.breed = breed;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (!(gender == 'M' || gender == 'F')) {
            System.err.println("Invalid gender: " + gender);
            System.exit(1);
        }
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.err.println("Invalid age: " + age);
            System.exit(1);
        }
        this.age = age;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        if (colour == null || colour.isEmpty() || colour.isBlank()) {
            System.err.println("Invalid colour: " + colour);
            System.exit(1);
        }
        this.colour = colour;
    }

    public void eat(){
        System.out.println(name+" " + breed + " is eating");
    }

    public void drink(){
        System.out.println(name+" " + breed + " is drinking");
    }

    public void sleep(){
        System.out.println(name+" " + breed + " is sleeping");
    }

    public void move(){
        System.out.println(name+" " + breed + " is moving");
    }

    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }
}
/*
1. Create a class named Animal:
			variables:
				name, breed, gender, age, size, color

			Encapsulate all the fields

			Add a constructor to set all the fields

					Conditions:
						1. name, breed and color can not be null (if obj == null means it's error)
						2. name, breed and color can not be empty or can not be blank
						3. gender should only be set to either 'M' or 'F'
						4. age can not be set to negative

			Methods:
				eat()
				drink()
				sleep()
				move()
				toString()
 */