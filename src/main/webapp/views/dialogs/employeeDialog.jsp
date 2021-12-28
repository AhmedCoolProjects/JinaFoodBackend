<button onClick="setFormToAddEmployee('Add Employee To Database')"
	class="block text-white bg-blue-700 hover:bg-blue-800 focus:ring-4 focus:ring-blue-300 font-medium rounded-lg text-sm px-5 py-2.5 text-center dark:bg-blue-600 dark:hover:bg-blue-700 dark:focus:ring-blue-800"
	type="button" data-modal-toggle="employee-modal">Add Employee</button>

<div id="employee-modal" aria-hidden="true"
	class="hidden overflow-y-auto overflow-x-hidden fixed right-0 left-0 top-4 z-50 justify-center items-center h-modal md:h-full md:inset-0">
	<div class="relative px-4 w-full max-w-md h-full md:h-auto">

		<div class="relative bg-white rounded-lg shadow dark:bg-gray-700">
			<div class="flex justify-end p-2">
				<button type="button"
					class="text-gray-400 bg-transparent hover:bg-gray-200 hover:text-gray-900 rounded-lg text-sm p-1.5 ml-auto inline-flex items-center dark:hover:bg-gray-800 dark:hover:text-white"
					data-modal-toggle="employee-modal">
					<span class="material-icons text-2xl"> close </span>
				</button>
			</div>
			<form id="employee-form"
				class="px-6 overflow-y-scroll scrollbar-custom max-h-[80vh] pb-4 space-y-6 lg:px-8 sm:pb-6 xl:pb-8"
				action="" method="POST">
				<h3 id="employee-dialog-title"
					class="text-xl font-medium text-gray-900 dark:text-white"></h3>
				<div>
					<label for="first_name"
						class="block mb-2 text-sm font-medium text-gray-900 dark:text-gray-300">First
						Name</label> <input type="text" name="first_name" id="employee-first-name"
						class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full p-2.5 dark:bg-gray-600 dark:border-gray-500 dark:placeholder-gray-400 dark:text-white"
						placeholder="First Name" required="">
				</div>
				<div>
					<label for="last_name"
						class="block mb-2 text-sm font-medium text-gray-900 dark:text-gray-300">Last
						Name</label> <input type="text" name="last_name" id="employee-last-name"
						class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full p-2.5 dark:bg-gray-600 dark:border-gray-500 dark:placeholder-gray-400 dark:text-white"
						placeholder="Last Name" required="">
				</div>
				<div>
					<label for="email"
						class="block mb-2 text-sm font-medium text-gray-900 dark:text-gray-300">Email</label>
					<input type="text" name="email" id="employee-email"
						class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full p-2.5 dark:bg-gray-600 dark:border-gray-500 dark:placeholder-gray-400 dark:text-white"
						placeholder="Email" required="">
				</div>
				<div>
					<label for="phone"
						class="block mb-2 text-sm font-medium text-gray-900 dark:text-gray-300">Phone</label>
					<input type="text" name="phone" id="employee-phone"
						class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full p-2.5 dark:bg-gray-600 dark:border-gray-500 dark:placeholder-gray-400 dark:text-white"
						placeholder="Phone" required="">
				</div>
				<div id="employee-gender">
					<fieldset>
						<label for="gender" class="sr-only">Gender</label>

						<div class="flex items-center mb-4">
							<input id="employee-gender-male" type="radio" name="gender"
								value="Male"
								class="w-4 h-4 border-gray-300 focus:ring-2 focus:ring-blue-300 dark:focus:ring-blue-600 dark:focus:bg-blue-600 dark:bg-gray-700 dark:border-gray-600"
								aria-labelledby="employee-gender-male"
								aria-describedby="employee-gender-male" checked> <label
								for="employee-gender-male"
								class="block ml-2 text-sm font-medium text-gray-900 dark:text-gray-300">
								Male </label>
						</div>
						<div class="flex items-center mb-4">
							<input id="employee-gender-female" type="radio" name="gender"
								value="Female"
								class="w-4 h-4 border-gray-300 focus:ring-2 focus:ring-blue-300 dark:focus:ring-blue-600 dark:focus:bg-blue-600 dark:bg-gray-700 dark:border-gray-600"
								aria-labelledby="employee-gender-female"
								aria-describedby="employee-gender-female"> <label
								for="employee-gender-female"
								class="block ml-2 text-sm font-medium text-gray-900 dark:text-gray-300">
								Female </label>
						</div>


					</fieldset>
				</div>
				<div>
					<label for="salary"
						class="block mb-2 text-sm font-medium text-gray-900 dark:text-gray-300">Salary</label>
					<input type="number" step="0.01" name="salary" id="employee-salary"
						class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full p-2.5 dark:bg-gray-600 dark:border-gray-500 dark:placeholder-gray-400 dark:text-white"
						placeholder="Salary" required="" />
				</div>
				<div>
					<label for="birthday"
						class="block mb-2 text-sm font-medium text-gray-900 dark:text-gray-300">Birthday</label>
					<input type="text" name="birthday" id="employee-birthday"
						class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full p-2.5 dark:bg-gray-600 dark:border-gray-500 dark:placeholder-gray-400 dark:text-white"
						placeholder="2021-12-27" required="" />
				</div>



				<button type="submit"
					class="w-full text-white bg-blue-700 hover:bg-blue-800 focus:ring-4 focus:ring-blue-300 font-medium rounded-lg text-sm px-5 py-2.5 text-center dark:bg-blue-600 dark:hover:bg-blue-700 dark:focus:ring-blue-800">Submit</button>

			</form>
		</div>
	</div>
</div>
