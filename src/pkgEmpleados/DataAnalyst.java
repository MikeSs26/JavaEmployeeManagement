package pkgEmpleados;

public class DataAnalyst extends Employed{

    public DataAnalyst(String employedName, String idEmployed, String gender, String employmentType, double baseSalary, int age, double workHours) {
        super(employedName, idEmployed, gender, employmentType, baseSalary, age, workHours);
    }

    public void analyzeData() {
        System.out.println(String.format("Data analyst %s is managing the schedule.", getEmployedName()));
    }

    public void generateAnalysisReport() {
        System.out.println(String.format("Data analyst %s is managing the schedule.", getEmployedName()));
    }

    public void developPredictiveModels() {
        System.out.println(employedName + " is developing predictive models.");
    }

    public void collectData() {
        System.out.println(employedName + " is collecting data.");
    }

    public void cleanData() {
        System.out.println(employedName + " is cleaning data.");
    }

    public void presentResults() {
        System.out.println(employedName + " is presenting results.");
    }
}
