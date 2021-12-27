<%@ include file="../utils/base.jsp"%>
<c:set var="instance" value="${title}" scope="request" />


<h1 class="text-center dark:text-white text-3xl font-bold opacity-80">
	<a href="/api/v1/admin">Admin ${title}</a>
</h1>
<div class="w-full">

	<%@ include file="../dialogs/addProduct.jsp"%>

	<%@ include file="../tables/editdeletetable.jsp"%>
	<jsp:include page="../dialogs/delete.jsp">
		<jsp:param name="deleteMsg"
			value="Are you sure you want to delete this product?" />
	</jsp:include>
</div>

<%@ include file="../utils/base1.jsp"%>