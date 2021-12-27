
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://unpkg.com/@themesberg/flowbite@1.2.0/dist/flowbite.bundle.js"></script>
<script type="text/javascript">
	function setIdToDelete(id) {
		$("#to-delete-item-id").val(id);
	}
	function deleteItem() {
		var id = $("#to-delete-item-id").val();
		$.ajax({
			url : '/api/v1/admin/products/delete/' + id,
			type : 'POST',

			success : function(result) {
				window.location.reload();
			}
		});
	}
</script>
</body>
</html>