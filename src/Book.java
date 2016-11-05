import java.util.ArrayList;
import java.util.List;

public class Book{
    private List<Observer> observers = new ArrayList<Observer>();
    private String title;
    private String author;
    private String publisher;
    private double price;
    private boolean isHardback;
    private boolean isPictures;
    private int numOfPages;
    private long isbn;
    private int noOfCopies;

    public Book(String title, String author, String publisher, double price, boolean isHardback, boolean isPictures, int numOfPages, long isbn, int noOfCopies) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
        this.isHardback = isHardback;
        this.isPictures = isPictures;
        this.numOfPages = numOfPages;
        this.isbn = isbn;
        this.noOfCopies = noOfCopies;
    }

    public String getTitle() {
        return title;
    }

    public int getNoOfCopies() {
        return noOfCopies;
    }

    public void setNoOfCopies(int noOfCopies) {
        this.noOfCopies = noOfCopies;
    }
}
