package ribbonService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@Autowired
	private HelloService helloService;
	@GetMapping(value="/hi")
	public String hi(String name) {
		return helloService.hiService(name);
	}
}
