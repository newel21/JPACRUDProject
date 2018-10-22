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
	
	@RequestMapping(path= "home.do", method = RequestMethod.GET)
	public ModelAndView homePage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/WEB-INF/index.jsp");
		return mv;
		
	}

	@RequestMapping(path = "getData.do", method = RequestMethod.GET)
	public ModelAndView findById(@RequestParam("id") int id) {
		ModelAndView mv = new ModelAndView();

		Developer dev = devDAO.findById(id);

		mv.addObject("dev", dev);
		mv.setViewName("/WEB-INF/views/show.jsp");
		return mv;
	}

	@RequestMapping(path = "listDevs.do", method = RequestMethod.GET)
	public String findAll(Model model) {
		List<Developer> devs = devDAO.findAll();
		model.addAttribute("devs", devs);

		return "/WEB-INF/views/devs.jsp";
	}
	
	@RequestMapping(path="addDev.do", method=RequestMethod.POST)
	public ModelAndView add(Developer dev, Model model) {
		ModelAndView mv = new ModelAndView(); 
		Developer addDev = devDAO.add(dev); 
		mv.addObject("dev", addDev); 
		mv.setViewName("/WEB-INF/views/added.jsp");
		return mv; 
	}
	
	@RequestMapping(path="edit.do", method=RequestMethod.POST)
	public ModelAndView edit(int id) {
		ModelAndView mv = new ModelAndView();
		Developer editDev = devDAO.findById(id);
		mv.addObject("dev", editDev);
		mv.setViewName("/WEB-INF/views/edit.jsp");
		return mv;
	}
	
	@RequestMapping(path="update.do", method=RequestMethod.POST)
	public ModelAndView update(Developer dev) {
		ModelAndView mv = new ModelAndView();
		Developer updateDev = devDAO.update(dev.getId(), dev);
		mv.addObject("dev", updateDev);
		mv.setViewName("/WEB-INF/views/show.jsp");
		return mv;
	}
	
	@RequestMapping(path="deleteDev.do", method=RequestMethod.POST)
	public ModelAndView deleteById(int id) {
		ModelAndView mv = new ModelAndView();
		devDAO.deleteById(id);
		mv.setViewName("/WEB-INF/views/deleted.jsp");
		return mv;
	}
	
//	@RequestMapping(path="deleteDev.do", method=RequestMethod.POST)
//	public ModelAndView delete(Developer dev, Model model) {
//		ModelAndView mv = new ModelAndView();
//		devDAO.delete(dev);
//		mv.setViewName("/WEB-INF/views/deleted.jsp");
//		return mv;
//	}
	

}
