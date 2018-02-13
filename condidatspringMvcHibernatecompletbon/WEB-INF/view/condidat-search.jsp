<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<html>

<head>
<title>List Condidats</title>

<!-- reference our style sheet -->

<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css" />

</head>

<body>

	<div id="wrapper">
		<div id="header">
			<h2>Schoole - Condidat Relationship Manager</h2>
		</div>
	</div>

	<div id="container">

		<div id="content">

			<!--  add our html table here -->

			<!-- put new button: Add Customer -->

			<input type="button" value="Add Condidat"
				onclick="window.location.href='showFormAdd'; return false;"
				class="add-button" />


			<table>
				<tr>
					<th>Id</th>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email</th>
					<th>Action</th>
				</tr>

				<!-- loop sur les condidats -->
				<c:forEach var="tempCondidat" items="${condidats}">

					<!-- construct an "update" link with condidat id -->
					<c:url var="updateLink" value="/condidat/showFormUpdate">
						<c:param name="condidatId" value="${tempCondidat.id}" />
					</c:url>
					
					<!-- construct an "delete" link with condidat id -->
					<c:url var="deleteLink" value="/condidat/showFormDelete">
						<c:param name="condidatId" value="${tempCondidat.id}" />
					</c:url>

					<tr>
						<td>${tempCondidat.id}</td>
						<td>${tempCondidat.firstName}</td>
						<td>${tempCondidat.lastName}</td>
						<td>${tempCondidat.email}</td>
						<td>
							<!-- display the update link --> <a href="${updateLink}">Update</a>
							| <a href="${deleteLink}" onclick="if(!(confirm('Are you sure to delete?')))return false"
							>delete</a>
						</td>
					</tr>

				</c:forEach>

			</table>

		</div>

	</div>
	
<footer class="text-center">
            <a href="#about">
                <span class="glyphicon glyphicon-chevron-up"></span>
            </a>
            <h5>© 2018 itHammadi@gmail.com</h5>
        </footer>


</body>

</html>









