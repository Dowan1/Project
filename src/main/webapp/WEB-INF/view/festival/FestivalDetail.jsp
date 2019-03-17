<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 자기가 쓸거 알아서 주석풀고 사용하기 [순서대로 form설정, spring기능 사용, c태그 사용] -->
<%-- <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> --%>
<%-- <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %> --%>
<%-- <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<!--제목 설정-->
<title>샘플(변경하세요)</title>

<!-- 기본 설정  => 여기서부터 -->
<meta name="viewport" content="width = device-width, initial-scale = 1.0, maximum-scale = 1.0 minimum-scale = 1.0">
<!-- font 설정 -->
<link href="https://fonts.googleapis.com/css?family=Do+Hyeon"
	rel="stylesheet">
<!-- css 적용 : font-family: 'Do Hyeon', sans-serif; -->
<link href="https://fonts.googleapis.com/css?family=Noto+Sans+KR"
	rel="stylesheet">
<!-- css 적용 : font-family: 'Noto Sans KR', sans-serif; -->

<!--Jquery, JqueryUI설정-->
<script src="https://code.jquery.com/jquery-3.3.1.js"
	integrity="sha256-2Kok7MbOyxpgUVvAk/HJ2jigOSYS2auK4Pfzbm7uH60="
	crossorigin="anonymous"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"
	integrity="sha256-T0Vest3yCU7pafRw9r+settMBX6JkKN06dqBnpQ8d30="
	crossorigin="anonymous"></script>

<!--css 설정(기본값)-->
<link href="/css/body.css" rel="stylesheet" type="text/css">
<link href="/css/header.css" rel="stylesheet" type="text/css">
<link href="/css/footer.css" rel="stylesheet" type="text/css">

<!-- js 설정(기본값) -->
<script src = "../js/header.js"></script>

<!-- 여기까지 노터치(변경하거나 추가하지 마시오) -->

<!-- contents css설정(직접 만든 css를 여기에 올려주세요) 주석 치우고 css/이름만 바꾸면 됨.css -->
<!-- <link href="css/sample.css" rel="stylesheet" type="text/css"> -->
<!-- contents js설정(직접 만든 js를 여기에 올려주세요)  주석 치우고 js/이름만 바꾸면 됨.js  -->
<!-- <script src = "js/sample.js"></script> -->


</head>
<body>
<!-- Header 시작 -->
<%-- <jsp:include page="Header.jsp" /> --%>
<!-- Header 끝 -->
<!-- Content 시작(내용 첨가) -->
<div id = "contents">
<div id="festival_title">한림공원 매화축제2019</div>
		<div id="festival_img_box"><img src="img/festival_detail1.jpg"></div>
		<table id="festival_info">
			<tr>
				<td class="subject">개최지역</td>
				<td class="info">제주도 제주시</td>
			</tr>
			<tr>
				<td class="subject">개최기간</td>
				<td class="info">2019. 2. 1. ~ 3. 10.</td>
			</tr>
			<tr>
				<td class="subject">축제성격</td>
				<td class="info">생태자원</td>
			</tr>
			<tr>
				<td class="subject">관련 누리집</td>
				<td class="info">http://www.hallimpark.co.kr</td>
			</tr>
			<tr>
				<td class="subject">축제장소</td>
				<td class="info">한림공원 매화정원</td>
			</tr>
			<tr>
				<td class="subject">오시는길</td>
				<td class="info">제주시외버스터미널 - 29.2km - 한림 - 2.7km - 한림공원 - 25.7km - 대정 -18.7km - 중문-13.2km - 서귀포시외버스터미날</td>
			</tr>
			<tr>
				<td class="subject">요금</td>
				<td class="info">개인 : 일반 12,000원 / 경로 10,000원 / 청소년 8,000원 / 어린이 7,000원 / 단체 : 일반 10,000원 / 경로 9,000원 / 청소년 6,000원 /
					어린이 5,500원</td>
			</tr>
			<tr>
				<td class="subject">소요시간</td>
				<td class="info">시간내 자유</td>
			</tr>
			<tr>
				<td class="subject">연령제한</td>
				<td class="info">시간내 자유</td>
			</tr>
			<tr>
				<td class="subject">주최기간</td>
				<td class="info">제주한림공원</td>
			</tr>
			<tr>
				<td class="subject">문의</td>
				<td class="info">관리자 한림공원 064-796-0001~4</td>
			</tr>
		</table>

		<div id="festival_contents">
			새 봄! 봄의 전령사 매화를 만나보자.
			<br>
			매화 · 수선화 정원에는 버드나무처럼 늘어지는 80년생 능수 매화가 장관을 이루며, 20년 이상 된 백매화, 홍매화, 겹백매화, 겹홍매화, 청매화 등이
			만발하여 한림공원을 방문한 관광객들에게 제주의 봄소식을 전하고 있다.
			한림공원 매화정원에서 고고한 매화의 기품과 수선화 향기와 함께 성큼 다가온 봄의 기운을 만끽해보길 바란다.
		</div>
		<div id="festival_list">
			<button type="button">목록</button>
		</div>
</div>
<!-- Content 끝 -->
<!-- Footer 시작 -->
<%-- <jsp:include page="Footer.jsp" /> --%>
<!-- Footer 끝 -->
</body>
</html>