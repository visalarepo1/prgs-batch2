package ProductDetailsform;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class productGreetingController {
    @GetMapping("/greeting")
    public String greetingForm(Model model, String string) {
    	
    	ProductGreeting hello= new ProductGreeting();
    	hello.setContent("xx");
    	hello.setId(2);
    	
        model.addAttribute("greeting", new ProductGreeting());
        return "greeting";
    }

    @PostMapping("/greeting")
    public String greetingSubmit(@ModelAttribute ProductGreeting ProductGreeting) {
        return "result";
    }

}




