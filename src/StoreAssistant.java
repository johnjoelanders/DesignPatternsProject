
class StoreAssistant extends Employee {

    StoreAssistant(String username, String password, String name, String lastName, double wagesPerWeek, String typeOfEmployee) {
        super(username, password, name, lastName, wagesPerWeek, typeOfEmployee);
        setWagesPerWeek(100.00);
        setTypeOfEmployee("S");
    }
}
