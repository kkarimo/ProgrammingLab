package day36_PracticeTasks.employeeTask;

public class Test {
    public static void main(String[] args) {

        Tester tester = new Tester();
        tester.setInfo("Khurshid", "Automation Tester", 'M', 38, 1234, 85000);
        System.out.println(tester);
        tester.testing();
        tester.creatingTicket();

        System.out.println("-----------------------------------------------");

        Developer developer = new Developer();
        developer.setInfo("Muhtar", "Java Developer", 'M', 30, 4321, 100000);
        System.out.println(developer);
        developer.coding();
        developer.fixingBugs();

        System.out.println("-----------------------------------------------");

        Teacher teacher = new Teacher();
        teacher.setInfo("Asya", "SDET Teacher", 'F', 32, 9876, 90000);
        System.out.println(teacher);
        teacher.teaching();

        System.out.println("-----------------------------------------------");

        Driver driver = new Driver();
        driver.setInfo("Boho", "Driver", 'M', 36, 5487, 50000);
        System.out.println(driver);
        driver.driving();

    }
}
