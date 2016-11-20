
public class Hardback extends BookDecorator {
    public Hardback(Book book) {
        super(book);
    }

    public double getCost(){
        return book.getCost()+ 12.00;
    }
}
