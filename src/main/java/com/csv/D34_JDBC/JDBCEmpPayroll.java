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
			statement.execute(
					"insert into employee_payroll (name, Department, gender, Basic_Pay, deduction, taxable_pay, tax, net_pay, start) values ('Kumar', 'Marketing', 'M', 80000, 9000, 30000, 317000, 245600, '2022-07-10');");
		}catch (SQLException e) {
			System.out.println("****UNABLE TO CONNECT TO DATABASE****");
		}
		finally {
			connection.close();
		}
	}
}
