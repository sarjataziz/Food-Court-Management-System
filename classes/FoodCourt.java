package classes;

import java.lang.*;
import interfaces.*;

public class FoodCourt implements RestaurantOperations, EmployeeOperations
{
	Restaurant[] listOfRestaurants = new Restaurant[1000];
	Employee[] listOfEmployees = new Employee[100];

	@Override
    public boolean insertRestaurant(Restaurant restaurant)
    {
        boolean flag = false;
        for (int i = 0; i < listOfRestaurants.length; i++) {
            if (listOfRestaurants[i] == null) {
                listOfRestaurants[i] = restaurant;
                flag = true;
                break;
            }
        }
        return flag;
    }
    @Override
    public boolean removeRestaurant(Restaurant restaurant) 
    {
        boolean flag = false;
        for (int i = 0; i < listOfRestaurants.length; i++) {
            if (listOfRestaurants[i] == restaurant) {
                listOfRestaurants[i] = null;
                flag = true;
                break;
            }
        }
        return flag;
    }
    @Override
    public Restaurant searchRestaurant(String restaurantID)
    {
        Restaurant restaurant = null;

        for (int i = 0; i < listOfRestaurants.length; i++) {
            if (listOfRestaurants[i] != null) {
                if (listOfRestaurants[i].getRestaurantID().equals(restaurantID)) {
                    restaurant = listOfRestaurants[i];
                    break;
                }
            }
        }
        return restaurant;
    }
    @Override
    public void showAllRestaurants()
    {
        System.out.println("**************************************************************");
        System.out.println();

        for(int i=0; i < listOfRestaurants.length; i++)
        {
            if(listOfRestaurants[i] != null)
            {
                System.out.println("..............................................................");
                listOfRestaurants[i].showAllFoodItems();
                System.out.println("..............................................................");
            }
        }
    }

    @Override
    public boolean insertEmployee(Employee employee)
    {
        boolean flag = false;
        for (int i = 0; i < listOfEmployees.length; i++) {
            if (listOfEmployees[i] == null) {
                listOfEmployees[i] = employee;
                flag = true;
                break;
            }
        }
        return flag;
    }
    @Override
    public boolean removeEmployee(Employee employee)
    {
        boolean flag = false;
        for (int i = 0; i < listOfEmployees.length; i++) {
            if (listOfEmployees[i] == employee) {
                listOfEmployees[i] = null;
                flag = true;
                break;
            }
        }
        return flag;
    }
    @Override
    public Employee searchEmployee(String employeeID)
    {
        Employee employee = null;

        for (int i = 0; i < listOfEmployees.length; i++) {
            if (listOfEmployees[i] != null) {
                if (listOfEmployees[i].getEmployeeID().equals(employeeID)) {
                    employee = listOfEmployees[i];
                    break;
                }
            }
        }
        return employee;
    }
    @Override
    public void showAllEmployees()
    {
        System.out.println("**************************************************************");
        System.out.println();

        for(int i=0; i < listOfEmployees.length; i++)
        {
            if(listOfEmployees[i] != null)
            {
                System.out.println("# Employee : ");
                System.out.println("..............................................................");
                System.out.println("Employee Id      : " +listOfEmployees[i].getEmployeeID());
                System.out.println("Employee Name    : " +listOfEmployees[i].getName());
                System.out.println("Employee Salary  : " +listOfEmployees[i].getSalary() + " Tk");
                System.out.println("..............................................................");
            }
        }
    }
}