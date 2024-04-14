package pkgEmpleados;

public class SoftwareEngineer extends Employed {
    private String languages;
    private String projects;
    private String responsibleAgent;

    public SoftwareEngineer(String employedName, String idEmployed, String gender, String employmentType, double baseSalary, int age, double workHours, String languages, String projects, String responsibleAgent) {
        super(employedName, idEmployed, gender, employmentType, baseSalary, age, workHours);
        this.languages = languages;
        this.projects = projects;
        this.responsibleAgent = responsibleAgent;
    }

    public void developSoftware() {
        System.out.println(String.format("Software engineer %s is developing software.", getEmployedName()));
    }

    public void performTests() {
        System.out.println(String.format("Software engineer %s is performing tests.", getEmployedName()));
    }

    public void maintainSystems() {
        System.out.println(String.format("Software engineer %s is maintaining systems.", getEmployedName()));
    }

    public void writeCode() {
        System.out.println(String.format("Software engineer %s is writing code.", getEmployedName()));
    }

    public void designPrograms() {
        System.out.println(String.format("Software engineer %s is designing programs.", getEmployedName()));
    }

    public void troubleshoot() {
        System.out.println(String.format("Software engineer %s is troubleshooting.", getEmployedName()));
    }
}

