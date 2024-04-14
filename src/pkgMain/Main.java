package pkgMain;

import pkgEmpleados.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Employee Actions\n");

        Manager manager = new Manager("Angel Ramos", "ID001", "Male", "full", 5000.0, 30, 40, "IT", "Finance", 5);
        manager.manageTeam();
        System.out.println();

        Secretary secretary = new Secretary("Dimas Concepcion", "ID002", "Female", "full", 4000.0, 25, 40, "High", 36, true);
        secretary.organizeMeetings();
        System.out.println();

        DataAnalyst dataAnalyst = new DataAnalyst("Roberto Fernandez", "ID003", "Female", "part", 4500.0, 28, 20, "Python", "Intermediate", "Analytical thinking");
        dataAnalyst.presentResults();
        System.out.println();

        TechnicalSupport technicalSupport = new TechnicalSupport("Juan de Gracia", "ID004", "Male", "full", 3500.0, 25, 40, "Information Technology", 3, 10);
        technicalSupport.resolveIncidents();
        System.out.println();

        AdministrativeAssistant administrativeAssistant = new AdministrativeAssistant("Maria Lopez", "ID005", "Female", "part", 3000.0, 22, 20, "English", "Bachelor's degree", "Secretary");
        administrativeAssistant.manageDocuments();
        System.out.println();

        SoftwareEngineer softwareEngineer = new SoftwareEngineer("Pedro Ramirez", "ID006", "Male", "full", 6000.0, 35, 40, "Java, Python", "Finance management system", "Ana Smith");
        softwareEngineer.developSoftware();
        System.out.println();

        GraphicDesigner graphicDesigner = new GraphicDesigner("Laura Gutierrez", "ID007", "Female", "part", 4000.0, 28, 20, "Yes", "Flexible", "Adobe Illustrator, Photoshop");
        graphicDesigner.designVisualMaterial();
        System.out.println();

        Tester tester = new Tester("Carlos Ruiz", "ID008", "Male", "full", 3800.0, 27, 40, "Functional testing", "Selenium, JMeter", "2 years experience");
        tester.checkCode();
        System.out.println();

        Marketing marketing = new Marketing("Ana Martinez", "ID009", "Female", "part", 3500.0, 30, 20, "Graphic design", "Data analysis", "Creativity");
        marketing.advertise();
        System.out.println();

        Security security = new Security("David Gonzalez", "ID010", "Male", "full", 4000.0, 35, 40, "High", 80.5f, "5 years experience");
        security.protectBuilding();
        System.out.println();

        Janitor janitor = new Janitor("Elena Fernandez", "ID011", "Female", "full", 2500.0, 40, 40, "Morning shift", "Main hall", "Access control");
        janitor.cleanWindows();
        System.out.println();

        System.out.println("Exiting...");
    }
}
