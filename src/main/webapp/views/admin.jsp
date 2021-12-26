<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1" />
<script src="https://cdn.tailwindcss.com"></script>
<link href="https://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet" />
<title>Admin Dashboard</title>
</head>
<body class="dark:bg-gray-900 px-12 py-6">
	<h1 class="text-center dark:text-white text-3xl font-bold opacity-80">
		Admin Dashboard</h1>
	<div
		class="
        grid grid-cols-1
        sm:grid-cols-2
        mt-5
        md:grid-cols-3
        lg:grid-cols-4
        gap-4
      ">
		<c:forEach items="${cardsData}" var="cardItem">
			<div
				class="
          bg-white
          dark:bg-gray-800
          rounded-lg
          px-6
          py-8
          ring-1 ring-gray-900/5
          hover:border-[1px]
          cursor-pointer
          shadow-xl
        ">
				<div>
					<span
						class="
              inline-flex
              items-center
              justify-center
              p-2
              bg-indigo-500
              rounded-md
              shadow-lg
            ">
						<span class="material-icons text-5xl"> ${cardItem.getIcon() }</span>
					</span>
				</div>
				<h3
					class="
            text-gray-900
            dark:text-white
            mt-5
            text-base
            font-medium
            tracking-tight
          ">
					${cardItem.getTitle()}</h3>
				<p class="text-gray-500 dark:text-gray-400 mt-2 text-sm">${cardItem.getDescription() }</p>
			</div>
		</c:forEach>
	</div>
</body>
</html>
