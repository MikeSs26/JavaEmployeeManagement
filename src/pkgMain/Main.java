package pkgMain;

import java.util.Scanner;
import pkgEmpleados.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Menu:");
            System.out.println("1. Create Employee");
            System.out.println("2. Exit");
            System.out.print("Select an option: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    createEmployee(scanner);
                    break;
                case 2:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }

    private static void createEmployee(Scanner scanner) {
        System.out.println("Select employee type:");
        System.out.println("1. Manager");
        System.out.println("2. Secretary");

        System.out.print("Enter employee type: ");
        int type = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();
        System.out.print("Enter employee ID: ");
        String id = scanner.nextLine();

        Employed employee = null;

        switch (type) {
            case 1:
                employee = createManager(name, id, scanner);
                break;
            case 2:
                employee = createSecretary(name, id, scanner);
                break;
            default:
                System.out.println("Invalid employee type.");
                return;
        }

        if (employee != null) {
            System.out.println("Employee created:");
            System.out.println("Name: " + employee.getEmployedName());
            System.out.println("ID: " + employee.getIdEmployed());

        }
    }

    private static Manager createManager(String name, String id, Scanner scanner) {
        //prueba para crear dichos empleados
    }

    private static Secretary createSecretary(String name, String id, Scanner scanner) {
        //prueba para crear dichos empleados
    }

}
