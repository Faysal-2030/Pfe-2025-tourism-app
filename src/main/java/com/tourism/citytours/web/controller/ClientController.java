package com.tourism.citytours.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ma.abisoft.persistence.model.User;

@Controller
public class ClientController {
	
	
/*	 @GetMapping("/Client/index")
	    public String getClientIndex() {
	        return "Client/index";
	    }*/
	 
	 @RequestMapping(value = "/Client/index")
		public ModelAndView wxAutoLogin(HttpServletRequest request, HttpServletResponse response) throws Exception {
			ModelAndView ret = new ModelAndView();
			HttpSession session = request.getSession();
		User user =(User)session.getAttribute("user1");
			System.out.println("usernnnnnnnnnnnnnnnnnnn"+user.getEmail());
			if(user!=null) {
				ret.addObject("user", user);
			}
			ret.setViewName("/Client/index");
			return ret;

		}
	 
	 @RequestMapping(value = "/Admin/index")
		public ModelAndView wxAutoLogin1(HttpServletRequest request, HttpServletResponse response) throws Exception {
			ModelAndView ret = new ModelAndView();
			HttpSession session = request.getSession();
		User user =(User)session.getAttribute("user1");
			System.out.println("usernnnnnnnnnnnnnnnnnnn"+user.getEmail());
			if(user!=null) {
				ret.addObject("user", user);
			}
			ret.setViewName("/Admin/index");
			return ret;

		}
}
