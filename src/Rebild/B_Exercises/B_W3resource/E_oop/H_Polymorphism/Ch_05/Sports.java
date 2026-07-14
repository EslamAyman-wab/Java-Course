package Rebild.B_Exercises.B_W3resource.E_oop.H_Polymorphism.Ch_05;

public abstract class Sports {

    public abstract  void play();
}

class Football extends Sports {
    @Override
    public void play() {
        System.out.println("Playing Football");
    }
}

class Basketball extends Sports {

    @Override
    public void play() {
        System.out.println("Playing Basketball");
    }
}

class Rugby extends Sports {
    @Override
    public void play() {
        System.out.println("Playing Rugby");
    }
}