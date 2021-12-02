package com.kosmos.notice.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.kosmos.notice.service.KosmosNoticeService;
import com.kosmos.notice.vo.KosmosNoticeVO;
import com.kosmos.common.file.FileUploadUtil;


@Controller
public class KosmosNoticeController {

	Logger logger = Logger.getLogger(KosmosNoticeController.class);
	
	@Autowired(required=false)
	private KosmosNoticeService kosmosNoticeService;
	
	public KosmosNoticeController(KosmosNoticeService kosmosNoticeService) {
		this.kosmosNoticeService = kosmosNoticeService;
	}
	
	// ******************************************************************** /
	// 공지사항 글쓰기 폼 출력
	@GetMapping("noticeForm")
	public String noticeForm(KosmosNoticeVO nvo) {
		logger.info("noticeForm() 호출");
		return "notice/noticeForm";
	}
	// ******************************************************************** /

	
	// ******************************************************************** /
	// 공지사항 목록 조회
	@GetMapping("noticeList")
	public String noticeList(KosmosNoticeVO nvo, Model model) throws Exception {
		logger.info("noticeList() 호출");
		
		List<KosmosNoticeVO> listAll = kosmosNoticeService.noticeList(nvo);
		logger.info("Controller.listAll.size(): " + listAll.size());
		
		if(listAll.size() > 0) {
			// 게시글 숫자 셈
//			nvo.setTotalCount(listAll.get(0).getTotalCount());
			model.addAttribute("listAll", listAll);
		}
		
		return "notice/noticeList";

	}
	// ******************************************************************** /	

}
