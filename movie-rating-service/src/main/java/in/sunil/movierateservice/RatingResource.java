package in.sunil.movierateservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rating")
public class RatingResource {

	@RequestMapping("detail")
	public String ratingDetails() {
		return "Hello From Rating Service";
	}
}
