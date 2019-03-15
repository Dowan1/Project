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
	function testDiv(n) {
		$.ajax({
			type:"POST",
			url:"AjaxTest.bo",
			dataType:"html", 
			data:"n="+n,
			success:function(result){ 
				$('#notice_content').html(result)
			}
		});
	}
	testDiv(1); 
</script>
</head>
<body>
<div class="res" id="notice_content"></div>
</body>
</html>