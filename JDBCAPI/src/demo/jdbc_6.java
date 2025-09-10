package demo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class jdbc_6 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");  

		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
		
		
		CallableStatement callable=con.prepareCall("{call getallstudents}");
		
		//{}=> this is a procedure call . convert it into the specific.
		
		
		 ResultSet  rs=callable.executeQuery();
		
	System.out.println(rs !=null);
	
	rs.close();
	callable.close();
	con.close();
		

	}

}
