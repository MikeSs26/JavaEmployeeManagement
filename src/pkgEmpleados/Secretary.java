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
        System.out.println(String.format("Secretary %s is managing the schedule.", getEmployedName()));
    }

    public void writeCorrespondence() {
        System.out.println(String.format("Secretary %s is writing the correspondence.", getEmployedName()));
    }

    public void organizeDocuments() {
        System.out.println(String.format("Secretary %s is organizing the documents.", getEmployedName()));
    }

    public void writeLetters() {
        System.out.println(String.format("Secretary %s is writing the letters.", getEmployedName()));
    }

    public void organizeMeetings() {
        System.out.println(String.format("Secretary %s is organizing a meeting.", getEmployedName()));
    }

    public void receiveVisitors() {
        System.out.println(String.format("Secretary %s is attending visitors.", getEmployedName()));
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
}
