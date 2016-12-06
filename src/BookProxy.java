import java.util.Scanner;

public class BookProxy implements BookHandling {
    Employee employee;
    Scanner scanner = new Scanner(System.in);
    String title;

    public BookProxy(Employee employee){this.employee = employee;}
    @Override
    public void buyBooks() {
        if(employee.getUsername().equalsIgnoreCase("manager") && employee.getPassword().equalsIgnoreCase("manager")){
            System.out.println("Buying Books from supplier");
        }else{
            System.out.println("You cannot buy books ask the manager !!!");
        }
    }

    @Override
    public void sellBooks(Library library) {
        System.out.println("Enter name of book you want to sell ");
        title = scanner.next().toLowerCase();
        try{
            library.sellBook(title);
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
