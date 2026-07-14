package Rebild.D_Test_Area.A_tests.Test_05;

public class Main {
    public static void main(String[] args) {
//
//        test c1 = new test();
//        c1.setRadius(3.0);
//        c1.setColor("Black");
//        System.out.println("c1 = "+c1.getArea());
//
//        test c2 = new test();
//        c2.setRadius(2.0);
//        c2.setColor("Blue");
//        System.out.println("C2 = "+c2.getCircumference());

//        test a1 = new test();
//
//        a1.insert(4451238,"Mohammed",10000);
//        a1.deposit(12000);
//        a1.withdraw(2000);
//        a1.checkBlance();
//        a1.toString();
//
//        test p1 = new test("Eslam", "test ",1000,200,4);
//
//        System.out.println();

        test p1 = new test("Eslam", "test ");
        System.out.println(p1.logIn(1, "test"));
        System.out.println(p1.validatePassword("test"));
        System.out.println(p1.toString());

    }
}
