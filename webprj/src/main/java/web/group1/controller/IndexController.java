package web.group1.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import web.group1.controller.entity.Notice;
import web.group1.controller.service.NoticeService;


public class IndexController implements Controller {
	//run the program here
	private NoticeService noticeService;
	public void setNoticeService(NoticeService noticeService) {
		this.noticeService = noticeService;
	}
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		ModelAndView mv = new ModelAndView("index");
		List<Notice> list = noticeService.getList();
		mv.addObject("list", list);
		//mv.setViewName("/WEB-INF/view/index.jsp");
		
		
		return mv;
	}

}
