package pkgEmpleados;

public class Security extends Employed {

    public Security(String employedName, String idEmployed, String gender, String employmentType, double baseSalary, int age, double workHours, String agilityLevel, float weight, String previousExperience) {
        super(employedName, idEmployed, gender, employmentType, baseSalary, age, workHours);
    }

    public void protectBuilding() {
        System.out.printf("Security guard %s is protecting the building.%n", getEmployedName());
    }

    public void foreseeDangers() {
        System.out.printf("Security guard %s is foreseeing dangers.%n", getEmployedName());
    }

    public void eliminateHazards() {
        System.out.printf("Security guard %s is eliminating hazards.%n", getEmployedName());
    }

    public void guardObjects() {
        System.out.printf("Security guard %s is guarding objects.%n", getEmployedName());
    }

    public void nightPatrol() {
        System.out.printf("Security guard %s is patrolling at night.%n", getEmployedName());
    }

    public void monitorCameras() {
        System.out.printf("Security guard %s is monitoring cameras.%n", getEmployedName());
    }
}

