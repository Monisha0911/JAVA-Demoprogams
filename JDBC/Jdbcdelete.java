package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Jdbcdelete 
{
	public static void main(String[] args)
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/studentdb",
					"root",
					"sjbit"
					);
			
			
	@SuppressWarnings("unused")
	String sql= "insert into students values(?,?,?,?)";
	String deleteSql = "DELETE FROM students WHERE Studentid = ?";

		PreparedStatement preparedstatement = connection.prepareStatement(deleteSql);
		preparedstatement.setInt(1, 11);

		int row = preparedstatement.executeUpdate();
		System.out.println(row + " record deleted"); 
		connection.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
