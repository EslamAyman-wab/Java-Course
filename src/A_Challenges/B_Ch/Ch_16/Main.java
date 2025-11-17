package A_Challenges.B_Ch.Ch_16;

public class Main {
    public static void main(String[] args) {

        SmartKitchen kitchen = new SmartKitchen();


        kitchen.getCoffeeMaker().setHasWorkeToDo(true);
        kitchen.getDisWasker().setHasWorkeToDo(true);
        kitchen.getRefigerator().setHasWorkeToDo(true);



        kitchen.getDisWasker().doDishes();
        kitchen.getRefigerator().orderFood();
        kitchen.getCoffeeMaker().makeCoffee();



    }

}
