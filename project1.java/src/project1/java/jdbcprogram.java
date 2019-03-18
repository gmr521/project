package project1.java;
import java.sql.*;
public class jdbcprogram {
public static void main(String args[])
{
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db2","root","Mohan521*");
				System.out.println("connected");
	Statement stmt=con.createStatement();
	//String sql="UPDATE customers SET customername ='mohan'   where customerid=1";
		String sql="select * from customers";
	//int i= stmt.executeUpdate(sql);
	ResultSet rs=stmt.executeQuery(sql);
	while(rs.next()) {
		System.out.printf("customerid"+rs.getInt(1)+"customername"+rs.getString(2));
		//System.out.println("customername"+rs.getString(2));
	}
	
	//System.out.println("the value is inseerted");
	stmt.close();
	con.close();
	
	
				
	}
	catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}
}
}
