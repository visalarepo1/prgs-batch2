package invocation;

import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class ClassesController {
	
		
		
		
		 @GetMapping("/greeting/Shadjama")
		public String Studentnames(Model  model) {
			
			List<Students> sa =new ArrayList<Students>();
			 sa.add(new Students("Manvi",1));
			 sa.add(new Students("Anuhaya",2));
			  model.addAttribute("Students",sa);
			  
			  
		 
			   
			return "Shadjamam";
			}
		
	
		 
}