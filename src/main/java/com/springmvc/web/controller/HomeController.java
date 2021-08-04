package com.springmvc.web.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/")
public class HomeController {
	
	/*
	@RequestMapping("index")
	public String index() {
		return "root.index";
	}
	*/
	
	/*
	@RequestMapping("index")
	public void index(HttpServletResponse response) {
		
		PrintWriter out;
		try {
			out = response.getWriter();
			out.println("hello index");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	*/
	
	@RequestMapping("index")
	@ResponseBody
	public String index(HttpServletResponse response) {
		return "hello index 1";
	}
	
	@RequestMapping("help")
	public void help() {
		System.out.println("help controller");
	}

//	@Override
//	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
//		// TODO Auto-generated method stub
//		
//		System.out.println("index controller");
//		
//		ModelAndView mv = new ModelAndView("root.index");
//		mv.addObject("data", "hello");
//		//mv.setViewName("/WEB-INF/view/index.jsp");
//		return mv;
//	}
	
}
