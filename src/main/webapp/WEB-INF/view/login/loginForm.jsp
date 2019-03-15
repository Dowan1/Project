<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="/mybatis-spring/js/jquery-1.4.2.min.js"></script> 
<script type="text/javascript" src="/mybatis-spring/js/jquery.form.js"></script> 
<script type="text/javascript">
 $(function() {
	$('#log_in').bind('click',function(){
			var options ={
					type:"post",
					url:"logn_pro.do",
					beforeSubmit: applicant_check,
					success : applicant_OK,
					error:function(){
						alert('에러 발생! 잠시후 다시 시도해주세요.');
						return;
					}
			}
			$("#frm").ajaxSubmit(options);
			return false;
		});
	});
 function applicant_OK(responseText, statusText,xhr, $form){
	 if(statusText == "success"){
		 if(responseText == "0"){
			 alert("정보가 부족합니다.");
			 form.id.value="";
			 form.passwd.value="";
			 form.id.focus();
		 }else if(responseText == "1"){
			 alert("아이디가 존재 하지 않습니다.");
			 form.id.value="";
			 form.passwd.value="";
			 form.id.focus();
		 }else if(responseText == "2"){
			 alert("비밀번호가 일치 하지 않습니다.");
			 form.passwd.value="";
			 form.id.focus();
		 }else if(responseText == "3"){
			 location.href="/mybatis-spring/main1.bo";
		 }
	 }
 }
 function applicant_check(){
	 if(!document.getElementById("IID").value){
		 alert("아이디를 입력하세요.");
		 document.frm.id.focus();
		 return false;
	 }
	 if(!document.getElementById("PASSWD").value){
		 alert("비밀번호를 입력하세요.");
		 document.frm.passwd.focus();
		 return false;
	 }
 }
</script>
</head>
<body>
<form name="frm" id="frm">
<div class="loginarea">
	<dl>
		<dt class="blind">아이디</dt>
		<dd>
			<input type="text" name="id" id="IID" style="width:140px;" />
		</dd>
		<dt class="blind">패스워드</dt>
		<dd>
			<input type="password" name="passwd" id="PASSWD" style="width:140px;" />
		</dd>
		<ul>
			<li>
				<input type="image" src="" id="log_in" alt="로그인" title="로그인" />
			</li>
		</ul>	
	</dl>
</div>
</form>
</body>
</html>