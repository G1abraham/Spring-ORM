package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvc.entities.User;
import springmvc.service.UserService;

@Controller
public class HomeController {
	
	@Autowired
	private UserService userService;		
	
	@RequestMapping({"/","/signup"})
	public String signup() {
		System.out.println("This is the registration page");
		return "index";
	}
	
	@RequestMapping(value= "/processForm", method= RequestMethod.POST)
	public String home(@ModelAttribute User user, Model model) {
		this.userService.createUser(user);
		return "Home";
	}
	
	

}
