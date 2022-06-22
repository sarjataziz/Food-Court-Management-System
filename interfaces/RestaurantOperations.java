package interfaces;

import java.lang.*;
import classes.*;

public interface RestaurantOperations 
{
	boolean insertRestaurant(Restaurant restaurant); 
	boolean removeRestaurant(Restaurant restaurant); 
	Restaurant searchRestaurant(String restaurantID); 
	void showAllRestaurants(); 
}