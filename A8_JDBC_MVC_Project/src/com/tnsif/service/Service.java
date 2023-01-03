package com.tnsif.service;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import com.tnsif.dao.DBUtil;

public class Service {
	private PreparedStatement pst;
	private Statement st;
	private Connection con;
	private CallableStatement cs;
	
	public Service() throws SQLException {
		this.con = DBUtil.getConnectionObject();
		this.st = con.createStatement();
	}
	//Using Prepared statement
	public void addStudent() throws SQLException
	{
		String sql="insert into student(sid,sname,course) values(106,'Rohith Kumar','MECH')";
		this.pst=con.prepareStatement(sql);
		int row=pst.executeUpdate();
		System.out.println(row + "row"+ "afftected");
	}
	
	public void getStudents() throws SQLException{
		String sql="select * from student";
		ResultSet rs=st.executeQuery(sql);
		
		while(rs.next())
		{
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
		}
	}
	public void updateStudent() throws SQLException{
		String sql="update student set course='mech' where sid=102 ";
		
		int b=st.executeUpdate(sql);
		if(b>0) {
			System.out.println("Student data is  updated");
		}
		else
				
			System.out.println(b+"  row affected");
	}
  public void deleteStudnet() throws SQLException{
	  String sql="delete from student where sid=106";
		int i=st.executeUpdate(sql);
		System.out.println(i+"  row affected");
  }
  
  public void storedProcedure() throws SQLException
	{
		String query="CREATE PROCEDURE p3() BEGIN insert into student(sid,sname,course) values(107,'Rahul','MECH');\r\n"
				+ "insert into student(sid,sname,course) values(108,'Rakesh','MECH');\r\n"
				+ "insert into student(sid,sname,course) values(109,'Arjun','MECH');\r\n"
				+ "insert into student(sid,sname,course) values(110,'Swathi','MECH');\r\n"
				+ "END";
		cs=con.prepareCall(query);
		boolean b=st.execute(query);
		String query1=" call p1()";
		boolean b1=st.execute(query1);
		System.out.println(b);
	}
}
