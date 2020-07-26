package in.sunil.movieinfoservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/info")
public class InfoResource {
	
	@RequestMapping("/movie")
	public String movieInfo() {
		return "Hello From Movie Info Service" ;
	}

}
