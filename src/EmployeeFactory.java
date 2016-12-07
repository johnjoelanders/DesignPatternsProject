import java.util.Scanner;

public class EmployeeFactory {
    String name;
    String lastname;
    String username;
    String password;
    Double wagesPerWeek;
    String type;
    Scanner scanner = new Scanner(System.in);

    public Employee makeEmployee(String employee){
        switch (employee){
            case "M":
                System.out.println("Enter your Managers name: ");
                name = scanner.next();
                System.out.println("Enter your Managers last name: ");
                lastname = scanner.next();
                System.out.println("Enter your Managers username: ");
                username = scanner.next();
                System.out.println("Enter your Managers password: ");
                password = scanner.next();
                return new Manager(name,lastname,username,password,wagesPerWeek,type);
            case "S":
                System.out.println("Enter your Store Assistants name: ");
                name = scanner.next();
                System.out.println("Enter your Store Assistants last name: ");
                lastname = scanner.next();
                System.out.println("Enter your Store Assistants username: ");
                username = scanner.next();
                System.out.println("Enter your Store Assistants password: ");
                password = scanner.next();
                return new StoreAssistant(name,lastname,username,password,wagesPerWeek,type);
            default:
                return null;
        }
    }
}
