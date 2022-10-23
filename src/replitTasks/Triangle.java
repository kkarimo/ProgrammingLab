package replitTasks;



public class Triangle {

    public static void main(String[] args) {
        int size = 5;



        //System.out.println(size);

        for (int i = 0; i < size; i++) { // 0 < 5 now i value is 1

            for (int f = 0; f < i; f++) { // 0<1 now f value is 1
                System.out.print("*");
            }

            System.out.println("*");

        }

    }
}
