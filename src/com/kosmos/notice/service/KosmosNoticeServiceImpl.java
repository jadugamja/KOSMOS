package com.kosmos.notice.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kosmos.notice.dao.KosmosNoticeDAO;
import com.kosmos.notice.vo.KosmosNoticeVO;

@Service
@Transactional
public class KosmosNoticeServiceImpl implements KosmosNoticeService {

	Logger logger = Logger.getLogger(KosmosNoticeServiceImpl.class);
	
	@Autowired(required=false)
	private KosmosNoticeDAO kosmosNoticeDAO;
	
	public KosmosNoticeServiceImpl(KosmosNoticeDAO kosmosNoticeDAO) {
		this.kosmosNoticeDAO = kosmosNoticeDAO;
	}

	@Override
	public int noticeInsert(KosmosNoticeVO nvo) {
		return kosmosNoticeDAO.noticeInsert(nvo);
	}
	
	@Override
	public List<KosmosNoticeVO> noticeList(KosmosNoticeVO nvo) {
		return kosmosNoticeDAO.noticeList(nvo);
	}

//	@Override
//	public List<KosmosNoticeVO> noticeDetail(KosmosNoticeVO nvo) {
//		return noticeDAO.noticeDetail(nvo);
//	}

	@Override
	public int noticeUpdate(KosmosNoticeVO nvo) {
		return kosmosNoticeDAO.noticeUpdate(nvo);
	}

	@Override
	public int noticeDelete(KosmosNoticeVO nvo) {
		// TODO Auto-generated method stub
		return 0;
	}

//	@Override
//	public int noticePwdConfirm(KosmosNoticeVO nvo) {
//
//		int result = 0;
//		result = noticeDAO.noticePwdConfirm(nvo);
//		return result;
//	}

}
