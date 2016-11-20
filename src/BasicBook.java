
public class BasicBook extends Book {
    private String title;
    private String author;
    private String publisher;
    private double cost;
    private long isbn;
    private int noOfCopies;

    public BasicBook(String title, String author, String publisher,double cost, long isbn, int noOfCopies) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.cost = cost;
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
