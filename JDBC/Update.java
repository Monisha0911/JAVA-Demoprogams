package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Update {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/studentdb",
                    "root",
                    "sjbit"
            );

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the Student ID to update: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter new subject: ");
            String subject = scanner.nextLine();

            System.out.print("Enter new marks: ");
            int marks = scanner.nextInt();

            String sql = "UPDATE students SET subject = ?, marks = ? WHERE Studentid = ?";
            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setString(1, subject);
            ps.setInt(2, marks);
            ps.setInt(3, id);

            int rowsUpdated = ps.executeUpdate();
            System.out.println(rowsUpdated + " record(s) updated.");

            connection.close();
            scanner.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

