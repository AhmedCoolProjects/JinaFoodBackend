<button onClick="setFormToAddTable('Add Table To Database')"
	class="block text-white bg-blue-700 hover:bg-blue-800 focus:ring-4 focus:ring-blue-300 font-medium rounded-lg text-sm px-5 py-2.5 text-center dark:bg-blue-600 dark:hover:bg-blue-700 dark:focus:ring-blue-800"
	type="button" data-modal-toggle="table-modal">Add Table</button>

<div id="table-modal" aria-hidden="true"
	class="hidden overflow-y-auto overflow-x-hidden fixed right-0 left-0 top-4 z-50 justify-center items-center h-modal md:h-full md:inset-0">
	<div class="relative px-4 w-full max-w-md h-full md:h-auto">

		<div class="relative bg-white rounded-lg shadow dark:bg-gray-700">
			<div class="flex justify-end p-2">
				<button type="button"
					class="text-gray-400 bg-transparent hover:bg-gray-200 hover:text-gray-900 rounded-lg text-sm p-1.5 ml-auto inline-flex items-center dark:hover:bg-gray-800 dark:hover:text-white"
					data-modal-toggle="table-modal">
					<span class="material-icons text-2xl"> close </span>
				</button>
			</div>
			<form id="table-form"
				class="px-6 overflow-y-scroll scrollbar-custom max-h-[80vh] pb-4 space-y-6 lg:px-8 sm:pb-6 xl:pb-8"
				action="" method="POST">
				<h3 id="table-dialog-title"
					class="text-xl font-medium text-gray-900 dark:text-white"></h3>
				<div>
					<label for="number"
						class="block mb-2 text-sm font-medium text-gray-900 dark:text-gray-300">Number</label>
					<input type="number" name="number" id="table-number"
						class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full p-2.5 dark:bg-gray-600 dark:border-gray-500 dark:placeholder-gray-400 dark:text-white"
						placeholder="Table Number" required="">
				</div>
				<div>
					<label for="size"
						class="block mb-2 text-sm font-medium text-gray-900 dark:text-gray-300">Size</label>
					<input type="number" name="size" id="table-size"
						class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full p-2.5 dark:bg-gray-600 dark:border-gray-500 dark:placeholder-gray-400 dark:text-white"
						placeholder="Table Size" required="">
				</div>
				<div>
					<label for="stage"
						class="block mb-2 text-sm font-medium text-gray-900 dark:text-gray-300">Stage</label>
					<input type="number" name="stage" id="table-stage"
						class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full p-2.5 dark:bg-gray-600 dark:border-gray-500 dark:placeholder-gray-400 dark:text-white"
						placeholder="Table Stage" required="">
				</div>
				<div id="table-isEmpty">
					<fieldset>
						<label for="isEmpty" class="sr-only">Gender</label>

						<div class="flex items-center mb-4">
							<input id="table-isEmpty-true" type="radio" name="isEmpty"
								value="Empty"
								class="w-4 h-4 border-gray-300 focus:ring-2 focus:ring-blue-300 dark:focus:ring-blue-600 dark:focus:bg-blue-600 dark:bg-gray-700 dark:border-gray-600"
								aria-labelledby="table-isEmpty-true"
								aria-describedby="table-isEmpty-true" checked> <label
								for="table-isEmpty-true"
								class="block ml-2 text-sm font-medium text-gray-900 dark:text-gray-300">
								Empty </label>
						</div>
						<div class="flex items-center mb-4">
							<input id="table-isEmpty-false" type="radio" name="isEmpty"
								value="NotEmpty"
								class="w-4 h-4 border-gray-300 focus:ring-2 focus:ring-blue-300 dark:focus:ring-blue-600 dark:focus:bg-blue-600 dark:bg-gray-700 dark:border-gray-600"
								aria-labelledby="table-isEmpty-false"
								aria-describedby="table-isEmpty-false"> <label
								for="table-isEmpty-false"
								class="block ml-2 text-sm font-medium text-gray-900 dark:text-gray-300">
								Not Empty </label>
						</div>


					</fieldset>
				</div>



				<button type="submit"
					class="w-full text-white bg-blue-700 hover:bg-blue-800 focus:ring-4 focus:ring-blue-300 font-medium rounded-lg text-sm px-5 py-2.5 text-center dark:bg-blue-600 dark:hover:bg-blue-700 dark:focus:ring-blue-800">Submit</button>

			</form>
		</div>
	</div>
</div>
