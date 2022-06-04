package com.dao;

import java.sql.*;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;

import com.masai.exceptions.EmployeeException;
import com.masai.model.Employee;
import com.masai.utility.DBUtil;

public class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public String saveEmployeeDetails(Employee employee) {
		String message = "Record not saved";

		try(Connection conn = DBUtil.provideConnection()){
			PreparedStatement ps = conn.prepareStatement("INSERT INTO employee VALUES(?, ?, ?, ?)");

			ps.setInt(1, employee.getEid());
			ps.setString(2, employee.getName());
			ps.setString(3, employee.getAddress());
			ps.setInt(4, employee.getSalary());

			int row = ps.executeUpdate();

			if(row > 0) message = "Record saved successfully";

		}
		catch(SQLException e) {
			message = e.getMessage();
		}

		return message;
	}

	@Override
	public Employee getEmployeeById(int empId) throws EmployeeException {
		Employee employee = null;

		try(Connection conn = DBUtil.provideConnection()){
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM employee WHERE eid = ?");
			ps.setInt(1,empId);

			ResultSet rs = ps.executeQuery();

			if(rs.next()) {
				employee = new Employee();
				employee.setEid(rs.getInt(1));
				employee.setName(rs.getString(2));
				employee.setAddress(rs.getString(3));
				employee.setSalary(rs.getInt(4));
			}
			else {
				throw new EmployeeException("Employee Record does not exist for given EmpId");
			}

		}
		catch(SQLException e) {
			throw new EmployeeException(e.getMessage());
		}

		return employee;
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> employees = new ArrayList<>();

		try(Connection conn = DBUtil.provideConnection()){
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM employee");
			ResultSet rs = ps.executeQuery();

			while(rs.next()) {
				Employee emp = new Employee();
				emp.setEid(rs.getInt(1));
				emp.setName(rs.getString(2));
				emp.setAddress(rs.getString(3));
				emp.setSalary(rs.getInt(4));
				employees.add(emp);
			}

		}
		catch(SQLException se) {
			System.out.println(se.getMessage());
			se.printStackTrace();
		}

		return employees;
	}

	@Override
	public String deleteEmployee(int empId) throws EmployeeException {
		String message = "Record not deleted";

		Employee existingEmployee = getEmployeeById(empId);

		try(Connection conn = DBUtil.provideConnection()){
			PreparedStatement ps = conn.prepareStatement("DELETE FROM employee WHERE eid = ?");
			ps.setInt(1, empId);
			int row = ps.executeUpdate();
			if(row>0) message = "Record deleted successfully";
		}
		catch(SQLException se) {
			throw new EmployeeException(se.getMessage());
		}

		return message;
	}

}