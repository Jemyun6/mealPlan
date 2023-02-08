package Web;

import repositories.*;
import java.net.URI;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
public class Controller {
	@SuppressWarnings("unchecked")
	@GetMapping("mealplanner/day")
	public ResponseEntity<DayResponse> getDayMeals(String numCalories, String diet,
						String exclusions) {
						return (ResponseEntity<DayResponse>) getSpoonacularResponse(numCalories, diet, exclusions, "day", DayResponse.class);
		
	}
	
	@SuppressWarnings("unchecked")
	@GetMapping("mealplanner/week")
	public ResponseEntity<WeekResponse> getWeekMeals(String numCalories, String diet, String exclusions) {
		return (ResponseEntity<WeekResponse>) getSpoonacularResponse(numCalories, diet, exclusions, "week", WeekResponse.class);
	}
	
	private ResponseEntity<?> getSpoonacularResponse(String numCalories, 
						String diet, String exclusions, String timeFrame, Class<?> responseClass) {
		//https://api.spoonacular.com/food/products/search?query=yogurt&apiKey=API-KEY
		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/food/products/search")
						.queryParam("query", "yogurt")
						.queryParam("apiKey", "29018fd7eaef4189a30833b84bcabcab");
		
		URI uri = builder.build().toUri();
		
		RestTemplate rt = new RestTemplate();
		ResponseEntity<?> respoEntity = rt.getForEntity(uri, responseClass);
		
		return respoEntity;
	}

}
