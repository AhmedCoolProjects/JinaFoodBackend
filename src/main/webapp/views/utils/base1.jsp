
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://unpkg.com/@themesberg/flowbite@1.2.0/dist/flowbite.bundle.js"></script>
<script type="text/javascript">
	// products
	function setFormToUpdateProduct(id, title, description, salePrice,
			regularPrice, images, dialogTitle) {
		$("#product-dialog-title").text(dialogTitle);
		$("#product-form")
				.attr("action", "/api/v1/admin/products/update/" + id);
		$("#product-title").val(title);
		$("#product-description").val(description);
		$("#product-sale-price").val(salePrice);
		$("#product-regular-price").val(regularPrice);
		$("#product-images").val(images);
	}
	function setFormToAddProduct(dialogTitle) {
		$("#product-dialog-title").text(dialogTitle);
		$("#product-form").attr("action", "/api/v1/admin/products");
		$("#product-title").val("");
		$("#product-description").val("");
		$("#product-sale-price").val("");
		$("#product-regular-price").val("");
		$("#product-images").val("");
	}
	function setIdToDeleteItem(id) {
		$("#item-id-to-delete").val(id);
	}
	function deleteItem(url) {
		var id = $("#item-id-to-delete").val();
		$.ajax({
			url : url + id,
			type : 'POST',
			success : function(result) {
				window.location.reload();
			}
		});
	}
	// employees
	function setFormToUpdateEmployee(id, first_name, last_name, email, phone,
			gender, salary, birthday, dialogTitle) {
		$("#employee-dialog-title").text(dialogTitle);
		$("#employee-form").attr("action",
				"/api/v1/admin/employees/update/" + id);
		$("#employee-first-name").val(first_name);
		$("#employee-last-name").val(last_name);
		$("#employee-email").val(email);
		$("#employee-phone").val(phone);
		$("#employee-salary").val(salary);
		$("#employee-birthday").val(birthday);
		$("#employee-gender").find(':radio[name=gender][value="'+gender+'"]')
				.prop('checked', true);

	}
	function setFormToAddEmployee(dialogTitle) {
		$("#employee-dialog-title").text(dialogTitle);
		$("#employee-form").attr("action", "/api/v1/admin/employees");
		$("#employee-first-name").val("");
		$("#employee-last-name").val("");
		$("#employee-email").val("");
		$("#employee-phone").val("");
		$("#employee-salary").val("");
		$("#employee-birthday").val("");
		$("#employee-gender").find(':radio[name=gender][value="Male"]').prop(
				'checked', true);
	}
</script>
</body>
</html>