import java.util.ArrayList;
import java.util.List;

public class Library implements Subject {
    private List<Observer> observers = new ArrayList<Observer>();
    public List<BasicBook> books = new ArrayList<>();
    public List<Book> books2 = new ArrayList<>();
    private String updateBookTitle;

    public Library() {
        Book book = new Hardback(new Pictures(new BasicBook("Test", "J.K. Rowling", "Scholastic", 0.2, 143955493L, 1)));
        books2.add(book);

        BasicBook book1 = new BasicBook(book.getTitle(), book.getAuthor(), book.getPublisher(), book.getCost(), book.getIsbn(), book.getNoOfCopies());
        books.add(book1);
    }

    public void buyBook(String title) {
        for (BasicBook book : books) {
            if (book.getTitle() == title) {
                book.setNoOfCopies(book.getNoOfCopies() - 1);
                if (book.getNoOfCopies() <= 2) {
                    updateBookTitle = title;
                    notifyObservers();
                }
            }
        }
    }

    public void addBook(String title) {
        for (BasicBook book : books) {
            if (book.getTitle() == title) {
                int numOfBooks1 = book.getNoOfCopies();
                System.out.println("Number of books before : " + numOfBooks1);
                book.setNoOfCopies(book.getNoOfCopies() + 1);
                int numOfBooks = book.getNoOfCopies();
                System.out.println("Number of books after: " + numOfBooks);
            }
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
}

