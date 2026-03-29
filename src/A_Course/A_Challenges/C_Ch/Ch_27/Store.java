package A_Course.A_Challenges.C_Ch.Ch_27;

import java.util.ArrayList;
import java.util.List;

public class Store {
    public static void main(String[] args) {

        List<ProductForSale> list = new ArrayList<>();

        ProductForSale book = new Book("Book", 10, "java Basics");
        ProductForSale desk = new Furniture("Desk", 100, "wooden desk");

        list.add(book);
        list.add(desk);

        for (ProductForSale item : list) {
            System.out.println("-".repeat(30));
            item.showDetails();
            item.printPricedItem(2);
        }

        System.out.println("\nTesting Orders:");
        List<OrderItem> order = new ArrayList<>();
        order.add(new OrderItem(book, 3));
        order.add(new OrderItem(desk, 1));

        for (OrderItem item : order) {
            item.printOrderItem();
        }

        
    }

}
                                                                             