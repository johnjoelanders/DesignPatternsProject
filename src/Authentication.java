import java.util.Scanner;

public class Authentication {
    Employee employee = new Employee("employee", "employee");
    Employee manager = new Employee("manager", "manager");
    Scanner scanner = new Scanner(System.in);
    String username, password;
    boolean isLoggedInAsEmployee = false;
    boolean isLoggedInAsManager = false;

    public String login() {
        while (!isLoggedInAsEmployee && !isLoggedInAsManager) {
            System.out.println("Enter your username: ");
            username = scanner.next();
            System.out.println("Enter password: ");
            password = scanner.next();
            if (employee.getUsername().equalsIgnoreCase(username) && employee.getPassword().equalsIgnoreCase(password)) {
                System.out.println("Welcome Employee");
                isLoggedInAsEmployee = true;
            } else if (manager.getUsername().equalsIgnoreCase(username) && manager.getPassword().equalsIgnoreCase(password)) {
                System.out.println("Welcome Manager");
                isLoggedInAsManager = true;
            } else {
                System.out.println("Incorrect username or password");
            }
        }
        return username+"-"+password;
    }

    public void logoff() {
        isLoggedInAsEmployee = false;
        isLoggedInAsManager = false;
    }
}
