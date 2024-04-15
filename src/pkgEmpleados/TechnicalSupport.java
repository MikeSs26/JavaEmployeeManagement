package pkgEmpleados;

public class TechnicalSupport extends Employed {
    private String speciality;
    private int supportLevel;
    private int cases;

    public TechnicalSupport(String employedName, String idEmployed, String gender, String employmentType, double baseSalary, int age, double workHours, String speciality, int supportLevel, int cases) {
        super(employedName, idEmployed, gender, employmentType, baseSalary, age, workHours);
        this.speciality = speciality;
        this.supportLevel = supportLevel;
        this.cases = cases;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public int getSupportLevel() {
        return supportLevel;
    }

    public void setSupportLevel(int supportLevel) {
        this.supportLevel = supportLevel;
    }

    public int getCases() {
        return cases;
    }

    public void setCases(int cases) {
        this.cases = cases;
    }

    public void resolveIncidents() {
        System.out.printf("Technical support %s is resolving incidents.%n", getEmployedName());
    }

    public void updateSoftware() {
        System.out.printf("Technical support %s is updating software.%n", getEmployedName());
    }

    public void provideAdvice() {
        System.out.printf("Technical support %s is providing advice.%n", getEmployedName());
    }

    public void provideTraining() {
        System.out.printf("Technical support %s is providing training.%n", getEmployedName());
    }

    public void followCases() {
        System.out.printf("Technical support %s is following cases.%n", getEmployedName());
    }

    public void reportSituations() {
        System.out.printf("Technical support %s is reporting situations.%n", getEmployedName());
    }

    public void calculateSalary() {
        double totalSalary = ((getBaseSalary() * getWorkHours()) + calculateBonus()) * 4;
        System.out.printf("Technical support %s total salary: $%.2f%n", getEmployedName(), totalSalary);
    }

    public void requestVacation() {
        System.out.printf("Technical support %s is requesting vacation days.%n", getEmployedName());
    }

    public void recordAttendance() {
        System.out.printf("Technical support %s is recording daily attendance.%n", getEmployedName());
    }

    public void receiveBonus() {
        double bonusAmount = calculateBonus();
        setBaseSalary(getBaseSalary() + bonusAmount);
        System.out.printf("Technical support %s is receiving a bonus for exceptional performance. Bonus received: $%.2f%n", getEmployedName(), bonusAmount);
    }

    private double calculateBonus() {
        return 0.1 * getBaseSalary();
    }
}
