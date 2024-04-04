import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeRecordCRUD {

    private static List<Employee> employeeList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    // Create operation
    public static void createEmployee() {
        System.out.println("Enter employee ID:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter employee name:");
        String name = scanner.nextLine();
        System.out.println("Enter employee position:");
        String position = scanner.nextLine();
        Employee employee = new Employee(id, name, position);
        employeeList.add(employee);
        System.out.println("Employee created successfully.");
    }

    // Read operation
    public static void readEmployee() {
        System.out.println("Enter employee ID to search:");
        int id = Integer.parseInt(scanner.nextLine());
        for (Employee employee : employeeList) {
            if (employee.getId() == id) {
                System.out.println("Employee found:");
                System.out.println(employee);
                return;
            }
        }
        System.out.println("Employee with ID " + id + " not found.");
    }

    // Update operation
    public static void updateEmployee() {
        System.out.println("Enter employee ID to update:");
        int id = Integer.parseInt(scanner.nextLine());
        for (Employee employee : employeeList) {
            if (employee.getId() == id) {
                System.out.println("Enter new name:");
                String name = scanner.nextLine();
                System.out.println("Enter new position:");
                String position = scanner.nextLine();
                employee.setName(name);
                employee.setPosition(position);
                System.out.println("Employee updated successfully.");
                return;
            }
        }
        System.out.println("Employee with ID " + id + " not found.");
    }

    // Delete operation
    public static void deleteEmployee() {
        System.out.println("Enter employee ID to delete:");
        int id = Integer.parseInt(scanner.nextLine());
        for (Employee employee : employeeList) {
            if (employee.getId() == id) {
                employeeList.remove(employee);
                System.out.println("Employee deleted successfully.");
                return;
            }
        }
        System.out.println("Employee with ID " + id + " not found.");
    }

    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            System.out.println("\nEmployee Record CRUD Console Application");
            System.out.println("1. Create Employee");
            System.out.println("2. Read Employee");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit");
            System.out.println("Enter your choice:");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    createEmployee();
                    break;
                case 2:
                    readEmployee();
                    break;
                case 3:
                    updateEmployee();
                    break;
                case 4:
                    deleteEmployee();
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }
        scanner.close();
    }
}

class Employee {
    private int id;
    private String name;
    private String position;

    public Employee(int id, String name, String position) {
        this.id = id;
        this.name = name;
        this.position = position;
    }

    public int getId() {
        return id;
    }
public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
