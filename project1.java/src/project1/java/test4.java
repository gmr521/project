package project1.java;

import java.util.*;
import java.sql.*;

public class test4 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		while(true) {
			System.out.println("Enter 1-->TO DISPLAY DATA IN DB \n"+"Enter 2-->TO INSERT VALUES IN DB \n"+"Enter 3--> EXIT");
			int input=s.nextInt();
			switch(input) {
			case 1:
				displayallbook();
				break;
			case 2:
				InsertBook();
				break;
			case 3:
				System.exit(0);
			}
		}
}
	private static void displayallbook() {
		
        try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/db2","root","Mohan521*");
	        Statement stmt=con.createStatement();
	        
	        String sql="select * from books ";
	        ResultSet rs=stmt.executeQuery(sql);
	        while(rs.next()) {
	        	System.out.println("BooksId: "+rs.getInt(1)+" BooksName: "+rs.getString(2)+" Author: "+rs.getString(3));
	        }
	        	stmt.close();
	 	        con.close();
	        
	        
	        
	}catch (ClassNotFoundException|SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	

	}
		
	}
	private static void InsertBook() {
		Scanner s=new Scanner(System.in);
	      try {
				
	    	    Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/db2","root","Mohan521*");
		        Statement stmt=con.createStatement();
			
	        System.out.println("Enter ID");
	        int bookid=s.nextInt();
	        System.out.println("Enter Name");
	        String bookname=s.next();
	        System.out.println("Enter Author");
	        String authorname=s.next();
	        String sql1="insert into books values (?,?,?)";
	         PreparedStatement pstmt=con.prepareStatement(sql1);
	        
	        int i=stmt.executeUpdate(sql1);
	        System.out.println("the value is inserted");
	      }
	      catch (ClassNotFoundException|SQLException e) {
				
				e.printStackTrace();
				}
		
		
	}


}	
 

