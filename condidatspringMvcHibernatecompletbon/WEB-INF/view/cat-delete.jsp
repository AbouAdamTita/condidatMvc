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
			<h2>Delete Categorie </h2>
		</div>
<hr>
<div style="clear; left;"></div>
		<div class="row">
			<div class="col-md-6 col-md-offset-2">
				<div class="well well-sm">					
					<form:form action="deleteCat" modelAttribute="categorie" method="POST"
						class="form-horizontal">
						<fieldset>
							<legend class="text-center font-weight-bold">Catgeorie Information</legend>
							<!-- add hidden input to stock id for the current condidat -->
							<form:hidden path="id" />							
							<!-- id input-->
							<div class="form-group">
								<label class="col-md-3 control-label" for="id">Id Categorie</label>
								<div class="col-md-9">
									<form:input path="id"  type="text"
										 class="form-control font-weight-bold" disabled="true"  />
								</div>
							</div>
							<!-- FirstName input-->
							<div class="form-group">
								<label class="col-md-3 control-label" for="nom">Nom categorie</label>
								<div class="col-md-9">
									<form:input path="nom"  type="text"
										placeholder="Your First Name" class="form-control font-weight-bold" />
								</div>
							</div>										

							<!-- Image input-->
							<div class="form-group">
								<label class="col-md-3 control-label" >Image</label>
								<div class="col-md-9">								
								<c:if test="${categorie.id!=null}">									
									<img style="float:right;margin-left:0px; border-radius: 50%; 
									width:200px ; height:200px ; padding: 5px;"
									src="photoCat?theIdCat=${categorie.id}" class="form-control">
								</c:if>									
								</div>
							</div>
							<hr>
							<!-- Form actions -->
							<div class="form-group">
								<div class="col-md-12 text-right">
								<button style="float:left;margin-left:60%;" type="submit" class="btn btn-danger btn-lg" 
								onclick="window.location.href='listCat'; return false;">Cancel</button>
								<button type="submit" class="btn btn-success btn-lg" 
								onclick="if(!(confirm('Are you sure to delete?')))return false">    Delete</button>								
								</div>								
							</div>
						</fieldset>
					</form:form>
				</div>
			</div>
		</div>
		</div>
</section>
<!-- end mon contenu  -->
<c:import url="footer.jsp"></c:import>
