
class Manager extends Employee {

    Manager(String username, String password, String name, String lastName, double wagesPerWeek, String typeOfEmployee) {
        super(username, password, name, lastName, wagesPerWeek, typeOfEmployee);
        setWagesPerWeek(200.00);
        setTypeOfEmployee("M");
    }
}
