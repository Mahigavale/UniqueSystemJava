package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc_2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, InterruptedException {
		//STEP 1
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		//CL
		//Locate, Link, Load
		//Provided the path => .jar file.
		// use all the requirements from this Driver.class
		
		//STEP 2
		
		
		//Opening the connection. (.JAVA<=>.sql)
		// Relation between Autocloseable and Try with resource.
		//()=========()
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");
		//IF           //CL
		
	   	//STEP 3
		
		
		  // Creating a Statement=> Statement and PrepareStatement
		 // Statement=> Static Queries.
		//PrepareStatment => dynamic Queries.
		Statement stmt= con.createStatement();
		 String sql="create table student (id int  primary key, name varchar(30) unique);";
		//IF
	
		 
		 
		 
		 //STEP 4 => Execute the prewritten Query.
		 // Execute => T/F=> F=>inetger=>DDL,DMl otherwise T=>DQL
		 //ExecuteUpdate => integer => no. of rows affetced 2
		 //ExecuteQuery => resultset=> Table.
		 
		 
		 boolean result=stmt.execute(sql); 
		 //Execute => DDL and DQL
		 
		
		 System.out.println(result+"False");
		 
		 con.close();

	}

}
