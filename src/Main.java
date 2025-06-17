import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many employees will be registered?");
        int employees = scanner.nextInt();

        List <Employee> employeesList = new ArrayList<>();


        for (int i = 0; i < employees; i++) {
            System.out.println("Employee #" + (i + 1) + ":");
            System.out.print("Id: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consumir salto de línea

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Salary: ");
            double salary = scanner.nextDouble();

            Employee employee = new Employee();
            employee.setId(id);
            employee.setName(name);
            employee.setSalary(salary);

            employeesList.add(employee);
        }

        System.out.println("Enter the employee id that will have a salary increase:");
        int id = scanner.nextInt();
        System.out.println("Enter the percentage:");
        double percentage = scanner.nextDouble();

        for (Employee employee : employeesList) {
            if (employee.getId() == id) {
                employee.increaseSalary(percentage);
            }
        }

        System.out.println("List of employees:");
        for (Employee employee : employeesList) {
            System.out.print(employee);
        }
    }
}