package www.dream.com.api.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/apis/*")
public class JusoController {
	
	@GetMapping(value="juso")
	public void jusoCall() {
		
	}
	
	@PostMapping(value="juso")
	public void jusoCallBack() {

	}
	
	
}
