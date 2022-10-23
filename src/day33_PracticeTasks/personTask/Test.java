package day33_PracticeTasks.personTask;

public class Test {
    public static void main(String[] args) {

     Person person1 = new Person("Khurshid", 38, 'M');
     Person person2 = new Person("Aziza", 33, 'F');

        System.out.println(person1);
        System.out.println(person2);

        person1.eat("doner");
        person2.drink("juice");

        person1.sleep();

        System.out.println(person1.name + " is human = " +  Person.isHuman);
        System.out.println(person2.name + " is " + person2.age + " years old");
        System.out.println(person2.name + " has " + Person.numberOfHead + " head");
        System.out.println(person1.name + " has wings = " + Person.hasWings);


    }
}
