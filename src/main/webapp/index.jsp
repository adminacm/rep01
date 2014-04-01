<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<meta charset="utf-8">
<title>案件管理</title>
<script type="text/javascript">
	var time = 0;
	var forward_url = "/sfdc/opportunity";//遷移したい画面のURL
	function forward_to() {
		time++;
		if (time == 5) {
			document.location.href = forward_url;
		}
	}
	window.setInterval("forward_to()", 10);
</script>
</head>
<body>
</body>
</html>
