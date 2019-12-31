package com.telusko;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {
	
	@RequestMapping("/add")
	public ModelAndView add(@RequestParam("t1") int i,@RequestParam("t2") int j,HttpServletRequest request,HttpServletResponse response)
	{
	    
		//what is request object(doGet and doPost)
		//int i =Integer.parseInt(request.getParameter("t1"));
		//int i =Integer.parseInt(request.getParameter("t2"));
		//int k = i+j; Add Service me logic
		
		AddService as =new AddService();
		int  =as.add(i,j);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("display");
		mv.addObject("result",k);
		
		return mv;
		//return "display.jsp" 
		//System.out.println("I am here");	
	}

}

