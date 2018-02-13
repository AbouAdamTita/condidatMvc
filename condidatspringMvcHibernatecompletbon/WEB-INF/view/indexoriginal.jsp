<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Index Condidat</title>

 <!-- Bootstrap -->
    <link href="${pageContext.request.contextPath}/resources/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="${pageContext.request.contextPath}/resources/bootstrap/js/bootstrap.min.js"></script>
   
    <!-- my js et my css  -->
    <link href="${pageContext.request.contextPath}/resources/bootstrap/css/mysheet.css" rel="stylesheet">
     <script src="${pageContext.request.contextPath}/resources/bootstrap/js/myscript.js"></script>


</head>
<body>

    <!-- header -->
	 <header  class="container-fluid header"> 
	 <div class="container">
	    <a href="#" class="logo">Mon PortFolio</a>
	        <nav class="menu">
			  <a href="#">Accueil </a>
			   <a href="#About">A propos </a>
				<a href="condidat/list">Condidat List</a>
				<a href="condidat/showFormAdd">Add condidat</a>
				 <a href="#Contact">Contact </a> 
				
		    </nav>
		</div>
	</header>
	
		<!-- banniere -->
			<section  class="container-fluid banner"> 
	          <!--header  class="bgimage"--> 
					<div class="ban">
						<img src="${pageContext.request.contextPath}/resources/photos/trolltunga.jpg" alt="Norveg" />
					</div>	
						  <div class="inner-banner">
						<h1 > Welecome </h1>
						<button class="btn btn-custom"> Contacter-moi !</button>
						</div>   
	       </section> 
	  <!-- end banniere -->
			
	 <!-- end header -->
	 <hr>
	 <!-- mon Contenu  -->
         <section  class="container-fluid about"> 
		 
			<div class="container">
							
				
				<input type="button" value="Add Condidat"
								onclick="window.location.href='condidat/showFormAdd'; return false;"
								class="add-button" />
									
			</div>	 
          
       </section>
   <!-- end mon contenu  --> 
	<hr> 
	 


<br><br>

<div style="clear; both;"></div>
		
 <!-- footer  -->
		  <footer class="container-fluid footer"> 
			 
						<div class="container">
						<h2 id="suivi">suiver moi </h2>
						</div>			 
		  
		    </footer>
   <!-- end footer  -->
   
   
</body>
</html>







