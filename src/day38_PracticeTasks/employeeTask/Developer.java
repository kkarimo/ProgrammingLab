package day38_PracticeTasks.employeeTask;

public class Developer extends Employee{


    public Developer(String name, int age, char gender, int id, String jobTitle, double salary, String companyName) {
        super(name, age, gender, id, jobTitle, salary, companyName);
    }


    @Override
    public void work() {
        System.out.println(jobTitle+" "+name+" is writing a code");
    }
}
