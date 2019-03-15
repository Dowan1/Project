<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="/mybatis-spring/js/jquery-1.4.2.min.js"></script> 
<script type="text/javascript" src="/mybatis-spring/js/jquery.form.js"></script>
<script>
	function acar2(val){
		var val = val;
		$.ajax({
			type :"POST",
			url :"bcar.do",
			data : "anum="+val,
			datatype :"html",
			success : function(data){
				$("#bcar").html(data);
				$("#ccar").html("");
			}
	
	});
}	
	function bcar2(val){
		
	var val = val;
	var aval = $("#acar1").val();
		$.ajax({
			type :"POST",
			url :"ccar.do",
			data : "bnum="+ val+"&anum="+aval,
			datatype :"html",
			success : function(data){
				$("#ccar").html(data);
			}
		});
	}
	
		
	
</script>
</head>
<body>
	<div>
	<select id ="acar1" onchange="acar2(this.value)">
		<option value="1">1번차</option>
		<option value="2">2번차</option>
		<option value="3">3번차</option>
	</select>
	</div>
	<div id="bcar">
	
	</div>
	<div id="ccar">
	
	</div>
</body>
</html>