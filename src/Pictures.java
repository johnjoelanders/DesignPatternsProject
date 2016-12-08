
class Pictures extends BookDecorator {
    Pictures(Book book) {
        super(book);
    }

    public double getCost() {
        return book.getCost() + 22.00;
    }
}
