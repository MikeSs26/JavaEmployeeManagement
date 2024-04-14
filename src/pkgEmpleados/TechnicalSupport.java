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
        System.out.println(String.format("Technical support %s is resolving incidents.", getEmployedName()));
    }

    public void updateSoftware() {
        System.out.println(String.format("Technical support %s is updating software.", getEmployedName()));
    }

    public void provideAdvice() {
        System.out.println(String.format("Technical support %s is providing advice.", getEmployedName()));
    }

    public void provideTraining() {
        System.out.println(String.format("Technical support %s is providing training.", getEmployedName()));
    }

    public void followCases() {
        System.out.println(String.format("Technical support %s is following cases.", getEmployedName()));
    }

    public void reportSituations() {
        System.out.println(String.format("Technical support %s is reporting situations.", getEmployedName()));
    }
}
