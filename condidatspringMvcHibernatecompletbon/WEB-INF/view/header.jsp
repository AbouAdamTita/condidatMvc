<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Index Condidat</title>

<!-- Bootstrap -->
<link
	href="${pageContext.request.contextPath}/resources/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">

<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script
	src="${pageContext.request.contextPath}/resources/bootstrap/js/bootstrap.min.js"></script>

<!-- my js et my css  -->
<link
	href="${pageContext.request.contextPath}/resources/bootstrap/css/mysheet.css"
	rel="stylesheet">

<!-- reference our style sheet contenu 

<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css" />
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/add-condidat-style.css">
-->

<script
	src="${pageContext.request.contextPath}/resources/bootstrap/js/myscript.js"></script>


</head>
<body>

	<!-- header -->
	<header class="container-fluid header">
		<div class="container">
			<a href="#" class="logo">Mon PortFolio</a>
			<nav class="menu">
				<a href="${pageContext.request.contextPath}/">Accueil </a>
				
				<a href="${pageContext.request.contextPath}/condidat/list">Condidat List</a>										
				
				<a href="${pageContext.request.contextPath}/condidat/showFormAdd">Add condidat</a> 
				<a href="${pageContext.request.contextPath}/test/showCatAdd"> Add test </a>
				<a href="${pageContext.request.contextPath}/test/listCat">test List</a>	
				<a href="#About">A propos </a> 
			</nav>
		</div>
	</header>

	<!-- banniere -->
	<section class="container-fluid banner">
		<!--header  class="bgimage"-->
			<div class="ban">
				<img
					src="${pageContext.request.contextPath}/resources/photos/trolltunga.jpg"
					alt="Norveg" />
			</div>
			<div class="inner-banner">
				<h1>Welecome</h1>
				
			</div>
	</section>
	<!-- end banniere -->

	<!-- end header -->