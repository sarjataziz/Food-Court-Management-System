package classes;

import java.lang.*;

public class Appitizers extends FoodItem 
{
	private String size;

	public Appitizers()
	{
		//System.out.println();
	}
	public Appitizers(String foodItemNumber, String name, int availableQuantity, double price, String size)
	{
		super(foodItemNumber, name, availableQuantity, price);
		this.size = size;
	}
	public void setSize(String size)
	{
		this.size = size;
	}
	public String getSize()
	{
		return size;
	}
	@Override
	public void showInfo()
	{
		System.out.println("# Appitizers : ");
		System.out.println("________________________________________________________________________");
		System.out.println("Food Item's Number             : " +foodItemNumber + ". ");
		System.out.println("Food Item's Name               : " +name + ". ");
		System.out.println("Food Item's Available Quantity : " +availableQuantity + ". ");
		System.out.println("Food Item's Price              : " +price + "Tk. ");
		System.out.println("Food Item's Size               : " +size + ". ");
		System.out.println("________________________________________________________________________");
	}
}
