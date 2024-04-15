package pkgEmpleados;

public class Tester extends Employed {

    public Tester(String employedName, String idEmployed, String gender, String employmentType, double baseSalary, int age, double workHours, String testType, String softwareUsed, String automationExperience) {
        super(employedName, idEmployed, gender, employmentType, baseSalary, age, workHours);
    }

    public void checkCode() {
        System.out.printf("Tester %s is checking code.%n", getEmployedName());
    }

    public void testSoftware() {
        System.out.printf("Tester %s is testing software.%n", getEmployedName());
    }

    public void fixBugs() {
        System.out.printf("Tester %s is fixing bugs.%n", getEmployedName());
    }

    public void checkEfficiency() {
        System.out.printf("Tester %s is checking efficiency.%n", getEmployedName());
    }

    public void checkConnectivity() {
        System.out.printf("Tester %s is checking connectivity.%n", getEmployedName());
    }

    public void manageReport() {
        System.out.printf("Tester %s is managing the report.%n", getEmployedName());
    }

    public void calculateSalary() {
        double totalSalary = ((getBaseSalary() * getWorkHours()) + calculateBonus()) * 4;
        System.out.printf("Tester %s total salary: $%.2f%n", getEmployedName(), totalSalary);
    }

    public void requestVacation() {
        System.out.printf("Tester %s is requesting vacation days.%n", getEmployedName());
    }

    public void recordAttendance() {
        System.out.printf("Tester %s is recording daily attendance.%n", getEmployedName());
    }

    public void receiveBonus() {
        double bonusAmount = calculateBonus();
        setBaseSalary(getBaseSalary() + bonusAmount);
        System.out.printf("Tester %s is receiving a bonus for exceptional performance. Bonus received: $%.2f%n", getEmployedName(), bonusAmount);
    }

    private double calculateBonus() {
        return 0.1 * getBaseSalary();
    }
}

