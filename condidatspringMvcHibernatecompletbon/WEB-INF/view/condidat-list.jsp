<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
  <c:import url="header.jsp"></c:import>  
  
  <!-- porte folio  -->
        <section  class="container-fluid portfolio"> 
				<div class="container">
				
						<div style="background: #fff;margin-top:10px;font-size: 26px;font-weight:bold;"> 
							Schoole - Condidat Relationship Manager.
						</div>				
<hr>
					<!-- put new button: Add Customer -->
					<div style="float: right;"> 					
						<button type="button" class="btn btn-success " value="Add Condidat" onclick="window.location.href='showFormAdd'; return false;">
						Add Condidat</button>
					</div>					 
	 					<!--  add a search box -->	 					
	 					
	 					<form:form action="search" method="POST" class="form-inline">
						  <div class="form-group">
						    <label for="theMotCle"></label>
						    <input type="text" class="form-control" name="theMotCle" placeholder="serach">
						  </div>  
						  <button type="submit" class="btn btn-primary ">  Search  </button>
						</form:form>		
<hr>								
<table class="table table-striped table-hover  table table-bordered table-condensed" >

		<!--Table head  class="table table-hover"-->
				    <thead class="blue-grey lighten-4">
								<tr class="info">
									<th>Id</th>
									<th>First Name</th>
									<th>Last Name</th>
									<th>Email</th>
									<th>image</th>
									<th>Action</th>
								</tr>
				</thead>
		 <!--Table head-->
    
    	 <!--Table body-->
   				 <tbody>
    
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
							<tr >
								<td>${tempCondidat.id}</td>
								<td>${tempCondidat.firstName}</td>
								<td>${tempCondidat.lastName}</td>
								<td>${tempCondidat.email}</td>
								<td>${tempCondidat.image}</td>
								<td>
									<!-- display the update link --> <a href="${updateLink}">Update</a>
									| <a href="${deleteLink}" >delete</a>
								</td>
							</tr>
						</c:forEach>
				 </tbody>
   	<!--Table body-->
		</table>		
         
			</div>
           
       </section>
   <!-- end portfolio  -->
  
								
						
	<c:import url="footer.jsp"></c:import>  
	








