<%@ include file="/WEB-INF/jsp/common.inc" %>

<div class="container">

	<br/><br/><br/>
	
	<p>
	${message}
	<p>
	
	<div class="container">  
		<h2>One simple example with Twitter Bootstrap - first page</h2>
	</div>
	
	<div class="container">  
		<c:forEach var="company" items="${company}">
			<h3>Company name: ${company.name}</h3>
		</c:forEach>
	</div>
	
	<div class="container">  
		<c:forEach var="employee" items="${employee}">
			<h3>Employee name for company 2: ${employee.name}</h3>
		</c:forEach>
	</div>

</div>

<script>
	
</script>
