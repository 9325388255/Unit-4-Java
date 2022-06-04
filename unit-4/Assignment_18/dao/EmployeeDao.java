package com.dao;

import java.util.List;

import com.masai.exceptions.EmployeeException;
import com.masai.model.Employee;

public interface EmployeeDao {

	public String saveEmployeeDetails(Employee employee);

	public Employee getEmployeeById(int empId) throws EmployeeException;

	public List<Employee> getAllEmployees();

	public String deleteEmployee(int empId) throws EmployeeException;

}