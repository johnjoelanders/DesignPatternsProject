import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class PublisherStock {
    private List<BasicBook> books = new ArrayList<>();
    private Random random = new Random();

    PublisherStock() {
        BasicBook b1 = new BasicBook("test1", "j.k rowling", "scholastic", 20.20, 143955493L, 3);
        BasicBook b2 = new BasicBook("test2", "j.k rowling", "scholastic", 10.25, 143955493L, 3);
        BasicBook b3 = new BasicBook("test3", "j.k rowling", "scholastic", 12.30, 143955493L, 3);
        BasicBook b4 = new BasicBook("test4", "j.k rowling", "scholastic", 13.50, 143955493L, 3);

        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
    }

    BasicBook buy() {
        int i = random.nextInt(books.size());
        BasicBook newBook = books.get(i);
        books.remove(i);
        return newBook;
    }
}
