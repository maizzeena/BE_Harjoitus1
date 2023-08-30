package CarDatabase.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CarController {
	
	@RequestMapping("index")
	@ResponseBody
	public String showMainPage() {
		return "This is the main page";
	}
	
	@RequestMapping("contact")
	@ResponseBody
	public String showContactPage() {
		return "This is the contact page";
	}
	
	@RequestMapping("hello")
	@ResponseBody
	public String sayHello(@RequestParam (name="location") String paikka, 
			@RequestParam (name="nimi") String nimi) {
		return "Welcome to the " + paikka + " " + nimi + "!";
	}
	
	/*@RequestMapping("main")
	@ResponseBody
	public String showMainPage() {
		return "Tämä on pääsivu";
	}
	
	@RequestMapping("moi")
	@ResponseBody
	public String sayHello(@RequestParam (name="nimesi") String nimi) {
		return ("hei " + nimi);
	}
	
	@RequestMapping("moi2")
	@ResponseBody
	public String sayHello2(@RequestParam (name="nimesi", required=false, defaultValue="Muumi") String nimi) {
		return ("hei " + nimi);
	}
	
	@RequestMapping("moi3")
	@ResponseBody
	public String sayHello3(@RequestParam (name="nimesi", required=false, defaultValue="Muumi") String nimi,
			@RequestParam (name="ika") int age) {
		return ("Hei " + nimi + ", " + age + " vuotta");
	}*/
}
	