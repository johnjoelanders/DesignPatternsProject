public class OrderMore extends Observer{
    public OrderMore(Library library){
        this.library = library;
        this.library.registerObserver(this);
    }
    @Override
    public void update(String title) {
        System.out.println("Buying another book");
        library.addBook(title);
    }
}
