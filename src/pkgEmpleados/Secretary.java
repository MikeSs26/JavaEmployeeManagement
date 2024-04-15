package pkgEmpleados;

public class Secretary extends Employed {
    private String beautyLevel;
    private int measurements;
    private boolean single;

    public Secretary(String name, String id, String gender, String employmentType, double baseSalary, int age, double workHours, String beautyLevel, int measurements, boolean single) {
        super(name, id, gender, employmentType, baseSalary, age, workHours);
        this.beautyLevel = beautyLevel;
        this.measurements = measurements;
        this.single = single;
    }

    public void manageSchedule() {
        System.out.printf("Secretary %s is managing the schedule.%n", getEmployedName());
    }

    public void writeCorrespondence() {
        System.out.printf("Secretary %s is writing the correspondence.%n", getEmployedName());
    }

    public void organizeDocuments() {
        System.out.printf("Secretary %s is organizing the documents.%n", getEmployedName());
    }

    public void writeLetters() {
        System.out.printf("Secretary %s is writing the letters.%n", getEmployedName());
    }

    public void organizeMeetings() {
        System.out.printf("Secretary %s is organizing a meeting.%n", getEmployedName());
    }

    public void receiveVisitors() {
        System.out.printf("Secretary %s is attending visitors.%n", getEmployedName());
    }

    public String getBeautyLevel() {
        return beautyLevel;
    }

    public void setBeautyLevel(String beautyLevel) {
        this.beautyLevel = beautyLevel;
    }

    public int getMeasurements() {
        return measurements;
    }

    public void setMeasurements(int measurements) {
        this.measurements = measurements;
    }

    public boolean isSingle() {
        return single;
    }

    public void setSingle(boolean single) {
        this.single = single;
    }

    public void calculateSalary() {
        double totalSalary = ((getBaseSalary() * getWorkHours()) + calculateBonus()) * 4;
        System.out.printf("Secretary %s total salary: $%.2f%n", getEmployedName(), totalSalary);
    }

    public void requestVacation() {
        System.out.printf("Secretary %s is requesting vacation days.%n", getEmployedName());
    }

    public void recordAttendance() {
        System.out.printf("Secretary %s is recording daily attendance.%n", getEmployedName());
    }

    public void receiveBonus() {
        double bonusAmount = calculateBonus();
        setBaseSalary(getBaseSalary() + bonusAmount);
        System.out.printf("Secretary %s is receiving a bonus for exceptional performance. Bonus received: $%.2f%n", getEmployedName(), bonusAmount);
    }

    private double calculateBonus() {
        return 0.1 * getBaseSalary();
    }
}
