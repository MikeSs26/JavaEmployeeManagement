package pkgEmpleados;

public class Employed {
    protected String employedName;
    protected String idEmployed;
    protected String gender;
    protected String employmentType;
    protected double baseSalary;
    protected int age;
    protected double workHours;

    public Employed(String employedName, String idEmployed, String gender, String employmentType, double baseSalary, int age, double workHours) {
        this.employedName = employedName;
        this.idEmployed = idEmployed;
        this.gender = gender;
        this.employmentType = employmentType;
        this.baseSalary = baseSalary;
        this.age = age;
        this.workHours = workHours;
    }

    public String getEmployedName() {
        return employedName;
    }

    public void setEmployedName(String employedName) {
        this.employedName = employedName;
    }

    public String getIdEmployed() {
        return idEmployed;
    }

    public void setIdEmployed(String idEmployed) {
        this.idEmployed = idEmployed;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmploymentType() {
        return employmentType;
    }

    public void setEmploymentType(String employmentType) {
        this.employmentType = employmentType;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public double calculateSalary() {
        return baseSalary * workHours;
    }

    public static void displayEmployeeInfo(Employed emp) {
        System.out.println("Employee Name: " + emp.employedName);
        System.out.println("ID: " + emp.idEmployed);
        System.out.println("Gender: " + emp.gender);
        System.out.println("Employment Type: " + emp.employmentType);
        System.out.println("Base Salary: " + emp.baseSalary);
        System.out.println("Age: " + emp.age);
        System.out.println("Work Hours (Monthly): " + emp.workHours * 4);
        System.out.println("Total Salary: " + emp.calculateSalary() + "\n");
    }

    public void requestVacation() {
        System.out.println(employedName + " has asked for vacations.");
    }

    public void registerAttendance() {
        System.out.println(employedName + " has registered attendance.");
    }

    public void receiveBonus() {

        System.out.println(employedName + " has received a bonus.");

    }

    public static void main(String[] args) {
        Employed employed1 = new Employed("Miguel Lucia", "ID1", "Male", "full", 17.4, 19, 40); // full-time with 40 hours
        Manager mger = new Manager("Jose Montero", "ID4", "Male", "part", 10.2, 33, 20);
        Secretary scrt = new Secretary("Jazmin Fuentes", "ID7", "Female", "full", 18.7, 20, 40);
        displayEmployeeInfo(employed1);
        displayEmployeeInfo(mger);
        displayEmployeeInfo(scrt);
    }
}