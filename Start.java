import java.lang.*;
import java.util.*;
import java.io.*;
import classes.*;
import fileio.*;

public class Start 
{
	public static void main(String[] args) {
		
		FoodCourt foodCourt = new FoodCourt();

		FileReadWriteDemo frwd = new FileReadWriteDemo();

		Scanner input = new Scanner(System.in);

		boolean repeat = true;

		System.out.println();
		System.out.println("\tIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
		System.out.println("\t                 Welcome to Our Food-Court            ");
		System.out.println("\tIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
		System.out.println();

		while(repeat)
		{
			System.out.println("-----------------------------------------------------");
			System.out.println();
			System.out.println("# What do you want to choose?\n");
			System.out.println("1.	Employee Management. ");
			System.out.println("2.	Restaurant Management. ");
			System.out.println("3.	Restaurant FoodItem Management. ");
			System.out.println("4.	FoodItem Quantity Add-Sell. ");
			System.out.println("5.	Exit. ");
			System.out.println();
			System.out.println("-----------------------------------------------------");

			System.out.println();
			System.out.print("Enter your choice : ");
			int choice = input.nextInt();
			System.out.println();

			switch(choice)
			{
				//------------------------------------------------ Case 1(1st Skeleton) ----------------------------------

				case 1:
					System.out.println("********************************************************************");
					System.out.println("Your Choice Is :	Employee Management ");
					System.out.println("********************************************************************");
					System.out.println();

					System.out.println("-----------------------------------------------------");
					//System.out.println();
					System.out.println("# Here are your options: \n");
					System.out.println("1.	Insert New Employee  ");
					System.out.println("2.	Remove Existing Employee  ");
					System.out.println("3.	Show All Employees  ");
					System.out.println("4.	Search an Employee  ");
					System.out.println("5.	Go Back  ");
					//System.out.println();
					System.out.println("-----------------------------------------------------");
					System.out.println();

					System.out.print("Enter your option : ");
					int option1 = input.nextInt();
					System.out.println();

				//------------------------------------------------ Option 1(2nd Skeleton) ----------------------------------

					switch(option1)
					{
						case 1:
							System.out.println("********************************************************************");
							System.out.println("Your Option Is :	Insert New Employee  ");
							System.out.println("********************************************************************");
							System.out.println();

							System.out.print("Enter Employee ID     : ");
							String employeeID1 = input.next();

							System.out.print("Enter Employee Name   : ");
							String employeeName1 = input.next();

							System.out.print("Enter Employee Salary : ");
							double salary1 = input.nextDouble();

							Employee employee1 = new Employee();
							employee1.setEmployeeID(employeeID1);
							employee1.setName(employeeName1);
							employee1.setSalary(salary1);

							if (foodCourt.insertEmployee(employee1)) {
								System.out.println();
								System.out.println("You inserted Employee.... Employee's ID : " +employee1.getEmployeeID());
							}
							else {
								System.out.println("Sorry, You Done Something Wrong. ");
							}

							System.out.println();
							break;

						case 2:
							System.out.println("********************************************************************");
							System.out.println("Your Option Is :	Remove Existing Employee  ");
							System.out.println("********************************************************************");
							System.out.println();

							System.out.print("Enter Employee ID : ");
							String employeeID2 = input.next();

							Employee employee2 = foodCourt.searchEmployee(employeeID2);

							if (employee2 != null) {
								if (foodCourt.removeEmployee(employee2)) {
									System.out.println();
									System.out.println("You Remove Employee.... Employee's ID : " +employee2.getEmployeeID());
								}
								else {
									System.out.println("\nSorry, Something is doing wrong....");
								}
							}
							else {
								System.out.println("\nSorry..... No such Employees are bearing this ID.");
								System.out.println("Please, try again...");
							}

							System.out.println();
							break;

						case 3:
							System.out.println("********************************************************************");
							System.out.println("Your Option Is :	Show All Employees  ");
							System.out.println("********************************************************************");
							System.out.println();

							foodCourt.showAllEmployees();

							System.out.println();
							break;

						case 4:
							System.out.println("********************************************************************");
							System.out.println("Your Option Is :	Search an Employee  ");
							System.out.println("********************************************************************");
							System.out.println();

							System.out.print("Enter Employee ID : ");
							String employeeID4 = input.next();

							Employee employee4 = foodCourt.searchEmployee(employeeID4);

							if (employee4 != null) {
								System.out.println();
								System.out.println("........ Employee is Found .......\n");
								System.out.println("Employee ID     : " +employee4.getEmployeeID());
								System.out.println("Employee Name   : " +employee4.getName());
								System.out.println("Employee Salary : " +employee4.getSalary() + " Tk");
								System.out.println();
							}
							else {
								System.out.println("\nSorry..... No such Employees are bearing this ID.");
								System.out.println("Please, try again...");
							}

							System.out.println();
							break;

						case 5:
							System.out.println("********************************************************************");
							System.out.println("Your Option Is :	Go Back  ");
							System.out.println("********************************************************************");
							System.out.println();

							//System.out.println();
							break;

						default:

							System.out.println("********************************************************************");
							System.out.println("Your Option Is :	Invalid  ");
							System.out.println("********************************************************************");
							System.out.println();
					}

					System.out.println();
					break;

				
				//------------------------------------------------ Case 2(1st Skeleton) ----------------------------------

				case 2:
					System.out.println("********************************************************************");
					System.out.println("Your Choice Is :	Restaurant Management ");
					System.out.println("********************************************************************");
					System.out.println();

					System.out.println("-----------------------------------------------------");
					//System.out.println();
					System.out.println("# Here are your options: \n");
					System.out.println("1.	Insert New Restaurant   ");
					System.out.println("2.	Remove Existing Restaurant   ");
					System.out.println("3.	Show All Restaurants   ");
					System.out.println("4.	Search a Restaurant   ");
					System.out.println("5.	Go Back  ");
					//System.out.println();
					System.out.println("-----------------------------------------------------");
					System.out.println();

					System.out.print("Enter your option : ");
					int option2 = input.nextInt();
					System.out.println();

				//------------------------------------------------ Option 2(2nd Skeleton) ----------------------------------

					switch(option2)
					{
						case 1:
							System.out.println("********************************************************************");
							System.out.println("Your Option Is :	Insert New Restaurant  ");
							System.out.println("********************************************************************");
							System.out.println();

							System.out.print("Enter the Restaurant ID   : ");
							String restaurantID1 = input.next();
							System.out.print("Enter the Restaurant Name : ");
							String restaurantName1 = input.next();

							Restaurant restaurant1 = new Restaurant();
							restaurant1.setRestaurantID(restaurantID1);
							restaurant1.setName(restaurantName1);

							if (foodCourt.insertRestaurant(restaurant1)) {
								System.out.println("\nYou inserted Restaurant.... Restaurant's ID : " +restaurant1.getRestaurantID());
							}
							else {
								System.out.println("\nSorry, You Done Something Wrong. ");
							}

							System.out.println();
							break;

						case 2:
							System.out.println("********************************************************************");
							System.out.println("Your Option Is :	Remove Existing Restaurant  ");
							System.out.println("********************************************************************");
							System.out.println();

							System.out.print("Enter the Restaurant's ID : ");
							String restaurantID2 = input.next();

							Restaurant restaurant2 = foodCourt.searchRestaurant(restaurantID2);

							if (restaurant2 != null) {
								if (foodCourt.removeRestaurant(restaurant2)) {
									System.out.println("\nYou Remove Restaurant.... Restaurant's ID : " +restaurant2.getRestaurantID());
								}
								else {
									System.out.println("\nSorry, Something is doing wrong....");
								}
							}
							else {
								System.out.println("\nSorry..... No such Restaurants are bearing this ID.");
								System.out.println("Please, try again...");
							}

							System.out.println();
							break;

						case 3:
							System.out.println("********************************************************************");
							System.out.println("Your Option Is :	Show All Restaurant  ");
							System.out.println("********************************************************************");
							System.out.println();

							foodCourt.showAllRestaurants();
							
							System.out.println();
							break;

						case 4:
							System.out.println("********************************************************************");
							System.out.println("Your Option Is :	Search a Restaurant  ");
							System.out.println("********************************************************************");
							System.out.println();

							System.out.print("Enter the Restaurant's ID : ");
							String restaurantID4 = input.next();

							Restaurant restaurant4 = foodCourt.searchRestaurant(restaurantID4);

							if (restaurant4 != null) {
								System.out.println();
								System.out.println("........ Restaurant is Found .......\n");
								System.out.println("Restaurant's ID     : " +restaurant4.getRestaurantID());
								System.out.println("Restaurant's Name   : " +restaurant4.getName());
								//System.out.println();
								System.out.println();
							}
							else {
								System.out.println("\nSorry..... No such Restaurants are bearing this ID.");
								System.out.println("Please, try again...");
							}

							System.out.println();
							break;

						case 5:
							System.out.println("********************************************************************");
							System.out.println("Your Option Is :	Go Back  ");
							System.out.println("********************************************************************");
							System.out.println();

							break;

						default:

							System.out.println("********************************************************************");
							System.out.println("Your Option Is :	Invalid  ");
							System.out.println("********************************************************************");
							System.out.println();
					}

					System.out.println();
					break;

				//------------------------------------------------ Case 3(1st Skeleton) ----------------------------------

				case 3:
					System.out.println("********************************************************************");
					System.out.println("Your Choice Is :	Restaurant FoodItem Management ");
					System.out.println("********************************************************************");
					System.out.println();

					System.out.println("-----------------------------------------------------");
					//System.out.println();
					System.out.println("# Here are your options: \n");
					System.out.println("1.	Insert New FoodItem   ");
					System.out.println("2.	Remove Existing FoodItem   ");
					System.out.println("3.	Show All FoodItems   ");
					System.out.println("4.	Search a FoodItem   ");
					System.out.println("5.	Go Back  ");
					//System.out.println();
					System.out.println("-----------------------------------------------------");
					System.out.println();

					System.out.print("Enter your option : ");
					int option3 = input.nextInt();
					System.out.println();

				//------------------------------------------------ Option 3(2nd Skeleton) ----------------------------------

					switch(option3)
					{
						case 1:
							System.out.println("********************************************************************");
							System.out.println("Your Option Is :	Insert New FoodItem  ");
							System.out.println("********************************************************************");
							System.out.println();

							System.out.println("# There are two types of Food-Items in our Restaurant : ");
							System.out.println("1.   Appitizers. ");
							System.out.println("2.   Main Dish. ");
							System.out.println("3.   Go Back. ");
							System.out.println();

							System.out.print("Enter the type of Food-Item : ");
							int type = input.nextInt();

							FoodItem foodItem1 = null;

							if (type == 1) {
								System.out.println("\n.... Your selected Type is Appitizers ....\n");

								System.out.print("Enter the Food-Item's Name   : ");
								String foodItemName1 = input.next();

								System.out.print("Enter the Food-Item's Number : ");
								String foodItemNumber1 = input.next();

								System.out.print("Enter the Food-Item's Available Quantity : ");
								int foodItemAvailableQuantity1 = input.nextInt();

								System.out.print("Enter the Food-Item's Price : ");
								double foodItemPrice1 = input.nextDouble();

								System.out.print("Enter the Food-Item's Size : ");
								String foodItemSize1 = input.next();

								Appitizers appitizers1 = new Appitizers(foodItemNumber1, foodItemName1, foodItemAvailableQuantity1, foodItemPrice1, foodItemSize1);

								foodItem1 = appitizers1;
							}

							else if (type == 2) {
								System.out.println("\n.... Your selected Type is Main Dish ....\n");

								System.out.print("Enter the Food-Item's Name   : ");
								String foodItemName2 = input.next();

								System.out.print("Enter the Food-Item's Number : ");
								String foodItemNumber2 = input.next();

								System.out.print("Enter the Food-Item's Available Quantity : ");
								int foodItemAvailableQuantity2 = input.nextInt();

								System.out.print("Enter the Food-Item's Price : ");
								double foodItemPrice2 = input.nextDouble();

								System.out.print("Enter the Food-Item's Category : ");
								String foodItemCategory2 = input.next();

								MainDish mainDish1 = new MainDish(foodItemNumber2, foodItemName2, foodItemAvailableQuantity2, foodItemPrice2, foodItemCategory2);

								foodItem1 = mainDish1;
							}
							else if (type == 3) {
								System.out.println("Go to Back...");
							}
							else{
								System.out.println("..... You Selected Invalid Type .....");
							}

							if (foodItem1 != null) {
								System.out.print("Enter the Restaurant ID : ");
								String restaurantID0 = input.next();

								Restaurant restaurant0 = foodCourt.searchRestaurant(restaurantID0);

								if (restaurant0 != null) {
									if (restaurant0.insertFoodItem(foodItem1)) {
										System.out.println("\nFood-Item has been inserted....");
										System.out.println("Food-Item's Number : " +foodItem1.getFoodItemNumber());
									}
								}
								else {
									System.out.println("\nSorry, Something is doing wrong.....");
								}
							}

							System.out.println();
							break;

						case 2:
							System.out.println("********************************************************************");
							System.out.println("Your Option Is :	Remove Existing FoodItem  ");
							System.out.println("********************************************************************");
							System.out.println();

							System.out.print("Enter the Restaurant ID : ");
							String restaurantID01 = input.next();

							Restaurant restaurant01 = foodCourt.searchRestaurant(restaurantID01);

							if (restaurant01 != null) {

								System.out.print("Enter the Food-Item's Number : ");
								String foodItemNumber01 = input.next();

								FoodItem foodItem2 = restaurant01.searchFoodItem(foodItemNumber01);

								if (foodItem2 != null) {
									if (restaurant01.removeFoodItem(foodItem2)) {
									System.out.println("\nFood-Item has been removed....");
									System.out.println("Food-Item's Number : " +foodItem2.getFoodItemNumber());
									}
								}
								else {
									System.out.println("\nSorry..... No such Food-Item is bearing this Number.");
									System.out.println("Please, try again...");
								}
							}
							else {
								System.out.println("\nSorry..... No such Restaurant is bearing this Number.");
								System.out.println("Please, try again...");
							}
							
							System.out.println();
							break;

						case 3:
							System.out.println("********************************************************************");
							System.out.println("Your Option Is :	Show All FoodItems  ");
							System.out.println("********************************************************************");
							System.out.println();

							System.out.print("Enter the Restaurant ID : ");
							String restaurantID02 = input.next();

							Restaurant restaurant02 = foodCourt.searchRestaurant(restaurantID02);

							if (restaurant02 != null) {
								restaurant02.showAllFoodItems();
							}
							else {
								System.out.println("\nSorry, No such Restaurant is bearing this ID.....");
								System.out.println("Please, try again......");
							}

							System.out.println();
							break;

						case 4:
							System.out.println("********************************************************************");
							System.out.println("Your Option Is :	Search a FoodItem  ");
							System.out.println("********************************************************************");
							System.out.println();

							System.out.print("Enter the Restaurant ID : ");
							String restaurantID03 = input.next();

							Restaurant restaurant03 = foodCourt.searchRestaurant(restaurantID03);

							if (restaurant03 != null) {

								System.out.print("Enter the Food-Item's Number : ");
								String foodItemNumber02 = input.next();

								FoodItem foodItem3 = restaurant03.searchFoodItem(foodItemNumber02);
 
								if (foodItem3 != null) {
									System.out.println();
									System.out.println("........ Food-Item is Found .......\n");
									foodItem3.showInfo();
									System.out.println();
								}
								else {
									System.out.println("\nSorry..... No such Food-Items are bearing this Number.");
									System.out.println("Please, try again...");
								}
							}
							else {
								System.out.println("\nSorry..... No such Restaurant is bearing this Number.");
								System.out.println("Please, try again...");
							}

							//System.out.println();
							break;

						case 5:
							System.out.println("********************************************************************");
							System.out.println("Your Option Is :	Go Back  ");
							System.out.println("********************************************************************");
							System.out.println();

							break;

						default:

							System.out.println("********************************************************************");
							System.out.println("Your Option Is :	Invalid  ");
							System.out.println("********************************************************************");
							System.out.println();
					}

					System.out.println();
					break;

				//------------------------------------------------ Case 4(1st Skeleton) ----------------------------------

				case 4:
					System.out.println("********************************************************************");
					System.out.println("Your Choice Is :	FoodItem Quantity Add-Sell ");
					System.out.println("********************************************************************");
					System.out.println();

					System.out.println("-----------------------------------------------------");
					//System.out.println();
					System.out.println("# Here are your options: \n");
					System.out.println("1.	Add FoodItem   ");
					System.out.println("2.	Sell FoodItem   ");
					System.out.println("3.	Show Add Sell History   ");
					System.out.println("4.	Go Back  ");
					//System.out.println();
					System.out.println("-----------------------------------------------------");
					System.out.println();

					System.out.print("Enter your option : ");
					int option4 = input.nextInt();
					System.out.println();

				//------------------------------------------------ Option 4(2nd Skeleton) ----------------------------------

					switch(option4)
					{
						case 1:
							System.out.println("********************************************************************");
							System.out.println("Your Option Is :	Add FoodItem  ");
							System.out.println("********************************************************************");
							System.out.println();

							System.out.print("Enter the Restaurant ID : ");
							String restaurantID04 = input.next();

							Restaurant restaurant04 = foodCourt.searchRestaurant(restaurantID04);

							if (restaurant04 != null) {
								System.out.print("Enter the Food-Item's Number : ");
								String foodItemNumber01 = input.next();

								FoodItem foodItem041 = restaurant04.searchFoodItem(foodItemNumber01);

								if (foodItem041 != null) {
									System.out.println("\nCurrent Available Quantity : " +foodItem041.getAvailableQuantity());
									System.out.print("Enter Add Quantity         : ");
									int foodItemAdd01 = input.nextInt();

									if (foodItem041.addQuantity(foodItemAdd01)) {
										System.out.println("New Available Quantity     : " +foodItem041.getAvailableQuantity() + " [After Add]");
										frwd.writeInFile(foodItemAdd01 + " Add Quantity in " +foodItem041.getFoodItemNumber() + ". ");
									}
									else {
									System.out.println("\nSorry, Something is doing wrong....");			
									}
								}
								else {
								System.out.println("\nSorry, No such Food-Items are bearing this Number.....");
								System.out.println("Please, try again......");
								}
							}
							else {
								System.out.println("\nSorry, No such Restaurant is bearing this ID.....");
								System.out.println("Please, try again.......");
							}
							System.out.println();
							break;

						case 2:
							System.out.println("********************************************************************");
							System.out.println("Your Option Is :	Sell FoodItem  ");
							System.out.println("********************************************************************");
							System.out.println();

							System.out.print("Enter the Restaurant ID : ");
							String restaurantID05 = input.next();

							Restaurant restaurant05 = foodCourt.searchRestaurant(restaurantID05);

							if (restaurant05 != null) {
								System.out.print("Enter the Food-Item's Number : ");
								String foodItemNumber01 = input.next();

								FoodItem foodItem041 = restaurant05.searchFoodItem(foodItemNumber01);

								if (foodItem041 != null) {
									System.out.println("\nCurrent Available Quantity : " +foodItem041.getAvailableQuantity());
									System.out.print("Enter Sell Quantity        : ");
									int foodItemAdd01 = input.nextInt();

									if (foodItem041.sellQuantity(foodItemAdd01)) {
										System.out.println("New Available Quantity     : " +foodItem041.getAvailableQuantity() + " [After Sell]");
										frwd.writeInFile(foodItemAdd01 + " Sell Quantity in " +foodItem041.getFoodItemNumber() + ". ");
									}
									else {
									System.out.println("\nSorry, Something is doing wrong....");			
									}
								}
								else {
								System.out.println("\nSorry, No such Food-Items are bearing this Number.....");
								System.out.println("Please, try again......");
								}
							}
							else {
								System.out.println("\nSorry, No such Restaurant is bearing this ID.....");
								System.out.println("Please, try again.......");;
							}
							System.out.println();
							break;

						case 3:
							System.out.println("********************************************************************");
							System.out.println("Your Option Is :	Show Add Sell History  ");
							System.out.println("********************************************************************");
							System.out.println();

							System.out.println("# History of Add-Sell : ");
							System.out.println("______________________________________\n");
							frwd.readFromFile();
							System.out.println("______________________________________");
							System.out.println();
							break;

						case 4:
							System.out.println("********************************************************************");
							System.out.println("Your Option Is :	Go Back  ");
							System.out.println("********************************************************************");
							System.out.println();

							break;

						default:

							System.out.println("********************************************************************");
							System.out.println("Your Option Is :	Invalid  ");
							System.out.println("********************************************************************");
							System.out.println();
					}

					System.out.println();
					break;

				//------------------------------------------------ Case 5(1st Skeleton) ----------------------------------

				case 5:
					repeat = false;
					System.out.println("********************************************************************");
					System.out.println("      Thank You For Using Our Management System    ");
					System.out.println("********************************************************************");
					System.out.println();

					break;

				default:
					
					System.out.println("********************************************************************");
					System.out.println("Your Choice Is :	This is invalid Choice ");
					System.out.println("********************************************************************");
					System.out.println();
			}
		}
		input.close();
	}
}
