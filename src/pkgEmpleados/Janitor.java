package pkgEmpleados;

public class Janitor extends Employed {
    private String shift;
    private String area;
    private String accessPoints;

    public Janitor(String employedName, String idEmployed, String gender, String employmentType, double baseSalary, int age, double workHours, String shift, String area, String accessPoints) {
        super(employedName, idEmployed, gender, employmentType, baseSalary, age, workHours);
        this.shift = shift;
        this.area = area;
        this.accessPoints = accessPoints;
    }

    public void cleanWindows() {
        System.out.println(String.format("Janitor %s is cleaning windows.", getEmployedName()));
    }

    public void sweepFloor() {
        System.out.println(String.format("Janitor %s is sweeping the floor.", getEmployedName()));
    }

    public void mopFloor() {
        System.out.println(String.format("Janitor %s is mopping the floor.", getEmployedName()));
    }

    public void collectWaste() {
        System.out.println(String.format("Janitor %s is collecting waste.", getEmployedName()));
    }

    public void hangSigns() {
        System.out.println(String.format("Janitor %s is hanging signs.", getEmployedName()));
    }

    public void performRoutineMaintenance() {
        System.out.println(String.format("Janitor %s is performing routine maintenance.", getEmployedName()));
    }
}

