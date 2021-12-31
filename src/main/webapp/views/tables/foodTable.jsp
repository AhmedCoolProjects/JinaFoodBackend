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
							<th scope="col"
								class="py-3 px-6 text-xs font-medium tracking-wider text-left text-gray-700 uppercase dark:text-gray-400">
								Ingredients</th>
							<th scope="col"
								class="py-3 px-6 text-xs font-medium tracking-wider text-left text-gray-700 uppercase dark:text-gray-400">
								Categories</th>

							<th scope="col" class="relative py-3 px-6"><span
								class="sr-only">Edit</span></th>
							<th scope="col" class="relative py-3 px-6"><span
								class="sr-only">Delete</span></th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${foods}" var="foodItem">
							<tr
								class="bg-white border-b dark:bg-gray-800 dark:border-gray-600">
								<td
									class="py-4 px-6 text-sm font-medium text-gray-900 whitespace-nowrap dark:text-white">
									${foodItem.title }</td>
								<td
									class="py-4 px-6 text-sm max-w-[60px] sm:max-w-[300px] scrollbar-custom overflow-x-auto text-gray-500 whitespace-nowrap dark:text-gray-400">
									${foodItem.description }</td>
								<td
									class="py-4 px-6 text-sm text-gray-500 whitespace-nowrap dark:text-gray-400">
									${foodItem.salePrice }</td>
								<td
									class="py-4 px-6 text-sm text-gray-500 whitespace-nowrap dark:text-gray-400">
									${foodItem.regularPrice }</td>
								<td
									class="py-4 px-6 text-sm grid grid-cols-2 gap-2 text-gray-500 whitespace-nowrap dark:text-gray-400">
									
									<c:forEach items="${foodItem.images}" var="proImg">
									<img src="${proImg }"
									alt="${foodItem.title }"
									class="w-12 grid-col h-12 object-cover rounded-lg"/>
                                </c:forEach>
								</td>
                                <td
									class="py-4 px-6 text-sm text-gray-500 whitespace-nowrap dark:text-gray-400">
									 
									<c:forEach items="${foodItem.ingredients}" var="categ">
									<%-- ${this.ingredients = this.ingredients + ";" + categ} --%>
                                    <li>${categ }</li>
                                </c:forEach>
                                    
                                    </td>
                                <td
									class="py-4 px-6 text-sm text-gray-500 whitespace-nowrap dark:text-gray-400">
									<c:forEach items="${foodItem.category}" var="categ">
									
                                    <li>${categ }</li>
                                </c:forEach>
                                    
                                    </td>
								<td
									class="py-4 px-6 text-sm font-medium text-right whitespace-nowrap">
									<button type="button"
										onClick="setFormToUpdateFood('${foodItem.id}', '${foodItem.title}', '${foodItem.description}', '${foodItem.salePrice}', '${foodItem.regularPrice}', '${foodItem.imagesToString()}','${foodItem.ingredientsToString()}','${foodItem.categoryToString()}','Update food ${foodItem.title} in database')"
										data-modal-toggle="authentication-modal"
										class="text-gray-400 bg-transparent hover:bg-gray-200 hover:text-gray-900 rounded-lg text-sm p-1.5 ml-auto inline-flex items-center dark:hover:bg-gray-800 dark:hover:text-white">

										<span class="material-icons text-blue-500"> edit </span>
									</button>
								</td>
								<td
									class="py-4 px-6 text-sm font-medium text-right whitespace-nowrap">
									<input value="" id="item-id-to-delete" class="hidden" />
									<button type="button" data-modal-toggle="delete-modal"
										onClick="setIdToDeleteItem('${foodItem.id}')"
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
