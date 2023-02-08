package repositories;

import java.util.List;

public class Meal {
	private Integer id;
	private String title;
	private String imageType;
	private Integer readyInMinutes;
	private Integer servings; 
	private List<String> sourceUrls;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getImageType() {
		return imageType;
	}
	public void setImageType(String imageType) {
		this.imageType = imageType;
	}
	public Integer getReadyInMinutes() {
		return readyInMinutes;
	}
	public void setReadyInMinutes(Integer readyInMinutes) {
		this.readyInMinutes = readyInMinutes;
	}
	public Integer getServings() {
		return servings;
	}
	public void setServings(Integer servings) {
		this.servings = servings;
	}
	public List<String> getSourceUrls() {
		return sourceUrls;
	}
	public void setSourceUrls(List<String> sourceUrls) {
		this.sourceUrls = sourceUrls;
	}
	@Override
	public String toString() {
		return "Meal [id=" + id + ", title=" + title + ", imageType=" + imageType + ", readyInMinutes=" + readyInMinutes
				+ ", servings=" + servings + ", sourceUrls=" + sourceUrls + "]";
	}
	
	

}
