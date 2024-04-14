package pkgEmpleados;

public class AdministrativeAssistant extends Employed {
    private String languages;
    private String education;
    private String titles;

    public AdministrativeAssistant(String employedName, String idEmployed, String gender, String employmentType, double baseSalary, int age, double workHours, String languages, String education, String titles) {
        super(employedName, idEmployed, gender, employmentType, baseSalary, age, workHours);
        this.languages = languages;
        this.education = education;
        this.titles = titles;
    }

    public void manageDocuments() {
        System.out.println(String.format("Administrative assistant %s is managing documents.", getEmployedName()));
    }

    public void coordinateMeetings() {
        System.out.println(String.format("Administrative assistant %s is coordinating meetings.", getEmployedName()));
    }

    public void answerCalls() {
        System.out.println(String.format("Administrative assistant %s is answering calls.", getEmployedName()));
    }

    public void manageCalendars() {
        System.out.println(String.format("Administrative assistant %s is managing calendars.", getEmployedName()));
    }

    public void manageEmails() {
        System.out.println(String.format("Administrative assistant %s is managing emails.", getEmployedName()));
    }

    public void contactClients() {
        System.out.println(String.format("Administrative assistant %s is contacting clients.", getEmployedName()));
    }
}

