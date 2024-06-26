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
        System.out.printf("Manager %s is assigning a task.%n", getEmployedName());
    }

    public void manageTeam() {
        System.out.printf("Manager %s is managing the team.%n", getEmployedName());
    }

    public void generateReport() {
        System.out.printf("Manager %s is generating a report.%n", getEmployedName());
    }

    public void manageSchedule() {
        System.out.printf("Manager %s is managing the schedule.%n", getEmployedName());
    }

    public void monitorPerformance() {
        System.out.printf("Manager %s is monitoring the team's performance.%n", getEmployedName());
    }

    public void correctiveAction() {
        System.out.printf("Manager %s is performing corrective action work.%n", getEmployedName());
    }

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

    public void calculateSalary() {
        double totalSalary = ((getBaseSalary() * getWorkHours()) + calculateBonus()) * 4;
        System.out.printf("Manager %s total salary: $%.2f%n", getEmployedName(), totalSalary);
    }

    public void requestVacation() {
        System.out.printf("Manager %s is requesting vacation days.%n", getEmployedName());
    }

    public void recordAttendance() {
        System.out.printf("Manager %s is recording daily attendance.%n", getEmployedName());
    }

    public void receiveBonus() {
        double bonusAmount = calculateBonus();
        setBaseSalary(getBaseSalary() + bonusAmount);
        System.out.printf("Manager %s is receiving a bonus for exceptional performance. Bonus received: $%.2f%n", getEmployedName(), bonusAmount);
    }

    private double calculateBonus() {
        return 0.1 * getBaseSalary();
    }
}
