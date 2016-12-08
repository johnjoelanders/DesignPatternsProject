class BasicBook implements Book {
    private String title;
    private String author;
    private String publisher;
    private double cost;
    private long isbn;
    private int noOfCopies;

    BasicBook(String title, String author, String publisher, double cost, long isbn, int noOfCopies) {
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

    void setNoOfCopies(int noOfCopies) {
        this.noOfCopies = noOfCopies;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public String getPublisher() {
        return publisher;
    }

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public long getIsbn() {
        return isbn;
    }
}
