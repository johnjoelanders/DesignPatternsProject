import java.util.Iterator;
import java.util.Scanner;

class DisplayBuyBooks implements BookHandling{
    private String title;
    private String typeOfEmployee = "";
    private Scanner scanner = new Scanner(System.in);
    @Override
    public void buyBooks(PublisherStock publisherStock, Library library) {
        System.out.println("Buying Books from publishers");
        BuyBook buyBook = new BuyBook(publisherStock);
        Buyer buyer = new Buyer();
        buyer.takeOrder(buyBook);
        buyer.placeOrders(library);
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
    }

    @Override
    public void printTheBooks(Iterator iterator) {
        while (iterator.hasNext()) {
            BasicBook basicBook = (BasicBook) iterator.next();
            System.out.println("Title: " + basicBook.getTitle() + " Cost: " + basicBook.getCost());
        }
    }

    @Override
    public void addEmployee(EmployeeFactory employeeFactory, Authentication authentication) {
        System.out.println("Adding employee");
        while (!typeOfEmployee.equalsIgnoreCase("m") && !typeOfEmployee.equalsIgnoreCase("s")) {
            System.out.println("Enter type of employee you wan to create (M) for manager and (S) for store assistant");
            typeOfEmployee = scanner.next();
        }
        authentication.addToEmployees(employeeFactory.makeEmployee(typeOfEmployee.toUpperCase()));
    }
}
