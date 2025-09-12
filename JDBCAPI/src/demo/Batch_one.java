package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Batch_one {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");  

		
		try(	  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
				   Scanner scan=new Scanner(System.in);
				   PreparedStatement stmt=con.prepareStatement("insert into student values(?,?);")
				)
		{
			int id;
			String name;
			
			con.setAutoCommit(false);
			
			for(int i=0;i<5;i++)
			{
				System.out.println("enter the id:");
				
			    id=scan.nextInt();
			    
			    scan.nextLine();
		
			    System.out.println("enter the name:");
			    name=scan.nextLine();
				
			    stmt.setInt(1, id);
			    stmt.setString(2, name);
			    
			    System.out.println("Adding to the batch:::");
			    stmt.addBatch();// 1, "A":: 2,"B:: 
			}
			
			try {
			System.out.println("Executing the batch::::");
			int[] i=stmt.executeBatch();
			
			for(int j:i)
			{
				System.out.println(j);
			}
			System.out.println("Commiting the data:::");
			con.commit();
			}
			catch(Exception e)
			{
				System.out.println("Exception occured:: intiating rollback...");
				con.rollback();
			}
			finally
			{
				System.out.println("Process completed");
			}
			
		}
		
		
		 catch (Exception e)
		 {
			 System.out.println(e.getMessage());
		 }
	
		
		
		
	}

}
