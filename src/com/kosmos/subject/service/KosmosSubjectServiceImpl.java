package com.kosmos.subject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kosmos.subject.dao.KosmosSubjectDAO;
import com.kosmos.subject.vo.KosmosSubjectVO;

@Service
@Transactional
public class KosmosSubjectServiceImpl implements KosmosSubjectService {

	private KosmosSubjectDAO kosmosSubjectDAO;
	
	@Autowired(required=false)
	public KosmosSubjectServiceImpl(KosmosSubjectDAO kosmosSubjectDAO) {
		this.kosmosSubjectDAO = kosmosSubjectDAO;
	}

	@Override
	public List<KosmosSubjectVO> subjectSelectAll(KosmosSubjectVO svo) {
		// TODO Auto-generated method stub
		return kosmosSubjectDAO.subjectSelectAll(svo);
	}
}	