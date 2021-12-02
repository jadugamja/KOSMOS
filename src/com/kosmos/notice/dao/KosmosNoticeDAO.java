package com.kosmos.notice.dao;

import java.util.List;

import com.kosmos.notice.vo.KosmosNoticeVO;

public interface KosmosNoticeDAO {

	// 게시글 작성
	public int noticeInsert(KosmosNoticeVO nvo);
	// 게시글 목록 조회
	public List<KosmosNoticeVO> noticeList(KosmosNoticeVO nvo);
	// 게시글 상세 조회
//	public List<KosmosNoticeVO> noticeDetail(KosmosNoticeVO nvo);
	public int noticeUpdate(KosmosNoticeVO nvo);
	public int noticeDelete(KosmosNoticeVO nvo);

}
