package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class jdbc_1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, InterruptedException {
		
		
		
		
		String name;
		int id;
		
//		Scanner scan=new Scanner(System.in);
//		System.out.println("please enter the name:");
//		name=scan.nextLine();
//		
//		System.out.println("please enter the id:");
//		id=scan.nextInt();
		Class.forName("com.mysql.cj.jdbc.Driver");  //reflection

		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Demo","root","root");
		//if
		
		
		System.out.println("connection Opened");
		try(con) //avoiding memory Leaks.
		{
			//Statement stmt=con.createStatement(); //Most Prone SQL injection.
			
			PreparedStatement stmt2=con.prepareStatement("delete from student where id=2;");
			
			//?,? =>1,2
		
//			stmt2.setInt(1, id);
//			stmt2.setString(2, name);
			//String sql="insert into student values(1,'dada');";
			
			// int i=stmt2.executeUpdate(); //integer. DDL,DML
			
			//ResultSet rs=stmt2.executeQuery();
			
			boolean flag=stmt2.execute();
			//result => table =>true
			//integer => false
			
//			while(rs.next())
//			{
//				System.out.println("ID:"+rs.getInt("id"));
//				System.out.println("NAME:"+rs.getString("name"));
//				System.out.println("**************************************");
//			}
			
			System.out.println(flag);
		
		} 
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		System.out.println(con.isClosed());

	}

}
