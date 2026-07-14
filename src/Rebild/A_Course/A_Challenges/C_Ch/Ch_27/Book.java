package Rebild.A_Course.A_Challenges.C_Ch.Ch_27;

public class Book extends ProductForSale{

    public Book(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("Book: " + getType());
        System.out.println("Description: " + getDescription());
        System.out.println("Price: " + getPrice());
    }
}
