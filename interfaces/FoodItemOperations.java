package interfaces;

import java.lang.*;
import classes.*;

public interface FoodItemOperations
{
	boolean insertFoodItem(FoodItem foodItem); 
	boolean removeFoodItem(FoodItem foodItem); 
	FoodItem searchFoodItem(String foodItemNumber); 
	void showAllFoodItems(); 
}