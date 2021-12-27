
<%
String idToDelete;
%>

<div class="flex mt-4 flex-col">
	<div class="overflow-x-auto sm:-mx-6 lg:-mx-8">
		<div class="inline-block py-2 min-w-full sm:px-6 lg:px-8">
			<div class="overflow-hidden shadow-md sm:rounded-lg">
				<table class="min-w-full">
					<thead class="bg-gray-100 dark:bg-gray-700">
						<tr>
							<th scope="col"
								class="py-3 px-6 text-xs font-medium tracking-wider text-left text-gray-700 uppercase dark:text-gray-400">
								Title</th>
							<th scope="col"
								class="py-3 px-6 text-xs font-medium tracking-wider text-left text-gray-700 uppercase dark:text-gray-400">
								Description</th>
							<th scope="col"
								class="py-3 px-6 text-xs font-medium tracking-wider text-left text-gray-700 uppercase dark:text-gray-400">
								Sale Price</th>
							<th scope="col"
								class="py-3 px-6 text-xs font-medium tracking-wider text-left text-gray-700 uppercase dark:text-gray-400">
								Regular Price</th>
							<th scope="col"
								class="py-3 px-6 text-xs font-medium tracking-wider text-left text-gray-700 uppercase dark:text-gray-400">
								Images</th>

							<th scope="col" class="relative py-3 px-6"><span
								class="sr-only">Edit</span></th>
							<th scope="col" class="relative py-3 px-6"><span
								class="sr-only">Delete</span></th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${products}" var="productItem">
							<tr
								class="bg-white border-b dark:bg-gray-800 dark:border-gray-600">
								<td
									class="py-4 px-6 text-sm font-medium text-gray-900 whitespace-nowrap dark:text-white">
									${productItem.title }</td>
								<td
									class="py-4 px-6 text-sm text-gray-500 whitespace-nowrap dark:text-gray-400">
									${productItem.description }</td>
								<td
									class="py-4 px-6 text-sm text-gray-500 whitespace-nowrap dark:text-gray-400">
									${productItem.salePrice }</td>
								<td
									class="py-4 px-6 text-sm text-gray-500 whitespace-nowrap dark:text-gray-400">
									${productItem.regularPrice }</td>
								<td
									class="py-4 px-6 text-sm text-gray-500 whitespace-nowrap dark:text-gray-400">
									${productItem.images[0] }</td>
								<td
									class="py-4 px-6 text-sm font-medium text-right whitespace-nowrap">
									<button type="button"
									
										class="text-gray-400 bg-transparent hover:bg-gray-200 hover:text-gray-900 rounded-lg text-sm p-1.5 ml-auto inline-flex items-center dark:hover:bg-gray-800 dark:hover:text-white">

										<span class="material-icons text-blue-500"> edit </span>
									</button>
								</td>
								<td
									class="py-4 px-6 text-sm font-medium text-right whitespace-nowrap">
									<input value="" id="to-delete-item-id" class="hidden" />
									<button type="button" data-modal-toggle="delete-modal"
									onClick="setIdToDelete('${productItem.id}')"
										class="text-gray-400 bg-transparent hover:bg-gray-200 hover:text-gray-900 rounded-lg text-sm p-1.5 ml-auto inline-flex items-center dark:hover:bg-gray-800 dark:hover:text-white">
										<span class="material-icons text-red-500">
											delete_forever </span>
									</button>
								</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</div>
