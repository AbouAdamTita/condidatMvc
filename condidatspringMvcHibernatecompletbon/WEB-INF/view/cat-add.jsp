<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<c:import url="header.jsp"></c:import>
<hr>
<!-- mon Contenu  -->

<!-- porte folio  -->
<section class="container-fluid portfolio">
	<div class="container">
		<div
			style="background: #fff; margin-top: 10px; font-size: 26px; font-weight: bold;">
			<h2>Schoole - Condidat Relationship Manager.</h2>
		</div>
<hr>
<div id="photo"> 
<img style="float:left;margin-left:0px; border-radius: 50%; width:150px ; height:150px ; padding: 5px;" 
class="classImage" src="${pageContext.request.contextPath}/resources/photos/${categorie.id}.jpg"/>
</div>
<div style="clear; left;"></div>
		<div class="row">
			<div class="col-md-6 col-md-offset-2">
				<div class="well well-sm">
				
				
					<form:form action="saveCat" modelAttribute="categorie" 
						method="POST" class="form-horizontal"  enctype="multipart/form-data">
											
					<table>
							<tr>
							<td>ID Catégorie:</td>
							<!-- add hidden input to stock id for the current condidat -->
							<form:hidden path="id"/>
							<form:input path="id"/>
							
							
							
							</tr>
							<tr>
							<td>Nom Catégorie</td>
							<td><form:input path="nom"/></td>
							</tr>					
								<tr>
									<td>Photo</td>
									<c:if test="${categorie.id!=null}">
									<td>
									<img style="float:left;margin-left:0px; border-radius: 50%; 
									width:100px ; height:100px ; padding: 5px;"
									src="photoCat?theIdCat=${categorie.id}"></td>
									</c:if>
									<td>
									<input type="file" name="file"></td>
									</tr>
																	<tr>
								<td><input type="submit" value="Save"></td>
								</tr>
						</table>						
							
					</form:form>
				</div>
			</div>
		</div>
		</div>
		<!-- 				
		 -->
		
			
</section>
<!-- end mon contenu  -->
<hr>

<br>
<br>

<c:import url="footer.jsp"></c:import>

