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
	
	// All actions that requests home.do will be directed to the home page
	@RequestMapping(path= "home.do", method = RequestMethod.GET)
	public ModelAndView homePage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/WEB-INF/index.jsp");
		return mv;
		
	}
	
	// this shows the developer's details individually. Every getData.do request
	// will be directed to the show.jsp
	@RequestMapping(path = "getData.do", method = RequestMethod.GET)
	public ModelAndView findById(@RequestParam("id") int id) {
		ModelAndView mv = new ModelAndView();

		Developer dev = devDAO.findById(id);

		mv.addObject("dev", dev);
		mv.setViewName("/WEB-INF/views/show.jsp");
		return mv;
	}
	
	// devs.jsp will show you a list of developers on file in a form 
	// of hyperlinks
	@RequestMapping(path = "listDevs.do", method = RequestMethod.GET)
	public String findAll(Model model) {
		List<Developer> devs = devDAO.findAll();
		model.addAttribute("devs", devs);

		return "/WEB-INF/views/devs.jsp";
	}
	
	// added.jsp will show you the details of the newly added developer
	@RequestMapping(path="addDev.do", method=RequestMethod.POST)
	public ModelAndView addDev(Developer dev, Model model) {
		ModelAndView mv = new ModelAndView(); 
		Developer addDev = devDAO.add(dev); 
		mv.addObject("dev", addDev); 
		mv.setViewName("/WEB-INF/views/added.jsp");
		return mv; 
	}
	
	// edit.jsp will prompt you to a page where you can enter the 
	// changes you want for a developer
	@RequestMapping(path="edit.do", method=RequestMethod.POST)
	public ModelAndView editDev(int id) {
		ModelAndView mv = new ModelAndView();
		Developer editDev = devDAO.findById(id);
		mv.addObject("dev", editDev);
		mv.setViewName("/WEB-INF/views/edit.jsp");
		return mv;
	}
	
	// once the change has been done, it will prompt you to a 
	// show.jsp which is basically the developer's information
	@RequestMapping(path="update.do", method=RequestMethod.POST)
	public ModelAndView updateDev(@RequestParam("id") int id, Developer dev) {
		ModelAndView mv = new ModelAndView();
		
		Developer updateDev = devDAO.update(id, dev);
		mv.addObject("dev", updateDev);
		mv.setViewName("/WEB-INF/views/show.jsp");
		return mv;
	}
	
	// deleted.jsp just prompts you a message that the developer
	// has been deleted
	@RequestMapping(path="deleteDev.do", method=RequestMethod.POST)
	public ModelAndView deleteDevById(int id) {
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
