package pkgEmpleados;

public class Manager extends Employed {
    //propiedades si faltan
    public Manager(String employedName, String idEmployed, String gender, String employmentType, double baseSalary, int age, double workHours) {
        super(employedName, idEmployed, gender, employmentType, baseSalary, age, workHours);
    }

    //metodos xd
    public void assignTask() {
        System.out.println(String.format("The manager %s is assigning a task.", getEmployedName()));
    }

    public void manageTeam() {
        System.out.println(String.format("The manager %s is managing the team.", getEmployedName()));
    }

    public void generateReport() {
        System.out.println(String.format("The manager %s is generating a report.", getEmployedName()));
    }

    public void manageSchedule() {
        System.out.println(String.format("The manager %s is managing the schedule.", getEmployedName()));
    }

    public void monitorPerformance() {
        System.out.println(String.format("The manager %s is monitoring the team's performance.", getEmployedName()));
    }

    public void correctiveAction() {
        System.out.println(String.format("The manager &s is performing corrective action work", getEmployedName()));
    }

}
