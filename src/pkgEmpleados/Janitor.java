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
}

