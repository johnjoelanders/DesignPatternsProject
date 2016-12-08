abstract class BookDecorator implements Book {
    protected Book book;

    BookDecorator(Book newBook) {
        book = newBook;
    }

    @Override
    public double getCost() {
        return book.getCost();
    }

    @Override
    public String getTitle() {
        return book.getTitle();
    }


    @Override
    public String getAuthor() {
        return book.getAuthor();
    }

    @Override
    public String getPublisher() {
        return book.getPublisher();
    }

    @Override
    public long getIsbn() {
        return book.getIsbn();
    }

    @Override
    public int getNoOfCopies() {
        return book.getNoOfCopies();
    }

}
