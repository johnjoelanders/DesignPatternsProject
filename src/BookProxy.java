import java.util.Iterator;
import java.util.Scanner;

public class BookProxy implements BookHandling {
    Employee employee;
    Scanner scanner = new Scanner(System.in);
    String title;
    String typeOfEmployee = "";
    BookIterator bookIterator;

    public BookProxy(Employee employee,BookIterator newLibrary) {
        this.employee = employee;
        this.bookIterator = newLibrary;
    }

    @Override
    public void buyBooks(PublisherStock publisherStock, Library library) {
        if (employee.getTypeOfEmployee().equalsIgnoreCase("M")) {
            System.out.println("Buying Books from publishers");
            BuyBook buyBook = new BuyBook(publisherStock);
            Buyer buyer = new Buyer();
            buyer.takeOrder(buyBook);
            buyer.placeOrders(library);
        } else {
            System.out.println("You cannot buy books ask the manager !!!");
        }
    }

    @Override
    public void sellBooks(Library library) {
        System.out.println("Enter name of book you want to sell ");
        title = scanner.next().toLowerCase();
        try {
            library.sellBook(title);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    @Override
    public void displayBooks() {
        System.out.println("------Printing Books-------");
        Iterator iteratorBooks = bookIterator.createIterator();
        printTheBooks(iteratorBooks);
    }

    public void printTheBooks(Iterator iterator) {
        while (iterator.hasNext()) {
            BasicBook basicBook = (BasicBook) iterator.next();
            System.out.println("Title: " + basicBook.getTitle() + " Cost: " + basicBook.getCost());
        }

    }


    @Override
    public void addEmployee(EmployeeFactory employeeFactory, Authentication authentication) {
        if (employee.getTypeOfEmployee().equalsIgnoreCase("M")) {
            System.out.println("Adding employee");
            while (!typeOfEmployee.equalsIgnoreCase("m") && !typeOfEmployee.equalsIgnoreCase("s")) {
                System.out.println("Enter type of employee you wan to create (M) for manager and (S) for store assistant");
                typeOfEmployee = scanner.next();
            }
            authentication.addToEmployes(employeeFactory.makeEmployee(typeOfEmployee.toUpperCase()));

        } else {
            System.out.println("You cannot buy books ask the manager !!!");
        }
    }
}
