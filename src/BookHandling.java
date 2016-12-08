import java.util.Iterator;

public interface BookHandling {
    void buyBooks(PublisherStock publisherStock,Library library);
    void sellBooks(Library library);
    void displayBooks();
    void addEmployee(EmployeeFactory employeeFactory,Authentication authentication);
}
