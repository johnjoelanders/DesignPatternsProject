import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean isShutDown = false;
        Library library = Library.getLibraryInstance();
        EmployeeFactory employeeFactory = new EmployeeFactory();
        PublisherStock publisherStock = new PublisherStock();
        new OrderMore(library);
        Authentication authentication = Authentication.getAuthenticationInstance();
        Employee employeeLoggedIn = authentication.login();
        String choice;
        Scanner scanner = new Scanner(System.in);
        while (!isShutDown) {
            System.out.println("Would you like to buy a book(buy),sell a book(sell),show books(showBooks),logout(logout),shut down(shutdown),create new employee(newEmp)");
            choice = scanner.next();
            BookProxy bookProxy = new BookProxy(employeeLoggedIn, library);

            switch (choice) {
                case "buy":
                    bookProxy.buyBooks(publisherStock, library);
                    break;
                case "sell":
                    System.out.println("Selling books");
                    bookProxy.sellBooks(library);
                    break;
                case "showBooks":
                    bookProxy.displayBooks();
                    break;
                case "newEmp":
                    bookProxy.addEmployee(employeeFactory, authentication);
                    break;
                case "logout":
                    authentication.logoff();
                    employeeLoggedIn = authentication.login();
                    break;
                case "shutdown":
                    isShutDown = true;
                    System.out.println("Goodbye !!");
                    break;

            }
        }
    }

}
