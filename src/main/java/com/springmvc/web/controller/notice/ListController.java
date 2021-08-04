package com.springmvc.web.controller.notice;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.springmvc.web.entity.Notice;
import com.springmvc.web.service.NoticeService;
import com.springmvc.web.service.jdbc.JDBCNoticeService;

public class ListController implements Controller {

	@Autowired
	private NoticeService noticeService;
	
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub

		System.out.println("notice list controller");
		
		//ModelAndView mv = new ModelAndView("/customer/notice/list");
		ModelAndView mv = new ModelAndView("notice.list");
		//mv.addObject("data", "hello");
		//mv.setViewName("/WEB-INF/view/index.jsp");
		
		List<Notice> list = noticeService.getList(1,  "TITLE", "");
		
		mv.addObject("list", list);
		
		return mv;
		
	}
	

	
	
	
	

}
