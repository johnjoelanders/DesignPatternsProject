
public class Pictures extends BookDecorator {
    public Pictures(Book book) {
        super(book);
    }

    public double getCost(){
        return book.getCost()+ 22.00;
    }
}
