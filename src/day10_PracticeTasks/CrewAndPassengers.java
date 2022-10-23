package day10_PracticeTasks;

public class CrewAndPassengers {
    public static void main(String[] args) {

        int crew = 55;
        int passenger = 5;
        String total;

        if (crew + passenger == 50 || crew + passenger == 75 || crew + passenger == 100 ){
            if (crew + passenger == 50){
                total = "20 crew, 30 passengers";
            } else if (crew + passenger == 75) {
                total = "25 crew, 50 passengers";
            }else {
                total = "30 crew, 70 passengers";
            }


        }else {
          total = "Not valid";
        }

        System.out.println("total = " + total);



    }
}

/*
2. Create a class called CrewAndPassangers, Given a number of people on the ship (int number), determine
how many need to be crew members and how many can be passengers. Print how many of each type there should be.

            Total: 50  ====> 20 crew, 30 passengers
            Total: 75  ====> 25 crew, 50 passengers
            Total: 100 ====> 30 crew, 70 passengers
            Any other number of people on the ship is not valid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */