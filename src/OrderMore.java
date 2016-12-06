public class OrderMore extends Observer {
    public OrderMore(Library library){
        this.library = library;
        this.library.registerObserver(this);
    }
    @Override
    public void update(String title) {
        System.out.println("Adding more copies");
        library.getMoreCopies(title);
    }
}
