package pkgEmpleados;

public class GraphicDesigner extends Employed {

    public GraphicDesigner(String employedName, String idEmployed, String gender, String employmentType, double baseSalary, int age, double workHours, String freelance, String availability, String tools) {
        super(employedName, idEmployed, gender, employmentType, baseSalary, age, workHours);
    }

    public void designVisualMaterial() {
        System.out.printf("Graphic designer %s is designing visual material.%n", getEmployedName());
    }

    public void collaborateCreativeProjects() {
        System.out.printf("Graphic designer %s is collaborating on creative projects.%n", getEmployedName());
    }

    public void presentProposals() {
        System.out.printf("Graphic designer %s is presenting proposals.%n", getEmployedName());
    }

    public void designLogos() {
        System.out.printf("Graphic designer %s is designing logos.%n", getEmployedName());
    }

    public void designWebsites() {
        System.out.printf("Graphic designer %s is designing websites.%n", getEmployedName());
    }

    public void createPosters() {
        System.out.printf("Graphic designer %s is creating posters.%n", getEmployedName());
    }

    public void calculateSalary() {
        double totalSalary = (getBaseSalary() * getWorkHours()) * 4;
        System.out.printf("Graphic designer %s total salary: $%.2f%n", getEmployedName(), totalSalary);
    }

    public void requestPermission() {
        System.out.printf("Graphic designer %s is requesting permission for absence.%n", getEmployedName());
    }

    public void organizeInventory() {
        System.out.printf("Graphic designer %s is organizing the inventory of products.%n", getEmployedName());
    }

    public void assistCustomers() {
        System.out.printf("Graphic designer %s is assisting customers during working hours.%n", getEmployedName());
    }
}

