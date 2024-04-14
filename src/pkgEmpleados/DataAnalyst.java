package pkgEmpleados;

public class DataAnalyst extends Employed {
    private String analysisTools;
    private String programmingSkills;
    private String criticalThinking;

    public DataAnalyst(String employedName, String idEmployed, String gender, String employmentType, double baseSalary, int age, double workHours, String analysisTools, String programmingSkills, String criticalThinking) {
        super(employedName, idEmployed, gender, employmentType, baseSalary, age, workHours);
        this.analysisTools = analysisTools;
        this.programmingSkills = programmingSkills;
        this.criticalThinking = criticalThinking;
    }

    public void analyzeData() {
        System.out.printf("Data analyst %s is analyzing data.%n", getEmployedName());
    }

    public void generateAnalysisReport() {
        System.out.printf("Data analyst %s is generating an analysis report.%n", getEmployedName());
    }

    public void developPredictiveModels() {
        System.out.printf("Data analyst %s is developing predictive models.%n", getEmployedName());
    }

    public void collectData() {
        System.out.printf("Data analyst %s is collecting data.%n", getEmployedName());
    }

    public void cleanData() {
        System.out.printf("Data analyst %s is cleaning data.%n", getEmployedName());
    }

    public void presentResults() {
        System.out.printf("Data analyst %s is presenting results.%n", getEmployedName());
    }

    // Getters and setters for new attributes
    public String getAnalysisTools() {
        return analysisTools;
    }

    public void setAnalysisTools(String analysisTools) {
        this.analysisTools = analysisTools;
    }

    public String getProgrammingSkills() {
        return programmingSkills;
    }

    public void setProgrammingSkills(String programmingSkills) {
        this.programmingSkills = programmingSkills;
    }

    public String getCriticalThinking() {
        return criticalThinking;
    }

    public void setCriticalThinking(String criticalThinking) {
        this.criticalThinking = criticalThinking;
    }
}
