



<div
	class="hidden overflow-y-auto overflow-x-hidden fixed right-0 left-0 top-4 z-50 justify-center items-center md:inset-0 h-modal sm:h-full"
	id="delete-modal" aria-hidden="true">
	<div class="relative px-4 w-full max-w-md h-full md:h-auto">

		<div class="relative bg-white rounded-lg shadow dark:bg-gray-700">

			<div class="flex justify-end p-2">
				<button type="button"
					class="text-gray-400 bg-transparent hover:bg-gray-200 hover:text-gray-900 rounded-lg text-sm p-1.5 ml-auto inline-flex items-center dark:hover:bg-gray-800 dark:hover:text-white"
					data-modal-toggle="delete-modal">
					<span class="material-icons text-2xl"> close </span>
				</button>
			</div>

			<div class="p-6 pt-0 text-center">
				<span class="material-icons text-7xl text-red-500 my-5">help</span>
				<h3
					class="mb-5 text-lg font-normal text-gray-500 dark:text-gray-400">
					${param.deleteMsg}</h3>
				<button data-modal-toggle="delete-modal" type="button"
					onClick="deleteItem()"
					class="text-white bg-red-600 hover:bg-red-800 focus:ring-4 focus:ring-red-300 font-medium rounded-lg text-sm inline-flex items-center px-5 py-2.5 text-center mr-2">
					Yes, I'm sure</button>
				<button data-modal-toggle="delete-modal" type="button"
					class="text-gray-500 bg-white hover:bg-gray-100 focus:ring-4 focus:ring-gray-300 rounded-lg border border-gray-200 text-sm font-medium px-5 py-2.5 hover:text-gray-900 focus:z-10 dark:bg-gray-700 dark:text-gray-300 dark:border-gray-500 dark:hover:text-white dark:hover:bg-gray-600">No,
					cancel</button>
			</div>
		</div>
	</div>
</div>
