package day35_PracticeTasks.carpetTask;

public class Test {
    public static void main(String[] args) {

        Carpet carpet1 = new Carpet(5,4,10,true);
        Carpet carpet2 = new Carpet(5,4,10,false);

        System.out.println(carpet1);
        System.out.println(carpet2);
        carpet2.setPersian(true);
        System.out.println(carpet2);


    }
}
