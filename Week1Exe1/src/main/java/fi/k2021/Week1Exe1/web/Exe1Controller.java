package fi.k2021.Week1Exe1.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Exe1Controller {
	@RequestMapping ("index")
	@ResponseBody
	public String indexGreeting() {
		return "This is the main page";
	}
	
	@RequestMapping ("contact")
	@ResponseBody
	public String contactGreeting() {
		return "This is the contact page";
	}
}
