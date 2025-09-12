package demo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class jdbc_4 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");

		
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
		
		
		CallableStatement call=con.prepareCall("{call getallstudents()}");
		
		
		ResultSet rs=call.executeQuery();
		
		while(rs.next())
		{
			System.out.println(rs.getInt(1));
		}

		 rs.close();
		 call.close();
		 con.close();
	}

}
