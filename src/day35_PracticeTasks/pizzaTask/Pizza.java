package day35_PracticeTasks.pizzaTask;

public class Pizza {
    private String size;
    private int numberOfCheeseTopping, numberOfPepperoniTopping;

        public Pizza(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
            setSize(size);
            setNumberOfCheeseTopping(numberOfCheeseTopping);
            setNumberOfPepperoniTopping(numberOfPepperoniTopping);
        }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if ( !(size.equals("small")||size.equals("medium")||size.equals("large")) ){
            System.out.println(size + " is invalid size");
            System.exit(0);
        }
        this.size = size;
    }

    public int getNumberOfCheeseTopping() {
        return numberOfCheeseTopping;
    }

    public void setNumberOfCheeseTopping(int numberOfCheeseTopping) {
        if (numberOfCheeseTopping<=0){
            System.out.println("Invalid");
            System.exit(0);
        }
        if (size.equals("small")){
            if (numberOfCheeseTopping>3){
                System.out.println("Number of cheese topping for small pizza can not more than 3");
                System.exit(0);
            }
        }
        if (size.equals("medium")){
            if (numberOfCheeseTopping>4){
                System.out.println("Number of cheese topping for medium pizza can not more than 4");
                System.exit(0);
            }
        }
        if (size.equals("large")){
            if (numberOfCheeseTopping>5){
                System.out.println("Number of cheese topping for large pizza can not more than 5");
                System.exit(0);
            }
        }
        this.numberOfCheeseTopping = numberOfCheeseTopping;
    }

    public int getNumberOfPepperoniTopping() {
        return numberOfPepperoniTopping;
    }

    public void setNumberOfPepperoniTopping(int numberOfPepperoniTopping) {
        if (numberOfPepperoniTopping<=0){
            System.out.println("Invalid");
            System.exit(0);
        }
        if (size.equals("small")){
            if (numberOfPepperoniTopping>4){
                System.out.println("Number of pepperoni topping for small pizza can not more than 4");
                System.exit(0);
            }
        }
        if (size.equals("medium")){
            if (numberOfPepperoniTopping>4){
                System.out.println("Number of pepperoni topping for medium pizza can not more than 5");
                System.exit(0);
            }
        }
        if (size.equals("large")){
            if (numberOfPepperoniTopping>4){
                System.out.println("Number of pepperoni topping for small pizza can not more than 5");
                System.exit(0);
            }
        }
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public double calcCost(){
        double cost = 0;

        if (size.equals("small")){
            cost = 10 + 2 * numberOfCheeseTopping*numberOfPepperoniTopping;
        }
        if (size.equals("medium")){
            cost = 12 + 2 * numberOfCheeseTopping*numberOfPepperoniTopping;
        }
        if (size.equals("large")){
            cost = 14 + 2 * numberOfCheeseTopping*numberOfPepperoniTopping;
        }
        return cost;
    }

    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", total price = $" + calcCost() +
                '}';
    }
}
