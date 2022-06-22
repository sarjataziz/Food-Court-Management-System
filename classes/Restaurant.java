package classes;

import java.lang.*;
import interfaces.*;

public class Restaurant implements FoodItemOperations
{
    private String restaurantID;
    private String name;
    private FoodItem[] listOfFoodItems;

    public Restaurant()
    {
        //System.out.println();
        this.listOfFoodItems = new FoodItem[100];
    }
    public Restaurant(String restaurantID, String name, int sizeOfArray)
    {
        this.restaurantID = restaurantID;
        this.name = name;
        this.listOfFoodItems = new FoodItem[sizeOfArray];
    }
    public void setRestaurantID(String restaurantID)
    {
        this.restaurantID = restaurantID;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getRestaurantID()
    {
        return restaurantID;
    }
    public String getName()
    {
        return name;
    }
    @Override
    public boolean insertFoodItem(FoodItem foodItem)
    {
        boolean flag = false;
        for (int i = 0; i < listOfFoodItems.length; i++) {
            if (listOfFoodItems[i] == null) {
                listOfFoodItems[i] = foodItem;
                flag = true;
                break;
            }
        }
        return flag;
    }
    @Override
    public boolean removeFoodItem(FoodItem foodItem)
    {
        boolean flag = false;
        for (int i = 0; i < listOfFoodItems.length; i++) {
            if (listOfFoodItems[i] == foodItem) {
                listOfFoodItems[i] = null;
                flag = true;
                break;
            }
        }
        return flag;
    }
    @Override
    public FoodItem searchFoodItem(String foodItemNumber)
    {
        FoodItem foodItem = null;

        for(int i=0; i < listOfFoodItems.length; i++)
        {
            if(listOfFoodItems[i] != null)
            {
                if(listOfFoodItems[i].getFoodItemNumber().equals(foodItemNumber))
                {
                    foodItem = listOfFoodItems[i];
                    break;
                }
            }
        }
        return foodItem;
    }
    @Override
    public void showAllFoodItems()
    {
        System.out.println("#################################################################");
        System.out.println("Restaurant ID   : "+ restaurantID);
        System.out.println("Restaurant Name : "+ name);

        for (FoodItem showFood : listOfFoodItems) {
            if (showFood != null) {
                System.out.println("-------------------------------------------------------");
                showFood.showInfo();
                System.out.println("-------------------------------------------------------");
            }
        }
    }
}