abstract class Employee {
    private String username,password,name,lastName,typeOfEmployee;
    private double wagesPerWeek;

    Employee(String username, String password, String name, String lastName, double wagesPerWeek, String typeOfEmployee) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.lastName = lastName;
        this.wagesPerWeek = wagesPerWeek;
        this.typeOfEmployee = typeOfEmployee;
    }

    String getUsername() {
        return username;
    }

    String getPassword() {
        return password;
    }


    String getTypeOfEmployee() {
        return typeOfEmployee;
    }

    void setWagesPerWeek(double wagesPerWeek) {
        this.wagesPerWeek = wagesPerWeek;
    }

    void setTypeOfEmployee(String typeOfEmployee) {
        this.typeOfEmployee = typeOfEmployee;
    }
}