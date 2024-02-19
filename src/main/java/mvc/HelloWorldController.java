package mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
	

	@GetMapping("/showForm")
	public String showForm() {

		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {

		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionTwo")
	public String processFormVersionTwo( @RequestParam("student")String name ,Model model) {
        model.addAttribute("name", name.toUpperCase());
		return "helloworld";
	}

}
