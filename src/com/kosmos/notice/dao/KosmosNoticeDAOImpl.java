package com.kosmos.notice.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kosmos.notice.vo.KosmosNoticeVO;

@Repository
public class KosmosNoticeDAOImpl implements KosmosNoticeDAO {


	private Logger logger = Logger.getLogger(KosmosNoticeDAOImpl.class);

	@Autowired(required=false)
	private SqlSessionTemplate sqlSession;

	@Override
	public int noticeInsert(KosmosNoticeVO nvo) {
		logger.info("noticeInsert() 호출");
		return sqlSession.insert("noticeInsert", nvo);
	}
	
	@Override
	public List<KosmosNoticeVO> noticeList(KosmosNoticeVO nvo){
		logger.info("noticeList() 호출");

		return sqlSession.selectList("noticeList", nvo);
	}
	
//	@Override
//	public List<KosmosNoticeVO> noticeDetail(KosmosNoticeVO nvo) {
//		logger.info("noticeSelect() 호출");
//		return sqlSession.selectList("noticeSelect", nvo);
//	}

	@Override
	public int noticeUpdate(KosmosNoticeVO nvo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int noticeDelete(KosmosNoticeVO nvo) {
		// TODO Auto-generated method stub
		return 0;
	}

	// 비밀번호 확인
//	@Override
//	public int noticePwdConfirm(KosmosNoticeVO nvo) {
//		logger.info("noticePwdConfirm 호출");
//		return sqlSession.selectOne("noticePwdConfirm");
//	}

}
