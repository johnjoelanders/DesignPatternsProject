import java.util.Iterator;

interface BookHandling {
    void buyBooks(PublisherStock publisherStock, Library library);

    void sellBooks(Library library);

    void displayBooks();

    void printTheBooks(Iterator iterator);

    void addEmployee(EmployeeFactory employeeFactory, Authentication authentication);
}
