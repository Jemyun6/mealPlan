package repositories;

public class Nutrition {
	private Double calories;
	private Double carbohydrates;
	private Double fat;
	private Double protein;
	private Double cholesterol;
	private Double Sodiem;
	private Double fiber;
	public Double getCalories() {
		return calories;
	}
	public void setCalories(Double calories) {
		this.calories = calories;
	}
	public Double getCarbohydrates() {
		return carbohydrates;
	}
	public void setCarbohydrates(Double carbohydrates) {
		this.carbohydrates = carbohydrates;
	}
	public Double getFat() {
		return fat;
	}
	public void setFat(Double fat) {
		this.fat = fat;
	}
	public Double getProtein() {
		return protein;
	}
	public void setProtein(Double protein) {
		this.protein = protein;
	}
	public Double getCholesterol() {
		return cholesterol;
	}
	public void setCholesterol(Double cholesterol) {
		this.cholesterol = cholesterol;
	}
	public Double getSodiem() {
		return Sodiem;
	}
	public void setSodiem(Double sodiem) {
		Sodiem = sodiem;
	}
	public Double getFiber() {
		return fiber;
	}
	public void setFiber(Double fiber) {
		this.fiber = fiber;
	}
	@Override
	public String toString() {
		return "Nutrition [calories=" + calories + ", carbohydrates=" + carbohydrates + ", fat=" + fat + ", protein="
				+ protein + ", cholesterol=" + cholesterol + ", Sodiem=" + Sodiem + ", fiber=" + fiber + "]";
	}
	
	
}
