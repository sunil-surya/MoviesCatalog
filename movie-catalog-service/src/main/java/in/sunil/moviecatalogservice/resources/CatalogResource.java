package in.sunil.moviecatalogservice.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/catalog")
public class CatalogResource {
	
	@RequestMapping("/hello")
	public String hello() {
		 return "Hello Sunil T ";
	}

}
