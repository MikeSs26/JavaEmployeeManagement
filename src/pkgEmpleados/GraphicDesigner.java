package pkgEmpleados;

public class GraphicDesigner extends Employed {
    private String freelance;
    private String availability;
    private String tools;

    public GraphicDesigner(String employedName, String idEmployed, String gender, String employmentType, double baseSalary, int age, double workHours, String freelance, String availability, String tools) {
        super(employedName, idEmployed, gender, employmentType, baseSalary, age, workHours);
        this.freelance = freelance;
        this.availability = availability;
        this.tools = tools;
    }

    public void designVisualMaterial() {
        System.out.println(String.format("Graphic designer %s is designing visual material.", getEmployedName()));
    }

    public void collaborateCreativeProjects() {
        System.out.println(String.format("Graphic designer %s is collaborating on creative projects.", getEmployedName()));
    }

    public void presentProposals() {
        System.out.println(String.format("Graphic designer %s is presenting proposals.", getEmployedName()));
    }

    public void designLogos() {
        System.out.println(String.format("Graphic designer %s is designing logos.", getEmployedName()));
    }

    public void designWebsites() {
        System.out.println(String.format("Graphic designer %s is designing websites.", getEmployedName()));
    }

    public void createPosters() {
        System.out.println(String.format("Graphic designer %s is creating posters.", getEmployedName()));
    }
}

