package interfaces;

import java.lang.*;
import classes.*;

public interface EmployeeOperations 
{
	boolean insertEmployee(Employee employee);
	boolean removeEmployee(Employee employee); 
	Employee searchEmployee(String employeeID); 
	void showAllEmployees(); 
}