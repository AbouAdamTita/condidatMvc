<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


  <c:import url="header.jsp"></c:import> 
	 <hr>
	 <!-- mon Contenu  -->
         				
				<div id="wrapper">
		<div id="header">
			<h2>CRM - Condidat Relationship Manager</h2>
		</div>
	</div>

	<div id="container">
		<h3>Save Condidat</h3>
	
		<form:form action="saveCondidat" modelAttribute="condidat" method="POST" enctype="multipart/form-data">
		<!-- add hidden input to stock id for the current condidat -->
		<form:hidden path="id"/>
			<table>
				<tbody>
					<tr>
						<td><label>First name:</label></td>
						<td><form:input path="firstName" /></td>
					</tr>
				
					<tr>
						<td><label>Last name:</label></td>
						<td><form:input path="lastName" /></td>
					</tr>

					<tr>
						<td><label>Email:</label></td>
						<td><form:input path="email" /></td>
					</tr>
					
					<tr>
						<td><label>Image:</label></td>
						<td><form:input path="image" /></td>
					</tr>
					<tr>  
						<td> 							
					  			 <label for="file">Choose file to upload</label>
					   			<input type="file" id="file" name="file" multiple >
					 		
 							
 						</td>  
 					 </tr>
					<tr>
						<td><label></label></td>
						<td><input type="submit" value="Save" class="save" /></td>
					</tr>

				
				</tbody>
			</table>
		
		
		</form:form>
	
		<div style="clear; both;"></div>
		
		<p>
			<a href="${pageContext.request.contextPath}/condidat/list">Back to List</a>
		</p>
	
	</div>
	
									
   <!-- end mon contenu  --> 
	<hr> 
	 
<br><br>

 <c:import url="footer.jsp"></c:import> 





