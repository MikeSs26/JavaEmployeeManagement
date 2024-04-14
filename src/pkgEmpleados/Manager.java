package pkgEmpleados;

public class Manager extends Employed {
    private String department;
    private String subordinates;
    private int authorityLevel;

    public Manager(String employedName, String idEmployed, String gender, String employmentType, double baseSalary, int age, double workHours, String department, String subordinates, int authorityLevel) {
        super(employedName, idEmployed, gender, employmentType, baseSalary, age, workHours);
        this.department = department;
        this.subordinates = subordinates;
        this.authorityLevel = authorityLevel;
    }

    public void assignTask() {
        System.out.println(String.format("Manager %s is assigning a task.", getEmployedName()));
    }

    public void manageTeam() {
        System.out.println(String.format("Manager %s is managing the team.", getEmployedName()));
    }

    public void generateReport() {
        System.out.println(String.format("Manager %s is generating a report.", getEmployedName()));
    }

    public void manageSchedule() {
        System.out.println(String.format("Manager %s is managing the schedule.", getEmployedName()));
    }

    public void monitorPerformance() {
        System.out.println(String.format("Manager %s is monitoring the team's performance.", getEmployedName()));
    }

    public void correctiveAction() {
        System.out.println(String.format("Manager %s is performing corrective action work.", getEmployedName()));
    }

    // Getters and setters for new attributes
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSubordinates() {
        return subordinates;
    }

    public void setSubordinates(String subordinates) {
        this.subordinates = subordinates;
    }

    public int getAuthorityLevel() {
        return authorityLevel;
    }

    public void setAuthorityLevel(int authorityLevel) {
        this.authorityLevel = authorityLevel;
    }
}
