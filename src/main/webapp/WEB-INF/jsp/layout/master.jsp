<%@ include file="/WEB-INF/jsp/common.inc" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<tiles:insertAttribute name="title" ignore="true" />

		<link rel="stylesheet" type="text/css" href="<c:url value="/css/bootstrap.min.css"/>">
		<link rel="stylesheet" type="text/css" href="<c:url value="/css/bootstrap-responsive.min.css"/>">
		
	</head>
	
	<body>
	
		<script type="text/javascript" src="<c:url value="/js/jquery-1.8.1.min.js"/>"></script>
		<script type="text/javascript" src="<c:url value="/js/bootstrap.min.js"/>"></script>
		
		<tiles:insertAttribute name="header" />
		<div class="container">
			<tiles:insertAttribute name="body" />
		</div>
		<tiles:insertAttribute name="footer" />
		

	</body>
</html>