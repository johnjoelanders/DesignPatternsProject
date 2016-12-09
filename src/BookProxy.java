import java.util.Iterator;
import java.util.Scanner;

class BookProxy implements BookHandling {
    private Employee employee;
    private Scanner scanner = new Scanner(System.in);
    private String typeOfEmployee = "";
    private BookIterator bookIterator;
    private DisplayBuyBooks displayBuyBooks = new DisplayBuyBooks();

    BookProxy(Employee employee, BookIterator newLibrary) {
        this.employee = employee;
        this.bookIterator = newLibrary;
    }

    @Override
    public void buyBooks(PublisherStock publisherStock, Library library) {
        if (employee.getTypeOfEmployee().equalsIgnoreCase("M")) {
            displayBuyBooks.buyBooks(publisherStock, library);
        } else {
            System.out.println("You cannot buy books ask the manager !!!");
        }
    }

    @Override
    public void sellBooks(Library library) {
        displayBuyBooks.sellBooks(library);

    }

    @Override
    public void displayBooks() {
        System.out.println("------Printing Books-------");
        Iterator iteratorBooks = bookIterator.createIterator();
        printTheBooks(iteratorBooks);
    }

    public void printTheBooks(Iterator iterator) {

        displayBuyBooks.printTheBooks(iterator);

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
