package repositories;
import java.util.*;

public class DayResponse {
	
	private List<Meal> meals;
	private Nutrition nutrient;
	
	public List<Meal> getMeals() {
		return meals;
	}
	public void setMeals(List<Meal> meals) {
		this.meals = meals;
	}
	public Nutrition getNutrient() {
		return nutrient;
	}
	public void setNutient(Nutrition nutient) {
		this.nutrient = nutient;
	}
	@Override
	public String toString() {
		return "DayResponse [meals=" + meals + ", nutient=" + nutrient + "]";
	}
	
	

}
