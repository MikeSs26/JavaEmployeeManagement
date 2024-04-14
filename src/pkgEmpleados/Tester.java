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
}

