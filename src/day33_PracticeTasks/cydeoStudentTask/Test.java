package day33_PracticeTasks.cydeoStudentTask;

public class Test {
    public static void main(String[] args) {

        CydeoStudent student1 = new CydeoStudent("Khurshid", 38, 'M', 1234,'A',9,16);

        System.out.println(student1);
        student1.study();
        student1.attendClass();
        CydeoStudent.printSchoolName();
        CydeoStudent.printProgLanguage();


    }
}
