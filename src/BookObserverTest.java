
public class BookObserverTest {
    public static void main(String[] args) {
        Library library = new Library();
        new OrderMore(library);
        System.out.println("Buying Book");
        library.buyBook("Test");
    }
}
