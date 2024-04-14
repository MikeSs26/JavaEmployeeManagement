package pkgEmpleados;

public class Marketing extends Employed {
    private String designSkill;
    private String analyticalSkills;
    private String creativity;

    public Marketing(String employedName, String idEmployed, String gender, String employmentType, double baseSalary, int age, double workHours, String designSkill, String analyticalSkills, String creativity) {
        super(employedName, idEmployed, gender, employmentType, baseSalary, age, workHours);
        this.designSkill = designSkill;
        this.analyticalSkills = analyticalSkills;
        this.creativity = creativity;
    }

    public void advertise() {
        System.out.println(String.format("Marketing employee %s is advertising.", getEmployedName()));
    }

    public void marketResearch() {
        System.out.println(String.format("Marketing employee %s is conducting market research.", getEmployedName()));
    }

    public void studySEO() {
        System.out.println(String.format("Marketing employee %s is studying SEO.", getEmployedName()));
    }

    public void manageSocialMedia() {
        System.out.println(String.format("Marketing employee %s is managing social media.", getEmployedName()));
    }

    public void createPromotions() {
        System.out.println(String.format("Marketing employee %s is creating promotions.", getEmployedName()));
    }

    public void makeAdvertisements() {
        System.out.println(String.format("Marketing employee %s is making advertisements.", getEmployedName()));
    }
}

