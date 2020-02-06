package hh.swd20.gitesimerkkiprojekti.webcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HelloController {
	
	@RequestMapping("/hello")
	public String sayHello() {
		return "Hello!";
	}

}
