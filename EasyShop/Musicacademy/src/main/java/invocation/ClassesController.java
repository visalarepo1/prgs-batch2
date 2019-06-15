package invocation;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("/greeting/Shadjamam")
public class ClassesController {
	
		String name;
		String grade;
		int id;
		String teacherName;
		
		
		 @GetMapping("/greeting/Shadjama")
		public String passParametersWithModelMap(ModelMap map) {
			 map.addAttribute("href","/Shadjama");
			return "Shadjama";
		}
		 public ArrayList<Students>sa(){
			 ArrayList<Students> ss=new ArrayList<Students>();
			 ss.get(0).setName("Manvi");
			 ss.get(0).setid(1);
			 ss.get(1).setName("Anuhya");
			 ss.get(1).setid(2);
			return ss;
		 }
		 
		 
}