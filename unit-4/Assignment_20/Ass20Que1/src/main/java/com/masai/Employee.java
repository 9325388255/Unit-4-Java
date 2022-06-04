package com.masai;

import javax.persistence.*;
import javax.persistence.AttributeOverrides;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="eid")
public class Employee extends Person{
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name = "city", column = @Column(name = "home_city")),
		@AttributeOverride(name = "state", column = @Column(name = "home_state")),
		@AttributeOverride(name = "pincode", column = @Column(name = "home_pincode"))
	})
	private Address homeAddress;
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name = "city", column = @Column(name = "office_city")),
		@AttributeOverride(name = "state", column = @Column(name = "office_state")),
		@AttributeOverride(name = "pincode", column = @Column(name = "office_pincode"))
	})
	private Address officeAddress; 
	
	private int salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(Address homeAddress, Address officeAddress, int salary) {
		super();
		this.homeAddress = homeAddress;
		this.officeAddress = officeAddress;
		this.salary = salary;
	}

	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	public Address getOfficeAddress() {
		return officeAddress;
	}

	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [homeAddress=" + homeAddress + ", officeAddress=" + officeAddress + ", salary=" + salary + "]";
	}
}
