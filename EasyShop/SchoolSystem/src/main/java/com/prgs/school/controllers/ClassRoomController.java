package com.prgs.school.controllers;


	import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.RequestParam;

	import com.prgs.school.services.ClassRoomService;

	@Controller
	public class ClassRoomController {
		
		 @GetMapping("/classrooms")
		 public String getClassRoomsNameDoesntMatter(Model model) {
			 
			 ClassRoomService crs = new ClassRoomService();
			 
			 model.addAttribute("classList", crs.getClassList());
			 
			 
			 return "classRoomsView";
		 }
		 
		 @GetMapping("/class")  
		 public String getClassMethodNameDoesntMatter(
				 @RequestParam(name="id", required=true) String classId,
				 Model model) {
			 
			 ClassRoomService crs = new ClassRoomService();
			 int classIdInt = Integer.valueOf(classId);
			 
			 model.addAttribute("cls", crs.getClassById(classIdInt));
			 
			 
			 return "classView";
		 }

}
