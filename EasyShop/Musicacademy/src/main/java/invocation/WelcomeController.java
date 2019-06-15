package invocation;


	

	import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.ui.ModelMap;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.RequestParam;

	@Controller
	public class WelcomeController {

	    @GetMapping("/greeting")
	    public String passParametersWithModelMap(ModelMap map) {
	    	 map.addAttribute("welcomeMessage", "Shadjama");
	         map.addAttribute("message", "Rishbha");
	         map.addAttribute("Address", "Gandhara");
	        map.addAttribute("time", "4:00");
	       
	   
	        return "greeting";
	    }

	}

