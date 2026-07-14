package Rebild.B_Exercises.B_W3resource.E_oop.A_constructor.Ch_03;

//3. Constructor Overloading
public class Main {
    public static void main(String[] args) {

        Book book = new Book("first", "me", 200);

        System.out.println("Book Title: " + book.getTitle());
        System.out.println("Book Author: " + book.getAuthor());
        System.out.println("Book Price: " + book.getPrice());

    }
}
