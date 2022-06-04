package com.masai;

import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Department {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int deptId;
	private String dname;
	private String location;
//	
//	@OneToMany
//	private List<Employee> emps=new ArrayList<Employee>();
//	

	@OneToMany(cascade= CascadeType.ALL)
    @JoinTable(name="dept_emp",joinColumns=@JoinColumn(name="did"),inverseJoinColumns=@JoinColumn(name="eid"))
	private List<Employee> emps=new ArrayList<Employee>();
	
	public Department() {
		// TODO Auto-generated constructor stub
	}

	public Department(int deptId, String dname, String location) {
		super();
		this.deptId = deptId;
		this.dname = dname;
		this.location = location;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<Employee> getEmps() {
		return emps;
	}

	public void setEmps(List<Employee> emps){
		this.emps = emps;
	}

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", dname=" + dname + ", location=" + location + "]";
	}
}
