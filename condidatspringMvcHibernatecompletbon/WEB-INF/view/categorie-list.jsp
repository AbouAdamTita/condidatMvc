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
						<button type="button" class="btn btn-success " value="Add Categorie" onclick="window.location.href='showCatAdd'; return false;">
						Add Categorie</button>
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
<!-- <div > 
<img style="float:left;margin-left:0px; border-radius: 50%; width:150px ; height:150px ; padding: 5px;" 
class="classImage" src="${pageContext.request.contextPath}/resources/photos/290.jpg"/>
</div>
 -->
								
<table class="table table-striped table-hover  table table-bordered table-condensed" >

		<!--Table head  class="table table-hover"-->
				    <thead class="blue-grey lighten-4">
								<tr class="info">
									<th>Id</th>
									<th>Nom categorie</th>
									<th>Photo</th>
									
									<th>Action</th>
								</tr>
				</thead>
		 <!--Table head-->
    
    	 <!--Table body-->
   				 <tbody>
    
						<!-- loop sur les condidats -->
						<c:forEach var="tempCat" items="${categories}">
		
							<!-- construct an "update" link with condidat id -->
							<c:url var="updateLink" value="/test/showCatUpdate">
								<c:param name="theIdCat" value="${tempCat.id}" />
								<c:param name="thefile" value="${tempCat.photo}" />
							</c:url>
							
							<!-- construct an "delete" link with condidat id -->
							<c:url var="deleteLink" value="/test/showCatDelete">
								<c:param name="theIdCat" value="${tempCat.id}" />
							</c:url>
							<tr >
								<td>${tempCat.id}</td>
								<td>${tempCat.nom}</td>
								
							<td>	<div> 
						<img  src="photoCat?theIdCat=${tempCat.id}" 
						style="margin:auto; border-radius: 50%; width:100px ; height:100px ; padding: 5px;" >
							</div>
								</td>																		
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
	
