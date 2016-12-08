
class BuyBook implements OrderFromPublisher {
    private PublisherStock pbStock;

    BuyBook(PublisherStock pbStock) {
        this.pbStock = pbStock;
    }

    @Override
    public void order(Library library) {
        BasicBook bookFromPublisher = pbStock.buy();
        library.addToLibrary(bookFromPublisher);
        System.out.println("Added new book from publishers stock to our library");
    }
}
