package pkgEmpleados;

public class Marketing extends Employed {

    public Marketing(String employedName, String idEmployed, String gender, String employmentType, double baseSalary, int age, double workHours, String designSkill, String analyticalSkills, String creativity) {
        super(employedName, idEmployed, gender, employmentType, baseSalary, age, workHours);
    }

    public void advertise() {
        System.out.printf("Marketing employee %s is advertising.%n", getEmployedName());
    }

    public void marketResearch() {
        System.out.printf("Marketing employee %s is conducting market research.%n", getEmployedName());
    }

    public void studySEO() {
        System.out.printf("Marketing employee %s is studying SEO.%n", getEmployedName());
    }

    public void manageSocialMedia() {
        System.out.printf("Marketing employee %s is managing social media.%n", getEmployedName());
    }

    public void createPromotions() {
        System.out.printf("Marketing employee %s is creating promotions.%n", getEmployedName());
    }

    public void makeAdvertisements() {
        System.out.printf("Marketing employee %s is making advertisements.%n", getEmployedName());
    }
}

