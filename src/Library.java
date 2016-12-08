import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Library implements Subject,BookIterator {
    private List<Observer> observers = new ArrayList<Observer>();
    public List<BasicBook> books = new ArrayList<>();
    public List<Book> books2 = new ArrayList<>();
    private String updateBookTitle;

    public Library() {
        Book book = new Hardback(new Pictures(new BasicBook("test", "j.k rowling", "scholastic", 0.2, 143955493L,3)));
        books2.add(book);

        BasicBook book1 = new BasicBook(book.getTitle(), book.getAuthor(), book.getPublisher(), book.getCost(), book.getIsbn(), book.getNoOfCopies());
        books.add(book1);
    }

    public void sellBook(String title) {
        for (BasicBook book : books) {
            if (title.equals(book.getTitle())) {
                book.setNoOfCopies(book.getNoOfCopies() - 1);
                if (book.getNoOfCopies() <= 2) {
                    updateBookTitle = title;
                    notifyObservers();
                }
            }
        }
    }

    public void getMoreCopies(String title) {
        for (BasicBook book : books) {
            if (title.equals(book.getTitle())) {
                System.out.println("Number of books before : " + book.getNoOfCopies());
                book.setNoOfCopies(book.getNoOfCopies() + 1);
                System.out.println("Number of books after: " + book.getNoOfCopies());
            }
        }
    }

    public void addToLibrary(BasicBook bookFromPublisher){
        books.add(bookFromPublisher);
        System.out.println("Added book to library");
        for(BasicBook item : books){
            System.out.println(item.getTitle());
        }
    }
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(updateBookTitle);
        }
    }

    @Override
    public Iterator createIterator() {
        return books.iterator();
    }
}

