import java.util.Scanner;

public class EmployeeFactory {
    String name;
    String lastname;
    String username;
    String password;
    Double wagesPerWeek = 0.0;
    String type = "";
    Scanner scanner = new Scanner(System.in);
    ValidateDetails validateDetailsPassword = new ValidateDetails(new ValidatePassword());
    ValidateDetails validateDetailsUsername = new ValidateDetails(new ValidateUsername());
    boolean isValidPassword = false;
    boolean isValidUsername = false;

    public Employee makeEmployee(String employee) {
        switch (employee) {
            case "M":
                System.out.println("Enter your Managers name: ");
                name = scanner.next();
                System.out.println("Enter your Managers last name: ");
                lastname = scanner.next();

                while (!isValidUsername) {
                    System.out.println("Enter your Managers username: ");
                    username = scanner.next();
                    isValidUsername = validateDetailsUsername.validateUsername(username);
                }
                isValidUsername = false;
                while (!isValidPassword) {
                    System.out.println("Enter your Managers password: ");
                    password = scanner.next();
                    isValidPassword = validateDetailsPassword.validatePassword(password);
                }
                isValidPassword = false;
                return new Manager(name, lastname, username, password, wagesPerWeek, type);
            case "S":
                System.out.println("Enter your Store Assistants name: ");
                name = scanner.next();
                System.out.println("Enter your Store Assistants last name: ");
                lastname = scanner.next();

                while (!isValidUsername) {
                    System.out.println("Enter your Store Assistants username: ");
                    username = scanner.next();
                    isValidUsername = validateDetailsUsername.validateUsername(username);
                }
                isValidUsername = false;

                while (!isValidPassword) {
                    System.out.println("Enter your Store Assistants password: ");
                    password = scanner.next();
                    isValidPassword = validateDetailsPassword.validatePassword(password);
                }
                isValidPassword = false;
                return new StoreAssistant(name, lastname, username, password, wagesPerWeek, type);
            default:
                return null;
        }
    }
}
