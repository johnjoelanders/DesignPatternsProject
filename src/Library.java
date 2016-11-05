import java.util.ArrayList;
import java.util.List;

public class Library implements Subject{
    private List<Observer> observers = new ArrayList<Observer>();
    public List<Book> books = new ArrayList<Book>();
    String updateBookTitle;
    public Library(){
        Book b1 = new Book("Harry Potter and the Sorcerer's Stone","J.K. Rowling","Arthur A. Levine Books",12.80,true,true,320,143955493L,5);
        Book b2 = new Book("Harry Potter and the Prisoner of Azkaban","J.K. Rowling","Scholastic",15.30,true,false,435,143955493L,7);
        Book b3 = new Book("Harry Potter and the Chamber of Secrets","J.K. Rowling","Scholastic",11.00,true,false,352,143955493L,3);
        Book b4 = new Book("Harry Potter and the Deathly Hallows","J.K. Rowling","Scholastic",9.80,true,false,784,143955493L,4);
        Book b5 = new Book("Test","J.K. Rowling","Scholastic",9.80,true,false,784,143955493L,3);

        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        books.add(b5);

    }
    public void buyBook(String title){
        for(Book book : books){
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
        for (Book book :books){
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

