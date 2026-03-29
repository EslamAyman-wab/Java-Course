package A_Course.A_Challenges.C_Ch.Ch_27;

public abstract class ProductForSale {

    private String type;
    private double price;
    private String description;

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public double getSalesPrice(int quantity) {

        return (price * quantity);
    }

    public void printPricedItem(int quantity) {

        System.out.println(quantity + " X " + " " + description + " = " + getSalesPrice(quantity));
    }

    public abstract void showDetails();
}

class OrderItem {
    private ProductForSale product;
    private int quantity;

    public OrderItem(ProductForSale product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public void printOrderItem() {
        product.printPricedItem(quantity);
    }
}

