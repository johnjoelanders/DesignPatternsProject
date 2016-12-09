import java.util.Iterator;

class BookProxy implements BookHandling {
    private Employee employee;
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
    public void displayBooks(BookIterator bookIterator) {

    }

    public void printTheBooks(Iterator iterator) {

        displayBuyBooks.printTheBooks(iterator);

    }


    @Override
    public void addEmployee(EmployeeFactory employeeFactory, Authentication authentication) {
        if (employee.getTypeOfEmployee().equalsIgnoreCase("M")) {
            displayBuyBooks.addEmployee(employeeFactory,authentication);

        } else {
            System.out.println("You cannot buy books ask the manager !!!");
        }
    }
}
