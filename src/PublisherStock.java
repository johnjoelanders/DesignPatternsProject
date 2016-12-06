import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PublisherStock {
    public List<BasicBook> books = new ArrayList<>();
    Random random = new Random();

    public PublisherStock() {
        BasicBook b1 = new BasicBook("test1", "j.k rowling", "scholastic", 0.2, 143955493L,3);
        BasicBook b2 = new BasicBook("test2", "j.k rowling", "scholastic", 0.2, 143955493L,3);
        BasicBook b3 = new BasicBook("test3", "j.k rowling", "scholastic", 0.2, 143955493L,3);
        BasicBook b4 = new BasicBook("test4", "j.k rowling", "scholastic", 0.2, 143955493L,3);

        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
    }
    public BasicBook buy(){
        int i = random.nextInt(books.size());
        BasicBook newBook = books.get(i);
        books.remove(i);
        return newBook;
    }
}
