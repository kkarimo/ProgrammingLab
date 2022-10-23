package day23_PracticeTasks;

public class eligibleToVote {

    public static void main(String[] args) {
eligibleToVote(19, "america");
    }

    public static void eligibleToVote(int age, String country){

        if (age>=18 && country.equalsIgnoreCase( "USA")) {
            System.out.println("You are eligible to vote!");
        }else {
            System.out.println("You are not eligible to vote!");
        }
    }


}
/*
4. create a method that can check if a person is eligible to vote
			Ex:
				eligibleToVote(19, "USA");

			output:
				You are not eligible to vote!

 */