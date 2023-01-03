package com.tnsif.client;
import java.sql.SQLException;

import com.tnsif.service.Service;

public class Executor {

	public static void main(String[] args) throws SQLException {
		Service ser=new Service();
		//ser.deleteStudnet();
		//ser.addStudent();
//		ser.getStudents();
		//ser.updateStudent();
		ser.storedProcedure();
		
}
}
