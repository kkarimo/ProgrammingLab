package day36_PracticeTasks.phoneTask;

public class Test {
    public static void main(String[] args) {

        IPhone iPhone = new IPhone();
        iPhone.setInfo("iPhone", "13 pro", "max", 1000, "Sierra Blue");
        System.out.println(iPhone);
        iPhone.call(798283005);
        iPhone.text(798283005);
        iPhone.faceTime(798283005);
        iPhone.faceTime("kkarimov@uw.co.uk");

        System.out.println("---------------------------------------------------------------");

        Samsung samsung = new Samsung();
        samsung.setInfo("Samsung", "Galaxy s11", "Large", 800, "Gold");
        System.out.println(samsung);
        samsung.call(798283005);
        samsung.text(798283005);
        samsung.freeze();

        System.out.println("---------------------------------------------------------------");

        Nokia nokia = new Nokia();
        nokia.setInfo("Nokia", "103", "Medium", 150, "Blue");
        System.out.println(nokia);
        nokia.call(798283005);
        nokia.text(798283005);
        nokia.selfDefence();


    }
}
