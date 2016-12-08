
class NumberOfPages extends BookDecorator {
    NumberOfPages(Book book) {
        super(book);
    }

    public double getCost() {
        return book.getCost() + 4.00;
    }
}