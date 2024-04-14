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
}

