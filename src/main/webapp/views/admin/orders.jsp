<%@ include file="../utils/base.jsp"%>
<c:set var="instance" value="${title}" scope="request" />


<h1 class="text-center dark:text-white text-3xl font-bold opacity-80">
	<a href="/api/v1/admin">Admin ${title}</a>
</h1>
<div class="w-full">


	 <%@ include file="../tables/orderTable.jsp"%>

</div>

<%@ include file="../utils/base1.jsp"%>