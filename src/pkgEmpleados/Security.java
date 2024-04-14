package pkgEmpleados;

public class Security extends Employed {
    private String agilityLevel;
    private float weight;
    private String previousExperience;

    public Security(String employedName, String idEmployed, String gender, String employmentType, double baseSalary, int age, double workHours, String agilityLevel, float weight, String previousExperience) {
        super(employedName, idEmployed, gender, employmentType, baseSalary, age, workHours);
        this.agilityLevel = agilityLevel;
        this.weight = weight;
        this.previousExperience = previousExperience;
    }

    public void protectBuilding() {
        System.out.println(String.format("Security guard %s is protecting the building.", getEmployedName()));
    }

    public void foreseeDangers() {
        System.out.println(String.format("Security guard %s is foreseeing dangers.", getEmployedName()));
    }

    public void eliminateHazards() {
        System.out.println(String.format("Security guard %s is eliminating hazards.", getEmployedName()));
    }

    public void guardObjects() {
        System.out.println(String.format("Security guard %s is guarding objects.", getEmployedName()));
    }

    public void nightPatrol() {
        System.out.println(String.format("Security guard %s is patrolling at night.", getEmployedName()));
    }

    public void monitorCameras() {
        System.out.println(String.format("Security guard %s is monitoring cameras.", getEmployedName()));
    }
}

