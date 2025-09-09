package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc_3 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
		
		
		// insert the data from the java class to the table.
		
		
		Statement stmt=con.createStatement();
		
		
		
		String sql="select * from student where id >=4;";
				
				int i=stmt.executeUpdate(sql);
				// no. of rows affected  or 0 when the query returns nothing.
				
				System.out.println(i);
				con.close();
				// no of rows affected
				// 0=> if the sql statement  returns nothing.
	}

}
