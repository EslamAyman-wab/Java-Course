package A_Course.A_Challenges.C_Ch.Ch_27;

import java.util.ArrayList;
import java.util.List;

public class Store {
    public static void main(String[] args) {

        List<ProductForSale> list = new ArrayList<>();

        ProductForSale book = new Book("Book", 10, "java Basics");

        list.add(book);

        for (ProductForSale item : list) {
            item.showDetails();
        }

        
    }

}
                                                                             