import java.util.ArrayList;
import java.util.List;

public class Book {
    String name;
    String author;

    Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public static void main(String[] args) {
        Book obj1 = new Book("Avinash", "Hello");
        Book obj2 = new Book("Maurya", "World");

        List<Book> l1 = new ArrayList<>();
        l1.add(obj1);
        l1.add(obj2);


    }
}
