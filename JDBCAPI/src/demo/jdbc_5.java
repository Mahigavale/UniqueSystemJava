package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class jdbc_5 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
     Class.forName("com.mysql.cj.jdbc.Driver");

		try(
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
		
		
		
		
		
		PreparedStatement stmt=con.prepareStatement("insert into student values (?,?)");)
		{
		
				con.setAutoCommit(false);
		
		Scanner scan=new Scanner(System.in);
		for(int i =0;i<5;i++)
		{
			System.out.println("Enter the id:");
			int id=scan.nextInt();
			
			scan.nextLine();
			System.out.println("ENter the name:");
			String name=scan.nextLine();
			stmt.setInt(1,id);
			stmt.setString(2, name);
			
			stmt.addBatch();
		}
		
		int[] arr=stmt.executeBatch();
		
		
		 for(int i:arr)
		 {
			 System.out.println(i);
		 }
		 //Instead of 5 commits
		 //Only one Commit at a time.
		con.commit();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
