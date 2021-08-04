package com.springmvc.web.controller.notice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class DetailController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
				System.out.println("notice detail controller");
				
//				ModelAndView mv = new ModelAndView("/customer/notice/detail");
				ModelAndView mv = new ModelAndView("notice.detail");
				//mv.addObject("data", "hello");
				//mv.setViewName("/WEB-INF/view/index.jsp");
				return mv;
	}
	
	

}
