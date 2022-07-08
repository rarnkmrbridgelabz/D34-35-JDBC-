package com.csv.D34_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCEmpPayroll {

	public static void main(String[] args) throws SQLException {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_payroll_service",
					"root", "9952625052");
			Statement statement = connection.createStatement();
			
			int updatedRow = statement.executeUpdate("update employee_payroll set Basic_pay = 3000000.00 WHERE name = 'Terisa';");
			
			System.out.println("Changed Rows :=" + updatedRow);
		}
		catch (SQLException e) {
			
			System.out.println("****UNABLE TO CONNECT TO DATABASE****");
		}
		finally {
			connection.close();
		}
	}
}
