package com.springmvc.web.controller.customer;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springmvc.web.entity.Notice;
import com.springmvc.web.service.NoticeService;

@Controller
@RequestMapping("/customer/notice/")
public class NoticeController {
	
	@Autowired
	private NoticeService noticeService;
	
	@RequestMapping("list")
	public String list(HttpServletRequest request, @RequestParam(name="page", required = false) Integer page) throws ClassNotFoundException, SQLException {
//	public String list(HttpServletRequest request, @RequestParam(name="page", defaultValue="1") int page) throws ClassNotFoundException, SQLException {
		String p = request.getParameter("p");
		
		System.out.println("page > " + page);
		System.out.println("p > " + p);
		//List<Notice> list = noticeService.getList(1,  "TITLE", "");
		
		return "notice.list";
	}
	
	@RequestMapping("detail")
	public String detail() {
		return "notice.detail";
	}
	
}
