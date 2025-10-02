import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class EMP_DB_APP {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/empdb";
        String user = "postgres";
        String password = "root";
        Scanner sc = new Scanner(System.in);
        boolean option = true;
        int choice;


        CRUDOperation operation = new CRUDOperation(url, user, password);

        while (option) {
            System.out.println("PRESS :\n1:ADD DATA\n2:VIEW DATA\n3:UPDATE DATA\n4:DELETE DATA\n5:EXIT LOOP");
            choice = sc.nextInt();
            try {
                switch (choice) {
                    case 1:
                        sc.nextLine();
                        System.out.println("Enter the name: ");
                        String name = sc.nextLine();
                        System.out.println("Enter the department: ");
                        String dept = sc.nextLine();
                        System.out.println("Enter the salary: ");
                        double salary = sc.nextDouble();
                        operation.addEmployee(name, dept, salary);
                        break;
                    case 2:

                        operation.viewEmployee();
                        break;
                    case 3:
                        System.out.println("Enter the id of the employee want to update");
                        int id = sc.nextInt();
                        sc.nextLine();
                        operation.updateEmployee(id);
                        break;
                    case 4:
                        System.out.println("Enter the id you of the employee you want to delete: ");
                        int deleteId = sc.nextInt();
                        sc.nextLine();
                        operation.deleteEmployee(deleteId);
                        break;
                    case 5:
                        System.out.println("Exiting loop...");
                        option = false;
                        break;
                    default:
                        System.out.println("Invalid Choice!!");
            }
            } catch (SQLException e) {
                System.out.println("Connectoin Error");
                e.printStackTrace();
            }
        }
    }
}
