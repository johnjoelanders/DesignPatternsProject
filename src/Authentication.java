import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Authentication {

    private List<Employee> employees = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    private String username, password;
    private boolean isLoggedInAsEmployee = false;
    private boolean isLoggedInAsManager = false;
    private Employee empLoggedIn;
    private static Authentication authenticationInstance = new Authentication();
    static Authentication getAuthenticationInstance() {
        return authenticationInstance;
    }

    private Authentication() {

        Manager manager = new Manager("manager", "manager", "manager", "manager", 200.00, "M");
        StoreAssistant storeAssistant = new StoreAssistant("test", "test", "storeAssistant", "storeAssistant", 200.00, "S");

        employees.add(manager);
        employees.add(storeAssistant);
    }

    Employee login() {
        while (!isLoggedInAsEmployee && !isLoggedInAsManager) {
            System.out.println("Enter your username: ");
            username = scanner.next();
            System.out.println("Enter password: ");
            password = scanner.next();
            for (Employee employee : employees) {
                if (employee.getUsername().equalsIgnoreCase(username) && employee.getPassword().equalsIgnoreCase(password)) {
                    if (employee.getTypeOfEmployee().equalsIgnoreCase("S")) {
                        System.out.println("Welcome Employee");
                        empLoggedIn = employee;
                        isLoggedInAsEmployee = true;
                    }
                    if (employee.getTypeOfEmployee().equalsIgnoreCase("M")) {
                        System.out.println("Welcome Manager");
                        empLoggedIn = employee;
                        isLoggedInAsManager = true;
                    }
                }
            }
            if (!isLoggedInAsEmployee && !isLoggedInAsManager) {
                System.out.println("Incorrect Details");
            }
        }
        return empLoggedIn;
    }

    void logoff() {
        isLoggedInAsEmployee = false;
        isLoggedInAsManager = false;
    }

    void addToEmployees(Employee employee) {
        employees.add(employee);
        System.out.println("Added to employees");
    }
}
