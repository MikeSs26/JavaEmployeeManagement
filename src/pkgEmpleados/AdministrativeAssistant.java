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

    public void calculateSalary() {
        double totalSalary = (getBaseSalary() * getWorkHours()) * 4;
        System.out.printf("Administrative assistant %s total salary: $%.2f%n", getEmployedName(), totalSalary);
    }

    public void requestPermission() {
        System.out.printf("Administrative assistant %s is requesting permission for absence.%n", getEmployedName());
    }

    public void organizeInventory() {
        System.out.printf("Administrative assistant %s is organizing the inventory of products.%n", getEmployedName());
    }

    public void assistCustomers() {
        System.out.printf("Administrative assistant %s is assisting customers during working hours.%n", getEmployedName());
    }

}

