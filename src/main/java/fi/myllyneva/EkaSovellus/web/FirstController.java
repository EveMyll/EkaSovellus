package fi.myllyneva.EkaSovellus.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FirstController {

	@RequestMapping("/index")
	@ResponseBody
	public String returnGreetingIndex() {
		return "This is the main page";
	}

	@RequestMapping("/contact")
	@ResponseBody
	public String returnGreetingContact() {
		return "This is the contact page";
	}

	@RequestMapping("/hello")
	@ResponseBody
	public String returnGreetingForLocationAndName(
			@RequestParam(name = "location", defaultValue = "moon") String location,
			@RequestParam(name = "name", defaultValue = "John") String name) {
		return "Welcome to the " + location + " " + name + "!";
	}
}

