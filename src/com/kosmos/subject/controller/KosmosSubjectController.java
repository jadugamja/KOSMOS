package com.kosmos.subject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.kosmos.subject.service.KosmosSubjectService;
import com.kosmos.subject.vo.KosmosSubjectVO;

@Controller
public class KosmosSubjectController {

	private KosmosSubjectService kosmosSubjectService;
	
	// 생성자 오토와이어드
	@Autowired
	public KosmosSubjectController(KosmosSubjectService kosmosSubjectService) {
		this.kosmosSubjectService = kosmosSubjectService;
	}
	
	@GetMapping("subject")
	public String subjectForm() {
		return "subject/subjectForm";
	}
	
	@GetMapping("subjectInsert")
	public String subjectInsert(KosmosSubjectVO svo) {
		
		return "";
	}
}
