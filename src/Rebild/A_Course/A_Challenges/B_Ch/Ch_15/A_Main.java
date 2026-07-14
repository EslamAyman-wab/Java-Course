package Rebild.A_Course.A_Challenges.B_Ch.Ch_15;

public class A_Main {
    public static void main(String[] args) {


        Employee eslam = new Employee("Eslam", "23/07/2002", "19/09/2010");
        System.out.println(eslam);
        System.out.println("Age = " + eslam.getAge());
        System.out.println("Pay = " + eslam.callectPay());

        Employee eslam2 = new Employee("Eslam2", "23/11/2002", "11/11/2011");
        System.out.println(eslam2);
        System.out.println("Age = " + eslam2.getAge());
        System.out.println("Pay = " + eslam2.callectPay());


        Salaried_Emplyee eslam3 = new Salaried_Emplyee("Eslam3", "23/11/2002",
                "11/11/2011", 35000);
        System.out.println(eslam3);
        System.out.println("Age = " + eslam3.getAge());
        System.out.println("Pay = " + eslam3.callectPay());
    }
}
