package fi.k2021.Week1Exe2.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Exe2Controller {
	@RequestMapping("hello")
	@ResponseBody
	public String returnGreeting(@RequestParam(name="location") String paikka,
			@RequestParam(name="name") String nimi) {
		return "Welcome to the " + paikka + " " + nimi + "!";
	}
}
