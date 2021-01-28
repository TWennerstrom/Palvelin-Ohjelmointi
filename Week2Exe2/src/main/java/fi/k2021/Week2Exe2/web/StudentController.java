package fi.k2021.Week2Exe2.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import fi.k2021.Week2Exe2.domain.Student;

@Controller
public class StudentController {
	
	@RequestMapping("/hello")
	public String showStudents(Model model) {
		ArrayList<Student> studentList = new ArrayList<>();
		
	studentList.add(new Student("Matti", "Korhonen"));
	studentList.add(new Student("Jaana", "Virtanen"));
	System.out.println(studentList);
	
	model.addAttribute("students", studentList);
	return "studentlist";
	}

}
