package com.kosmos.notice.vo;

import org.springframework.web.multipart.MultipartFile;

public class KosmosNoticeVO {
	
	// 공지사항 테이블: 일대일 매칭
	private String no_num;		// 공지사항 글 번호
	private String mt_num;		// 작성자
	private String no_subject;	// 제목
	private String no_contents;	// 내용
	private String no_pw;		// 비밀번호
	private String no_file;		// (실제 서버에 저장한) 파일명
	private	int no_hit;			// 조회수
	private String no_insdate;	// 등록일
	private String no_upddate;	// 수정일
	private String no_delyn;	// 삭제여부

	// 교사회원 테이블: 가져올 데이터
	private String mt_name;		// 교사 이름
	
	// 검색
	private String searchType;	// 말머리
	private String keyword;		// 검색어
	
	// 페이징
//	private int pageSize;
//	private int groupSize;
//	private int curPage;
//	private int totalCount;		// 전체 게시글 개수
	
	// 파일 업로드
//	private MultipartFile file;
	
	// 기본 생성자
	public KosmosNoticeVO() {}

	// 오버로딩 생성자
	public KosmosNoticeVO(String no_num, String mt_num, String no_subject,
						String no_contents, String no_pw,	String no_file, 
						int no_hit,
						String no_insdate, String no_upddate, String no_delyn, 
						String searchType, String keyword,
						int pageSize, int groupSize, int curPage, int totalCount,
						MultipartFile file,
						String mt_name) {

		this.no_num = no_num;
		this.mt_num = mt_num;
		this.no_subject = no_subject;
		this.no_contents = no_contents;
		this.no_pw = no_pw;
		this.no_file = no_file;
		this.no_hit = no_hit;
		this.no_insdate = no_insdate;
		this.no_upddate = no_upddate;
		this.no_delyn = no_delyn;
		this.searchType = searchType;
		this.keyword = keyword;
//		this.pageSize = pageSize;
//		this.groupSize = groupSize;
//		this.curPage = curPage;
//		this.totalCount = totalCount;
//		this.file = file;
		this.mt_name = mt_name;
	}

	// getter()
	public String getNo_num() {
		return no_num;
	}

	public String getMt_num() {
		return mt_num;
	}

	public String getNo_subject() {
		return no_subject;
	}

	public String getNo_contents() {
		return no_contents;
	}

	public String getNo_pw() {
		return no_pw;
	}

	public String getNo_file() {
		return no_file;
	}

	public int getNo_hit() {
		return no_hit;
	}
	
	public String getNo_insdate() {
		return no_insdate;
	}

	public String getNo_upddate() {
		return no_upddate;
	}

	public String getNo_delyn() {
		return no_delyn;
	}

	public String getSearchType() {
		return searchType;
	}

	public String getKeyword() {
		return keyword;
	}

//	public int getPageSize() {
//		return pageSize;
//	}
//
//	public int getGroupSize() {
//		return groupSize;
//	}
//
//	public int getCurPage() {
//		return curPage;
//	}
//
//	public int getTotalCount() {
//		return totalCount;
//	}
//	
//	public MultipartFile getFile() {
//		return file;
//	}
	
	public String getMt_name() {
		return mt_name;
	}

	// setter()
	public void setNo_num(String no_num) {
		this.no_num = no_num;
	}

	public void setMt_num(String mt_num) {
		this.mt_num = mt_num;
	}

	public void setNo_subject(String no_subject) {
		this.no_subject = no_subject;
	}

	public void setNo_contents(String no_contents) {
		this.no_contents = no_contents;
	}

	public void setNo_pw(String no_pw) {
		this.no_pw = no_pw;
	}

	public void setNo_file(String no_file) {
		this.no_file = no_file;
	}

	public void setNo_hit(int no_hit) {
		this.no_hit = no_hit;
	}
	
	public void setNo_insdate(String no_insdate) {
		this.no_insdate = no_insdate;
	}

	public void setNo_upddate(String no_upddate) {
		this.no_upddate = no_upddate;
	}

	public void setNo_delyn(String no_delyn) {
		this.no_delyn = no_delyn;
	}

	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

//	public void setPageSize(int pageSize) {
//		this.pageSize = pageSize;
//	}
//
//	public void setGroupSize(int groupSize) {
//		this.groupSize = groupSize;
//	}
//
//	public void setCurPage(int curPage) {
//		this.curPage = curPage;
//	}
//
//	public void setTotalCount(int totalCount) {
//		this.totalCount = totalCount;
//	}
//
//	public void setFile(MultipartFile file) {
//		this.file = file;
//	}
	
	public void setMt_name(String mt_name) {
		this.mt_name = mt_name;
	}
	

}
