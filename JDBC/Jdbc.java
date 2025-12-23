package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Jdbc 
{

	@SuppressWarnings("unused")
	private static String sql;

	@SuppressWarnings("unused")
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


		String sql ="insert into students values(?,?,?,?)";
		Scanner scanner= new Scanner(System.in);
		
		for (int i = 1; i <= 5; i++) 
		{
        System.out.println("Enter details for student " + i + ":");
            
		System.out.println("Enter the id:");
		int id = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Enter the name:");
		String name = scanner.nextLine();
		
		 System.out.println("Enter the subject:");
         String subject = scanner.nextLine();

         System.out.println("Enter the marks:");
         int marks = scanner.nextInt();
         
			PreparedStatement preparedstatement = connection.prepareStatement(sql);
			preparedstatement.setInt(1, id);
	        preparedstatement.setString(2, name);
	        preparedstatement.setString(3, subject);
	        preparedstatement.setInt(4, marks);
			
	        int rows = preparedstatement.executeUpdate();
			System.out.println(rows +"record inserted");
			connection.close();
		
		
		}
			
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
}
}
