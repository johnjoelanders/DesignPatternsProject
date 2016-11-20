import java.util.ArrayList;
import java.util.List;

public class Library implements Subject{
        private List<Observer> observers = new ArrayList<Observer>();
        public List<BasicBook> books = new ArrayList<BasicBook>();
        String updateBookTitle;
    public Library(){


    }
    public void buyBook(String title){
        for(BasicBook book : books){
            if(book.getTitle() == title){
                book.setNoOfCopies(book.getNoOfCopies()-1);
                if(book.getNoOfCopies() <= 2){
                    updateBookTitle = title;
                    notifyObservers();
                }
            }
        }
    }
    public void addBook(String title){
        for (BasicBook book :books){
            if(book.getTitle() == title){
                int numOfBooks1 = book.getNoOfCopies();
                System.out.println("Number of books before : "+numOfBooks1);
                book.setNoOfCopies(book.getNoOfCopies()+1);
                int numOfBooks = book.getNoOfCopies();
                System.out.println("Number of books after: "+numOfBooks);
            }
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(updateBookTitle);
        }
    }
}

