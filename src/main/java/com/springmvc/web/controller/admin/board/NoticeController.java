package com.springmvc.web.controller.admin.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller("adminNoticeController")
@RequestMapping("/admin/board/notice/")
public class NoticeController {

	@RequestMapping("list")
	public String list() {
		return "notice.list";
	}
	
	@RequestMapping(value="reg")
	@ResponseBody
	public String reg(String title, String content, String listbox, String[] foods, String food) {
		
		return String.format("title:%s <br> content:%s <br> listbox:%s <br> checkbox:%s <br> radio:%s <br>", title, content, listbox, foods, food);
	}
	
	@RequestMapping("edit")
	public String edit() {
		return "";   
	}
	
	@RequestMapping("delete")
	public String delete() {
		return "";
	}
	
	
}
