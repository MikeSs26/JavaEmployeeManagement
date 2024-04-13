package pkgEmpleados;

public class Secretary extends Employed {
    public Secretary(String name, String id, String gender, String employmentType, double baseSalary, int age, double workHours) {
        super(name, id, gender, employmentType, baseSalary, age, workHours);
        if (employmentType.equalsIgnoreCase("full")) {
            this.workHours = 40;
        } else if (employmentType.equalsIgnoreCase("part")) {
            this.workHours = 20;
        } else {
            throw new IllegalArgumentException("Invalid employment type: " + employmentType);
        }
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
        System.out.println(String.format("Secretary %s is writting the letters.", getEmployedName()));
    }

    public void organizeMeetings() {
        System.out.println(String.format("Secretary %s is organizing a meeting.", getEmployedName()));
    }

    public void receiveVisitors() {
        System.out.println(String.format("Secretary &s is attending visitors.", getEmployedName()));
    }
}

