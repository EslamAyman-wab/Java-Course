package Rebild.A_Course.A_Challenges.C_Ch.Ch_27;

public class Furniture extends ProductForSale {

    public Furniture(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("Furniture: " + getType());
        System.out.println("Description: " + getDescription());
        System.out.println("Price: " + getPrice());
    }
}
