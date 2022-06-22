package classes;

import java.lang.*;

public class Employee
{
	private String name;
	private String employeeID;
	private double salary;

	public Employee()
	{
		//System.out.println();
	}
	public Employee(String name, String employeeID, double salary)
	{
		this.name = name;
		this.employeeID = employeeID;
		this.salary =  salary;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	public void setEmployeeID(String employeeID)
	{
		this.employeeID = employeeID;
	}
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	public String getName()
	{
		return name;
	}
	public String getEmployeeID()
	{
		return employeeID;
	}
	public double getSalary()
	{
		return salary;
	}

}