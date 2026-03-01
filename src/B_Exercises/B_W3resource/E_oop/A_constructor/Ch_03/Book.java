package B_Exercises.B_W3resource.E_oop.A_constructor.Ch_03;

public class Book {

    private String title;
    private String author;
    private double price;

    public Book() {
        title = "Unknown";
        author = "Unkonwn";
        price = 0.0;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Book(String title, String author, double price) {
        this(title,author);
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
