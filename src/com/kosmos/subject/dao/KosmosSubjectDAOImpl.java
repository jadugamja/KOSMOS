package com.kosmos.subject.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kosmos.subject.vo.KosmosSubjectVO;

@Repository
public class KosmosSubjectDAOImpl implements KosmosSubjectDAO {

	@Autowired(required=false)
	private SqlSessionTemplate sqlSession;

	@Override
	public List<KosmosSubjectVO> subjectSelectAll(KosmosSubjectVO svo) {
		// TODO Auto-generated method stub
		return sqlSession.selectList("subjectSelectAll", svo);
	}
}
