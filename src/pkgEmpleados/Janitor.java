package pkgEmpleados;

public class Janitor extends Employed {

    public Janitor(String employedName, String idEmployed, String gender, String employmentType, double baseSalary, int age, double workHours, String shift, String area, String accessPoints) {
        super(employedName, idEmployed, gender, employmentType, baseSalary, age, workHours);
    }

    public void cleanWindows() {
        System.out.printf("Janitor %s is cleaning windows.%n", getEmployedName());
    }

    public void sweepFloor() {
        System.out.printf("Janitor %s is sweeping the floor.%n", getEmployedName());
    }

    public void mopFloor() {
        System.out.printf("Janitor %s is mopping the floor.%n", getEmployedName());
    }

    public void collectWaste() {
        System.out.printf("Janitor %s is collecting waste.%n", getEmployedName());
    }

    public void hangSigns() {
        System.out.printf("Janitor %s is hanging signs.%n", getEmployedName());
    }

    public void performRoutineMaintenance() {
        System.out.printf("Janitor %s is performing routine maintenance.%n", getEmployedName());
    }

    public void calculateSalary() {
        double totalSalary = ((getBaseSalary() * getWorkHours()) + calculateBonus()) * 4;
        System.out.printf("Janitor %s total salary: $%.2f%n", getEmployedName(), totalSalary);
    }

    public void requestVacation() {
        System.out.printf("Janitor %s is requesting vacation days.%n", getEmployedName());
    }

    public void recordAttendance() {
        System.out.printf("Janitor %s is recording daily attendance.%n", getEmployedName());
    }

    public void receiveBonus() {
        double bonusAmount = calculateBonus();
        setBaseSalary(getBaseSalary() + bonusAmount);
        System.out.printf("Janitor %s is receiving a bonus for exceptional performance. Bonus received: $%.2f%n", getEmployedName(), bonusAmount);
    }

    private double calculateBonus() {
        return 0.1 * getBaseSalary();
    }
}

