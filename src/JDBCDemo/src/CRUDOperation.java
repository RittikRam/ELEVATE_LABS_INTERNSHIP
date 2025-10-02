import java.sql.*;
import java.util.Scanner;

public class CRUDOperation {
    String url;
    String user;
    String password;

    public CRUDOperation(String url, String user, String password) {
        this.url = url;
        this.user = user;
        this.password = password;
    }
    private Connection getConnection() throws SQLException{
        return DriverManager.getConnection(url,user,password);
    }

    public void addEmployee(String name, String department, double salary) throws SQLException {
        String sql = "Insert into employees(name,department,salary) values(?,?,?)";
        try(Connection conn = getConnection();
            PreparedStatement smt = conn.prepareStatement(sql)){
            smt.setString(1,name);
            smt.setString(2,department);
            smt.setDouble(3,salary);

            int rowsAffected = smt.executeUpdate();
            System.out.println("Number of rows affected : "+rowsAffected);
        }
    }
    public void viewEmployee() throws SQLException{
        String sql = "Select * from employees";
        try(Connection conn = getConnection();
        PreparedStatement smt = conn.prepareStatement(sql);
        ResultSet rs = smt.executeQuery()){
            while(rs.next()){
                System.out.println("-----------------------------------------");
                System.out.println("Id : "+rs.getInt("id"));
                System.out.println("Name : "+rs.getString("name"));
                System.out.println("Department : "+rs.getString("department"));
                System.out.println("Salary : "+rs.getDouble("salary"));
                System.out.println("-----------------------------------------");
            }
        }
    }

    public void updateEmployee(int id) throws SQLException{
        String sql = "UPDATE employees SET name = ?, department = ?, salary = ? WHERE id = ?";

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the new name: ");
        String upName = sc.nextLine();

        System.out.println("Enter the new Department: ");
        String upDept = sc.nextLine();

        System.out.println("Enter the new Salary: ");
        double upSal = sc.nextDouble();

        try(Connection conn = getConnection();
        PreparedStatement smt = conn.prepareStatement(sql)){
            smt.setString(1,upName);
            smt.setString(2,upDept);
            smt.setDouble(3,upSal);
            smt.setInt(4,id);

            int rowsAffected = smt.executeUpdate();
            System.out.println("Number of rows Affected : "+rowsAffected);

        }
    }

    public void deleteEmployee(int id) throws SQLException{
        String sql = "DELETE FROM employees where id = ?";
        try(Connection conn = getConnection();
        PreparedStatement smt = conn.prepareStatement(sql)){
            smt.setInt(1,id);
            int rowsAffected = smt.executeUpdate();
            System.out.println("Number of rows Affected are : "+rowsAffected);
        }
    }
}
