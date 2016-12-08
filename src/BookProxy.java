import java.util.Iterator;
import java.util.Scanner;

class BookProxy implements BookHandling {
    private Employee employee;
    private Scanner scanner = new Scanner(System.in);
    private String title;
    private String typeOfEmployee = "";
    private BookIterator bookIterator;

    BookProxy(Employee employee, BookIterator newLibrary) {
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
            System.out.println("Exception thrown"+e);
        }

    }

    @Override
    public void displayBooks() {
        System.out.println("------Printing Books-------");
        Iterator iteratorBooks = bookIterator.createIterator();
        printTheBooks(iteratorBooks);
    }

    private void printTheBooks(Iterator iterator) {
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
            authentication.addToEmployees(employeeFactory.makeEmployee(typeOfEmployee.toUpperCase()));

        } else {
            System.out.println("You cannot buy books ask the manager !!!");
        }
    }
}
