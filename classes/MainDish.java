package classes;

import java.lang.*;

public class MainDish extends FoodItem 
{
	private String category;

	public MainDish()
	{
		//System.out.println();
	}
	public MainDish(String foodItemNumber, String name, int availableQuantity, double price, String category)
	{
		super(foodItemNumber, name, availableQuantity, price);
		this.category = category;
	}
	public void setCategory(String category)
	{
		this.category = category;
	}
	public String getCategory()
	{
		return category;
	}

	@Override
	public void showInfo()
	{
		System.out.println("# Main Dish : ");
		System.out.println("________________________________________________________________________");
		System.out.println("Food Item's Number             : " +foodItemNumber + ". ");
		System.out.println("Food Item's Name               : " +name + ". ");
		System.out.println("Food Item's Available Quantity : " +availableQuantity + ". ");
		System.out.println("Food Item's Price              : " +price + "Tk. ");
		System.out.println("Food Item's Category           : " +category + ". ");
		System.out.println("________________________________________________________________________");
	}

}