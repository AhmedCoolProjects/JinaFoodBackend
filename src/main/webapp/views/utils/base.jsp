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
	<link rel="icon" href="${faviconicopath}" type="image/x-icon" />
<style>
/* width */
.scrollbar-custom::-webkit-scrollbar {
	width: 10px;
	height: 10px;
}
/* Handle */
.scrollbar-custom::-webkit-scrollbar-thumb {
	background: #031629;
	border-radius: 100vh;
	border: 3px solid #011120e3;
}

/* Handle on hover */
.scrollbar-custom::-webkit-scrollbar-thumb:hover {
	background: #062646;
}
</style>
<title>Admin ${title}</title>
</head>
<body class="dark:bg-gray-900 px-12 py-6">