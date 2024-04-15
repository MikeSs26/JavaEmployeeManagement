package pkgEmpleados;

public class SoftwareEngineer extends Employed {

    public SoftwareEngineer(String employedName, String idEmployed, String gender, String employmentType, double baseSalary, int age, double workHours, String languages, String projects, String responsibleAgent) {
        super(employedName, idEmployed, gender, employmentType, baseSalary, age, workHours);
    }

    public void developSoftware() {
        System.out.printf("Software engineer %s is developing software.%n", getEmployedName());
    }

    public void performTests() {
        System.out.printf("Software engineer %s is performing tests.%n", getEmployedName());
    }

    public void maintainSystems() {
        System.out.printf("Software engineer %s is maintaining systems.%n", getEmployedName());
    }

    public void writeCode() {
        System.out.printf("Software engineer %s is writing code.%n", getEmployedName());
    }

    public void designPrograms() {
        System.out.printf("Software engineer %s is designing programs.%n", getEmployedName());
    }

    public void troubleshoot() {
        System.out.printf("Software engineer %s is troubleshooting.%n", getEmployedName());
    }

    public void calculateSalary() {
        double totalSalary = ((getBaseSalary() * getWorkHours()) + calculateBonus()) * 4;
        System.out.printf("Software engineer %s total salary: $%.2f%n", getEmployedName(), totalSalary);
    }

    public void requestVacation() {
        System.out.printf("Software engineer %s is requesting vacation days.%n", getEmployedName());
    }

    public void recordAttendance() {
        System.out.printf("Software engineer %s is recording daily attendance.%n", getEmployedName());
    }

    public void receiveBonus() {
        double bonusAmount = calculateBonus();
        setBaseSalary(getBaseSalary() + bonusAmount);
        System.out.printf("Software engineer %s is receiving a bonus for exceptional performance. Bonus received: $%.2f%n", getEmployedName(), bonusAmount);
    }

    private double calculateBonus() {
        return 0.1 * getBaseSalary();
    }
}

