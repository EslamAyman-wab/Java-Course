package A_Challenges.B_Ch.Ch_16;

public class SmartKitchen {

    private Refigerator refigerator;
    private DisWasher disWasker;
    private CoffeeMaker coffeeMaker;

    public SmartKitchen() {
        refigerator = new Refigerator();
        disWasker = new DisWasher();
        coffeeMaker = new CoffeeMaker();
    }

    public Refigerator getRefigerator() {
        return refigerator;
    }

    public DisWasher getDisWasker() {
        return disWasker;
    }

    public CoffeeMaker getCoffeeMaker() {
        return coffeeMaker;
    }
}

class Refigerator {
    private boolean hasWorkeToDo;

    public void setHasWorkeToDo(boolean hasWorkeToDo) {
        this.hasWorkeToDo = hasWorkeToDo;
    }

    public void orderFood() {
        if (hasWorkeToDo) {
            System.out.println("the worke done");
            hasWorkeToDo = false;
        }
    }

}

class DisWasher {
    private boolean hasWorkeToDo;

    public void setHasWorkeToDo(boolean hasWorkeToDo) {
        this.hasWorkeToDo = hasWorkeToDo;
    }

    public void doDishes() {
        if (hasWorkeToDo) {
            System.out.println("the worke done");
            hasWorkeToDo = false;
        }
    }

}

class CoffeeMaker {
    private boolean hasWorkeToDo;

    public void setHasWorkeToDo(boolean hasWorkeToDo) {
        this.hasWorkeToDo = hasWorkeToDo;
    }

    public void makeCoffee() {
        if (hasWorkeToDo) {
            System.out.println("the worke done");
            hasWorkeToDo = false;
        }
    }

}


