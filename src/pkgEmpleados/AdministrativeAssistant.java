package pkgEmpleados;

public class AdministrativeAssistant extends Employed {

    public AdministrativeAssistant(String employedName, String idEmployed, String gender, String employmentType, double baseSalary, int age, double workHours, String languages, String education, String titles) {
        super(employedName, idEmployed, gender, employmentType, baseSalary, age, workHours);
    }

    public void manageDocuments() {
        System.out.printf("Administrative assistant %s is managing documents.%n", getEmployedName());
    }

    public void coordinateMeetings() {
        System.out.printf("Administrative assistant %s is coordinating meetings.%n", getEmployedName());
    }

    public void answerCalls() {
        System.out.printf("Administrative assistant %s is answering calls.%n", getEmployedName());
    }

    public void manageCalendars() {
        System.out.printf("Administrative assistant %s is managing calendars.%n", getEmployedName());
    }

    public void manageEmails() {
        System.out.printf("Administrative assistant %s is managing emails.%n", getEmployedName());
    }

    public void contactClients() {
        System.out.printf("Administrative assistant %s is contacting clients.%n", getEmployedName());
    }
}

