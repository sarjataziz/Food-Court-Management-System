package classes;

import java.lang.*;
import interfaces.*;

public abstract class FoodItem implements IQuantity 
{
	protected String foodItemNumber;
	protected String name;
	protected int availableQuantity;
	protected double price;

	public FoodItem()
	{
		//System.out.println();
	}
	public FoodItem(String foodItemNumber, String name, int availableQuantity, double price)
	{
		this.foodItemNumber = foodItemNumber;
		this.name = name;
		this.availableQuantity = availableQuantity;
		this.price = price;
	}

	public void setFoodItemNumber(String foodItemNumber)
	{
		this.foodItemNumber = foodItemNumber;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setAvailableQuantity(int availableQuantity)
	{
		this.availableQuantity = availableQuantity;
	}

	public String getFoodItemNumber()
	{
		return foodItemNumber;
	}
	public String getName()
	{
		return name;
	}
	public int getAvailableQuantity()
	{
		return availableQuantity;
	}
	public double getPrice()
	{
		return price;
	}
	@Override
	public boolean addQuantity(int amount)
	{
		if(amount > 0){
			availableQuantity += amount;
			return true;
		}
		else{
			return false;
		}
	}
	@Override
	public boolean sellQuantity(int amount)
	{
		if (amount > 0 && availableQuantity > 0 && amount <= availableQuantity) {
			availableQuantity -= amount;
			return true;
		}
		else{
			return false;
		}
	} 

	public abstract void showInfo();
}