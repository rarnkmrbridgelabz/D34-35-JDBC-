package com.csv.D34_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCEmpPayroll {

	public static void main(String[] args) throws SQLException {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_payroll_service",
					"root", "9952625052");
			PreparedStatement preparedStatement = connection.prepareStatement("update employee_payroll set Basic_pay = 3000000.00 WHERE name = 'Terisa';");
			
			int updatedRow = preparedStatement.executeUpdate("update employee_payroll set Basic_pay = 3500000.00 WHERE name = 'Terisa'");
			
			System.out.println("Changed Rows :=" + updatedRow);
		}
		catch (SQLException e) {
			
			System.out.println("****UNABLE TO CONNECT AND UPDATE TO DATABASE****");
		}
		finally {
			connection.close();
		}
	}
}
