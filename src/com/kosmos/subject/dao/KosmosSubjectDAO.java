package com.kosmos.subject.dao;

import java.util.List;

import com.kosmos.subject.vo.KosmosSubjectVO;

public interface KosmosSubjectDAO {

	public List<KosmosSubjectVO> subjectSelectAll(KosmosSubjectVO svo);
}
