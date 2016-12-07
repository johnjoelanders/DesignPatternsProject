public abstract class Employee {
    String username;
    String password;
    String name;
    String lastName;
    double wagesPerWeek;
    String typeOfEmployee;

    public Employee(String username, String password, String name, String lastName, double wagesPerWeek,String typeOfEmployee) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.lastName = lastName;
        this.wagesPerWeek = wagesPerWeek;
        this.typeOfEmployee = typeOfEmployee;
    }

    public String getUsername(){return username;}
    public String getPassword(){return password;}
    public Double getWagesPerWeek(){return wagesPerWeek;}
    public String getTypeOfEmployee() {return typeOfEmployee;}

    public void setWagesPerWeek(double wagesPerWeek) {
        this.wagesPerWeek = wagesPerWeek;
    }

    public void setTypeOfEmployee(String typeOfEmployee) {
        this.typeOfEmployee = typeOfEmployee;
    }
}