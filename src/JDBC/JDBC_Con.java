package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Con {

	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Sample","root","admin");
		System.out.println("DataBase created");
		
		Statement stmt=con.createStatement();  
		ResultSet rs=stmt.executeQuery("select * from DB");  
		while(rs.next())  
		System.out.println(rs.getInt(1)+"  "+rs.getString(2));  
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		//Insert
		PreparedStatement stmt1=con.prepareStatement("insert into DB values(?,?)");  
		stmt1.setInt(1,107);//1 specifies the first parameter in the query  
		stmt1.setString(2,"rahul");  
		  
		int i=stmt1.executeUpdate();  
		System.out.println(i+" records inserted");
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		 //Delete
		PreparedStatement st=con.prepareStatement("Delete from DB where id=107");  
		int j=st.executeUpdate();
		System.out.println(j+"Record Deleted");
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		//Order by
		ResultSet rs1=stmt.executeQuery("select * from DB order by id desc"); 
		while(rs1.next())  
			System.out.println(rs1.getInt(1)+"  "+rs1.getString(2));  
		System.out.println("sorted");
		
		
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
