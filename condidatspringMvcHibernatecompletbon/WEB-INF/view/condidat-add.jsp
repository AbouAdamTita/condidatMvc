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
class="classImage" src="${pageContext.request.contextPath}/resources/photos/${condidat.image}.jpg"/>
</div>
<div style="clear; left;"></div>
		<div class="row">
			<div class="col-md-6 col-md-offset-2">
				<div class="well well-sm">
					<form:form action="saveCondidat" modelAttribute="condidat"
						method="POST" class="form-horizontal">
						<fieldset>
							<legend class="text-center font-weight-bold">Condidat Information</legend>
							<!-- add hidden input to stock id for the current condidat -->
							<form:hidden path="id" />

							<!-- FirstName input-->
							<div class="form-group">
								<label class="col-md-3 control-label" for="firstName">firstName</label>
								<div class="col-md-9">
									<form:input path="firstName"  type="text"
										placeholder="Your First Name" class="form-control font-weight-bold" />
								</div>
							</div>
							<!-- LastName input-->
							<div class="form-group">
								<label class="col-md-3 control-label" for="lastName">lastName</label>
								<div class="col-md-9">
									<form:input path="lastName" type="text"
									placeholder="Your First Name" class="form-control" />
								</div>
							</div>
							<!-- Email input-->
							<div class="form-group">
								<label class="col-md-3 control-label" for="email">Your
									E-mail</label>
								<div class="col-md-9">
									<form:input path="email" name="email" type="text"
										placeholder="Your email" class="form-control" />
								</div>
							</div>

							<!-- Image input-->
							<div class="form-group">
								<label class="col-md-3 control-label" for="image">lien
									image</label>
								<div class="col-md-9">
									<form:input path="image" name="image" type="text"
										placeholder="Your lien image" class="form-control" />
								</div>
							</div>
							<!-- Form actions -->
							<div class="form-group">
								<div class="col-md-12 text-right">
								<button type="submit" class="btn btn-danger btn-lg" 
								onclick="window.location.href='list'; return false;">Cancel</button>
								<button type="submit" class="btn btn-success btn-lg">Save</button>								
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
<hr>

<br>
<br>

<c:import url="footer.jsp"></c:import>

