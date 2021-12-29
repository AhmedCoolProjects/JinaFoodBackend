<button onClick="setFormToAddCustomer('Add Customer To Database')"
	class="block text-white bg-blue-700 hover:bg-blue-800 focus:ring-4 focus:ring-blue-300 font-medium rounded-lg text-sm px-5 py-2.5 text-center dark:bg-blue-600 dark:hover:bg-blue-700 dark:focus:ring-blue-800"
	type="button" data-modal-toggle="customer-modal">Add Customer</button>

<div id="customer-modal" aria-hidden="true"
	class="hidden overflow-y-auto overflow-x-hidden fixed right-0 left-0 top-4 z-50 justify-center items-center h-modal md:h-full md:inset-0">
	<div class="relative px-4 w-full max-w-md h-full md:h-auto">

		<div class="relative bg-white rounded-lg shadow dark:bg-gray-700">
			<div class="flex justify-end p-2">
				<button type="button"
					class="text-gray-400 bg-transparent hover:bg-gray-200 hover:text-gray-900 rounded-lg text-sm p-1.5 ml-auto inline-flex items-center dark:hover:bg-gray-800 dark:hover:text-white"
					data-modal-toggle="customer-modal">
					<span class="material-icons text-2xl"> close </span>
				</button>
			</div>
			<form id="customer-form"
				class="px-6 overflow-y-scroll scrollbar-custom max-h-[80vh] pb-4 space-y-6 lg:px-8 sm:pb-6 xl:pb-8"
				action="" method="POST">
				<h3 id="customer-dialog-title"
					class="text-xl font-medium text-gray-900 dark:text-white"></h3>
				<div>
					<label for="first_name"
						class="block mb-2 text-sm font-medium text-gray-900 dark:text-gray-300">First
						Name</label> <input type="text" name="first_name" id="customer-first-name"
						class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full p-2.5 dark:bg-gray-600 dark:border-gray-500 dark:placeholder-gray-400 dark:text-white"
						placeholder="First Name" required="">
				</div>
				<div>
					<label for="last_name"
						class="block mb-2 text-sm font-medium text-gray-900 dark:text-gray-300">Last
						Name</label> <input type="text" name="last_name" id="customer-last-name"
						class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full p-2.5 dark:bg-gray-600 dark:border-gray-500 dark:placeholder-gray-400 dark:text-white"
						placeholder="Last Name" required="">
				</div>
				<div>
					<label for="email"
						class="block mb-2 text-sm font-medium text-gray-900 dark:text-gray-300">Email</label>
					<input type="text" name="email" id="customer-email"
						class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full p-2.5 dark:bg-gray-600 dark:border-gray-500 dark:placeholder-gray-400 dark:text-white"
						placeholder="Email" required="">
				</div>
				<div>
					<label for="phone"
						class="block mb-2 text-sm font-medium text-gray-900 dark:text-gray-300">Phone</label>
					<input type="text" name="phone" id="customer-phone"
						class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full p-2.5 dark:bg-gray-600 dark:border-gray-500 dark:placeholder-gray-400 dark:text-white"
						placeholder="Phone" required="">
				</div>
				<div id="customer-gender">
					<fieldset>
						<label for="gender" class="sr-only">Gender</label>

						<div class="flex items-center mb-4">
							<input id="customer-gender-male" type="radio" name="gender"
								value="Male"
								class="w-4 h-4 border-gray-300 focus:ring-2 focus:ring-blue-300 dark:focus:ring-blue-600 dark:focus:bg-blue-600 dark:bg-gray-700 dark:border-gray-600"
								aria-labelledby="customer-gender-male"
								aria-describedby="customer-gender-male" checked> <label
								for="customer-gender-male"
								class="block ml-2 text-sm font-medium text-gray-900 dark:text-gray-300">
								Male </label>
						</div>
						<div class="flex items-center mb-4">
							<input id="customer-gender-female" type="radio" name="gender"
								value="Female"
								class="w-4 h-4 border-gray-300 focus:ring-2 focus:ring-blue-300 dark:focus:ring-blue-600 dark:focus:bg-blue-600 dark:bg-gray-700 dark:border-gray-600"
								aria-labelledby="customer-gender-female"
								aria-describedby="customer-gender-female"> <label
								for="customer-gender-female"
								class="block ml-2 text-sm font-medium text-gray-900 dark:text-gray-300">
								Female </label>
						</div>


					</fieldset>
				</div>
				<div>
					<label for="adress"
						class="block mb-2 text-sm font-medium text-gray-900 dark:text-gray-300">Adress</label>
					<input type="text" step="0.01" name="adress" id="customer-adress"
						class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full p-2.5 dark:bg-gray-600 dark:border-gray-500 dark:placeholder-gray-400 dark:text-white"
						placeholder="Adress" required="" />
				</div>
				



				<button type="submit"
					class="w-full text-white bg-blue-700 hover:bg-blue-800 focus:ring-4 focus:ring-blue-300 font-medium rounded-lg text-sm px-5 py-2.5 text-center dark:bg-blue-600 dark:hover:bg-blue-700 dark:focus:ring-blue-800">Submit</button>

			</form>
		</div>
	</div>
</div>
