package day10_PracticeTasks;

public class GradeLevel {
    public static void main(String[] args) {

        byte year = 19;
        String schoolType;

        if (year>=1 && year<=18){
            if(year>=1 && year<=5){
                schoolType = "Elementary school";
            } else if (year>=6 && year<=8) {
                schoolType = "Middle school";
            } else if (year>=9 && year<=12) {
                schoolType = "High school";
            } else if (year>=13 && year<=16) {
                schoolType = "College";
            }else {
                schoolType = "Grad School";
            }


        }else{
            schoolType = "Invalid grade level given";
        }

        System.out.println("schoolType = " + schoolType);




    }
}

/*
1. Create a class called GradeLevel, Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

                    For Any Other grade: Invalid grade level given

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */