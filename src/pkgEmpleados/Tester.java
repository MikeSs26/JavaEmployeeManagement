package pkgEmpleados;

public class Tester extends Employed {
    private String testType;
    private String softwareUsed;
    private String automationExperience;

    public Tester(String employedName, String idEmployed, String gender, String employmentType, double baseSalary, int age, double workHours, String testType, String softwareUsed, String automationExperience) {
        super(employedName, idEmployed, gender, employmentType, baseSalary, age, workHours);
        this.testType = testType;
        this.softwareUsed = softwareUsed;
        this.automationExperience = automationExperience;
    }

    public void checkCode() {
        System.out.println(String.format("Tester %s is checking code.", getEmployedName()));
    }

    public void testSoftware() {
        System.out.println(String.format("Tester %s is testing software.", getEmployedName()));
    }

    public void fixBugs() {
        System.out.println(String.format("Tester %s is fixing bugs.", getEmployedName()));
    }

    public void checkEfficiency() {
        System.out.println(String.format("Tester %s is checking efficiency.", getEmployedName()));
    }

    public void checkConnectivity() {
        System.out.println(String.format("Tester %s is checking connectivity.", getEmployedName()));
    }

    public void manageReport() {
        System.out.println(String.format("Tester %s is managing the report.", getEmployedName()));
    }
}

