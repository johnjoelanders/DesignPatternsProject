
class Hardback extends BookDecorator {
    Hardback(Book book) {
        super(book);
    }

    public double getCost() {
        return book.getCost() + 12.00;
    }
}
