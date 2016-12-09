import java.util.Scanner;

class EmployeeFactory {
    private String name, lastName, username, password;
    private Double wagesPerWeek = 0.0;
    private String type = "";
    private Scanner scanner = new Scanner(System.in);
    private ValidateDetails validateDetailsPassword = new ValidateDetails(new ValidatePassword());
    private ValidateDetails validateDetailsUsername = new ValidateDetails(new ValidateUsername());
    private boolean isValidPassword = false;
    private boolean isValidUsername = false;

    Employee makeEmployee(String employee) {
        switch (employee) {
            case "M":
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

                System.out.println("Enter your Managers name: ");
                name = scanner.next();
                System.out.println("Enter your Managers last name: ");
                lastName = scanner.next();
                return new Manager(username, password, name, lastName, wagesPerWeek, type);
            case "S":
                System.out.println("Enter your Store Assistants name: ");
                name = scanner.next();
                System.out.println("Enter your Store Assistants last name: ");
                lastName = scanner.next();

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
                return new StoreAssistant(username, password, name, lastName, wagesPerWeek, type);
            default:
                return null;
        }
    }
}
