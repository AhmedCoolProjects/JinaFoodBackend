<button
onClick="setFormToAddProduct('Add Product To Database')"
	class="block text-white bg-blue-700 hover:bg-blue-800 focus:ring-4 focus:ring-blue-300 font-medium rounded-lg text-sm px-5 py-2.5 text-center dark:bg-blue-600 dark:hover:bg-blue-700 dark:focus:ring-blue-800"
	type="button" data-modal-toggle="authentication-modal">Add
	Product</button>

<div id="authentication-modal" aria-hidden="true"
	class="hidden overflow-y-auto overflow-x-hidden fixed right-0 left-0 top-4 z-50 justify-center items-center h-modal md:h-full md:inset-0">
	<div class="relative px-4 w-full max-w-md h-full md:h-auto">

		<div class="relative bg-white rounded-lg shadow dark:bg-gray-700">
			<div class="flex justify-end p-2">
				<button type="button"
					class="text-gray-400 bg-transparent hover:bg-gray-200 hover:text-gray-900 rounded-lg text-sm p-1.5 ml-auto inline-flex items-center dark:hover:bg-gray-800 dark:hover:text-white"
					data-modal-toggle="authentication-modal">
					<span class="material-icons text-2xl"> close </span>
				</button>
			</div>
			<form id="product-form"
				class="px-6 pb-4 space-y-6 lg:px-8 sm:pb-6 xl:pb-8"
				action="" method="POST">
				<h3 id="product-dialog-title" class="text-xl font-medium text-gray-900 dark:text-white"></h3>
				<div>
					<label for="title"
						class="block mb-2 text-sm font-medium text-gray-900 dark:text-gray-300">Title</label>
					<input type="text" name="title" id="product-title"
						class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full p-2.5 dark:bg-gray-600 dark:border-gray-500 dark:placeholder-gray-400 dark:text-white"
						placeholder="title" required="">
				</div>
				<div>
					<label for="description"
						class="block mb-2 text-sm font-medium text-gray-900 dark:text-gray-300">Description</label>
					<input type="text" name="description" id="product-description"
						class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full p-2.5 dark:bg-gray-600 dark:border-gray-500 dark:placeholder-gray-400 dark:text-white"
						placeholder="description" required="">
				</div>
				<div>
					<label for="salePrice"
						class="block mb-2 text-sm font-medium text-gray-900 dark:text-gray-300">Sale
						Price</label> <input type="number" step="0.01" name="salePrice"
						id="product-sale-price"
						class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full p-2.5 dark:bg-gray-600 dark:border-gray-500 dark:placeholder-gray-400 dark:text-white"
						placeholder="salePrice" required="" />
				</div>
				<div>
					<label for="regularPrice"
						class="block mb-2 text-sm font-medium text-gray-900 dark:text-gray-300">Regular
						Price</label> <input type="number" step="0.01" name="regularPrice"
						id="product-regular-price"
						class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full p-2.5 dark:bg-gray-600 dark:border-gray-500 dark:placeholder-gray-400 dark:text-white"
						placeholder="regular price" required="" />
				</div>
				<div>
					<label for="images"
						class="block mb-2 text-sm font-medium text-gray-900 dark:text-gray-300">Images</label>
					<input type="text" name="images" id="product-images"
						class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full p-2.5 dark:bg-gray-600 dark:border-gray-500 dark:placeholder-gray-400 dark:text-white"
						placeholder="Images" required="">
				</div>

				<button type="submit"
					class="w-full text-white bg-blue-700 hover:bg-blue-800 focus:ring-4 focus:ring-blue-300 font-medium rounded-lg text-sm px-5 py-2.5 text-center dark:bg-blue-600 dark:hover:bg-blue-700 dark:focus:ring-blue-800">Submit</button>

			</form>
		</div>
	</div>
</div>
