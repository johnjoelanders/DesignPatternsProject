import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean isShutDown = false;
        Library library = new Library();
        PublisherStock publisherStock = new PublisherStock();
        new OrderMore(library);
        Authentication authentication = new Authentication();
        String userDetails = authentication.login();
        String choice;
        Scanner scanner = new Scanner(System.in);
        while (!isShutDown) {
            System.out.println("Would you like to buy a book(buy),sell a book(sell),logout(logout),shut down(shutdown)");
            choice = scanner.next();
            String[] splitString = userDetails.split("-");
            String username = splitString[0];
            String password = splitString[1];
            Employee loggedInEmployee = new Employee(username, password);
            BookProxy bookProxy = new BookProxy(loggedInEmployee);

            switch (choice) {
                case "buy":
                    bookProxy.buyBooks(publisherStock,library);
                    break;
                case "sell":
                    System.out.println("Selling books");
                    bookProxy.sellBooks(library);
                    break;
                case "logout":
                    authentication.logoff();
                    userDetails = authentication.login();
                    break;
                case "shutdown":
                    isShutDown = true;
                    System.out.println("Goodbye !!");
                    break;

            }
        }
    }

}
