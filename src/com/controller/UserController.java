/**
 * 
 */
package com.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

	@RequestMapping(value = { "/", "/welcome" })
	public ModelAndView welcome() {
		ModelAndView model = new ModelAndView();
		model.addObject("title", "Welcome Page");
		model.addObject("msg", "Hello user");
		model.setViewName("index");
		return model;
	}

	@RequestMapping(value = "/admin**")
	public ModelAndView admin() {
		ModelAndView model = new ModelAndView();
		model.addObject("title", "Admin Page");
		model.addObject("msg", "Hello Admin");
		model.setViewName("adminPage");
		return model;
	}   

	@RequestMapping(value = "/user**")
	public ModelAndView userPage() {
		ModelAndView model = new ModelAndView();
		model.addObject("title", "User Page");
		model.addObject("msg", "Hello User");
		model.setViewName("user");
		return model;
	} 

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login11(@RequestParam(value = "error", required = false) String error,
			@RequestParam(value = "logout", required = false) String logout) {

		ModelAndView model = new ModelAndView();
		if (error != null) {
			model.addObject("error", "Invalid Credentials");
		}

		if (logout != null) {
			model.addObject("message", "You've been successfully logout.");

		}

		model.setViewName("login");
		return model;

	}

	@RequestMapping("/logout")
	public String showLoggedout() {
		return "logout";
	}

	// for 403 access denied page
	@RequestMapping(value = "/403", method = RequestMethod.GET)
	public ModelAndView accesssDenied(Principal user) {

		ModelAndView model = new ModelAndView();

		if (user != null) {
			model.addObject("msg", "Hi " + user.getName() + ", you do not have permission to access this page!");
		} else {
			model.addObject("msg", "You do not have permission to access this page!");
		}

		model.setViewName("403");
		return model;

	}
}
