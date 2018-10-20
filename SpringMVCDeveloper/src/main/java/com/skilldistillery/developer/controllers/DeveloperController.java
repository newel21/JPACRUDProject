package com.skilldistillery.developer.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.skilldistillery.developer.data.DeveloperDAO;
import com.skilldistillery.developer.entities.Developer;

@Controller
public class DeveloperController {

	@Autowired
	private DeveloperDAO devDAO;

	@RequestMapping(path = "getData.do", method = RequestMethod.GET)
	public ModelAndView findById(@RequestParam("id") int id) {
		ModelAndView mv = new ModelAndView();

		Developer dev = devDAO.findById(id);

		mv.addObject("dev", dev);
		mv.setViewName("/WEB-INF/views/show.jsp");
		return mv;
	}

	@RequestMapping(path = "home.do", method = RequestMethod.GET)
	public String findAll(Model model) {
		List<Developer> devs = devDAO.findAll();
		model.addAttribute("devs", devs);

		return "/WEB-INF/views/show.jsp";
	}

}
