<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="com.kosmos.notice.vo.KosmosNoticeVO" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>공지사항 > 전체</title>
		
		<style type="text/css">
			.tt {
				text-align:center;
			}

		</style>
		
		<script type="text/javascript" src="/script/jquery-latest.js"></script>  
		<script type="text/javascript">
			
			$(document).ready(function(){
				
				// 조회 버튼 클릭.
				$(document).on("click", "#searchBtn", function(){
					alert("검색");		
					$("#noticeList").attr({ "method":"GET",
						                   "action":"noticeList.k"}).submit();
				});
				
				
				// 글쓰기 버튼 클릭.
				$(document).on("click", "#I", function(){
					location.href="notice/noticeForm.k";
				});
				
			});
			
		</script>
	</head>
	
	<body>
		<form method="post" id="noticeList">
		<!-- 전체를 하나의 레이아웃으로 묶음. -->
		<div style="width:1200px; margin:0 auto;">
			<h2>공지사항</h2>
			<hr>
			
				<!-- 공지사항 게시글 목록 상단 레이아웃 -->
				<div>
					<!-- (좌) 공지사항 게시물 개수 조회-->
					<div style="float:left; width:50%;">전체 <span>30</span>건</div>

					<!-- (우) 공지사항 게시물 조건 조회(검색)-->
					<div style="float:right; width:50%; text-align:right; margin-bottom:10px;">				
						<select name="searchType" id="searchType">
							<option value="title" selected>
								제목
							</option>
							<option value="contents">
								내용
							</option>
							<option value="writer">
								작성자
							</option>
						</select>
						<!-- 검색값을 받음 -->
						<input type="text" name="keyword" placeholder="검색어 입력" />
						<!-- 검색 버튼 -->
						<input type="button" id="searchBtn" value="조회">
					</div>
				</div>
				
				
				<!-- 공지사항 목록 -->
				<table id="noticeList" style="margin:0 auto; width:1200px;" summary='공지사항 첫 화면: 공지사항 목록'>
					<thead>
						<tr>
							<th class="tt" width="40" title="번호">번호</th>
							<th class="tt" width="450" title="제목">제목</th>
							<th class="tt" width="80" title="작성자">작성자</th>
							<th class="tt" width="80" title="작성일">작성일</th>
							<th class="tt" width="60" title="조회수">조회수</th>
						</tr>
					</thead>
					
					<tbody>
						<c:forEach var="list" items="${listAll}">
						<tr>
							<td class="tt">
								${list.no_num}
							</td>
							<td class="tt">
							<!-- <a href="notice/noticeDetatil.k?no_num=${list.no_num}">${list.no_subject}</a> -->
								${list.no_subject}
							</td>
							<td class="tt">
								${list.mt_num}
							</td>
							<td class="tt">
								<fmt:formatDate value="${list.no_insdate}" pattern="yyyy-MM-dd" />
							</td>
							<td class="tt">
								${list.no_hit}
							</td>
						</tr>
						</c:forEach>
					</tbody>
				</table>
	
				<!-- 교사회원에게만 글쓰기 버튼을 활성화 -->
				<c:if test="${sessionScope.writer != null}">
					<div style="margin-top: 10px;">
						<input type="button" value="글쓰기" id="I" style="float:right;">
					</div>
				</c:if>
				
			</div>
		</form>
	</body>
</html>
