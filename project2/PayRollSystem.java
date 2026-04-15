import java.util.*;
public class PayRollSystem{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();
        while (true) {
            System.out.println("\n1. Add Full-Time Employee");
            System.out.println("2. Add Part-Time Employee");
            System.out.println("3. Display Payroll");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id1 = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name1 = sc.nextLine();
                    System.out.print("Enter Monthly Salary: ");
                    double salary = sc.nextDouble();
                    employees.add(new FullTimeEmployee(id1, name1, salary));
                    break;
                case 2:
                    System.out.print("Enter ID: ");
                    int id2 = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name2 = sc.nextLine();
                    System.out.print("Enter Hours Worked: ");
                    int hours = sc.nextInt();
                    System.out.print("Enter Hourly Rate: ");
                    double rate = sc.nextDouble();
                    employees.add(new PartTimeEmployee(id2, name2, hours, rate));
                    break;
                case 3:
                    System.out.println("\n--- Payroll ---");
                    for (Employee emp : employees) {
                        System.out.println(
                                "ID: " + emp.getId() +
                                        "\nName: " + emp.getName() +
                                        "\nSalary: ₹" + emp.calculateSalary()
                        );
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
