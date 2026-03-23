package D_Test_Area.A_tests.Test_05;

public class test {
//    private double radius;
//    private String color;
//
//
//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }
//
//    public double getRadius() {
//        return radius;
//    }
//
//    public void setRadius(double radius) {
//        this.radius = radius;
//    }
//
//    public double getArea() {
//        return Math.PI * radius * radius;
//    }
//
//    public double getCircumference() {
//        return Math.PI * 2 * radius;
//    }
//
//    @Override
//    public String toString() {
//        return "test{" + "radius=" + radius + ", color='" + color + '\'' + '}';
//    }

//    private int AccountNo;
//    private String Name;
//    private float Amount;
//
//    public void insert(int a, String n, float amt) {
//        this.AccountNo = a;
//        this.Name = n;
//        this.Amount = amt;
//    }
//
//    public void deposit(float amt) {
//        this.Amount = this.Amount + amt;
//        System.out.println(amt + "The Deposit");
//    }
//
//    public void withdraw(float amt) {
//        if (Amount < amt) {
//            System.out.println("You don't have enght limet ");
//        } else {
//            this.Amount = this.Amount - amt;
//            System.out.println(amt + "The withdraw");
//        }
//    }
//
//    public void checkBlance() {
//        System.out.println("Balance = " + this.Amount);
//    }
//
//    @Override
//    public String toString() {
//        return "test{" +
//                "AccountNo=" + AccountNo +
//                ", Name='" + Name + '\'' +
//                ", Amount=" + Amount +
//                '}';
//    }
//
//    private String name;
//    private String description;
//    private float price;
//    private int quantity;
//    private float discount;
//
//    public test(String name, String description, float price, int quantity, float discount) {
//        this.name = name;
//        this.description = description;
//        this.price = price;
//        this.quantity = quantity;
//        this.discount = discount;
//    }

    private int no;
    private String name;
    private String passwore;
    private boolean loggedIn;
    private static int count = 1;
    private static String colloge = "IT";
    private static int minPassworeLength = 6;

    public test(String name, String passwore) {
        this.no = count;
        this.name = name;
        this.passwore = passwore;
        count++;
    }

    public boolean logIn(int enteredNo, String enterredPassword) {

        if (enteredNo == no && enterredPassword.equals(passwore)) {
            loggedIn = true;
            return true;
        } else {
            return false;
        }

    }

    public static boolean validatePassword(String password){
        return password.length() >= minPassworeLength;
    }

    @Override
    public String toString() {
        return "test{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", passwore='" + passwore + '\'' +
                ", loggedIn=" + loggedIn +
                '}';
    }
}

