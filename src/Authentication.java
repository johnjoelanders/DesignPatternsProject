import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Authentication {

    List<Employee> employees = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    String username, password;
    boolean isLoggedInAsEmployee = false;
    boolean isLoggedInAsManager = false;
    Employee empLoggedIn;

    public Authentication() {

        Manager manager = new Manager("manager", "manager", "manager", "manager", 200.00, "M");
        StoreAssistant storeAssistant = new StoreAssistant("test", "test", "storeAssistant", "storeAssistant", 200.00, "S");

        employees.add(manager);
        employees.add(storeAssistant);
    }

    public Employee login() {
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
                    } if (employee.getTypeOfEmployee().equalsIgnoreCase("M")) {
                        System.out.println("Welcome Manager");
                        empLoggedIn = employee;
                        isLoggedInAsManager = true;
                    }
                }
            }
            if(!isLoggedInAsEmployee && !isLoggedInAsManager){
                System.out.println("Incorrect Details");
            }
        }
        return empLoggedIn;
    }

    public void logoff() {
        isLoggedInAsEmployee = false;
        isLoggedInAsManager = false;
    }
    public void addToEmployes(Employee employee){
        employees.add(employee);
        System.out.println("Added to employees");
    }
}
