<!DOCTYPE html>
<html>
<head>
<title>Fashion Forever</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
.responsive {
    width: 100%;
    height: 200px;
}
li a:hover{
    display: block; 
}
</style>
</head>
<body bgcolor="MEDIUMAQUAMARINE">
<%@  include file="template/Header.jsp" %>
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active" ></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2" ></li>
	  <li data-target="#myCarousel" data-slide-to="3" ></li>
    </ol>
<!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox">
      <div class="item active">
        <img src="./resources/images/pa.jpg" class="responsive" width="600"style="height:600px;">
	  </div>
      <div class="item">
        <img src="./resources/images/catwalk.jpg"class="responsive" width="600"style="height:600px;">
		
      </div>
      <div class="item">
        <img src="./resources/images/armaan.jpg"class="responsive" width="600"style="height:600px;">
		
      </div>
	  <div class="item">
        <img src="./resources/images/aa.jpg"class="responsive"  width="600" style="height:600px;">
		
      </div>
	  </div>
        <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel"  role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
  <center>
  <br>
  <br>
  <br>
  <br>
  <br>
<div class="container">     
  <img src="./resources/images/mm1.jpg" class="img-circle"  width="250" height="236"> 
  <img src="./resources/images/mm3.jpg"class="img-circle"   width="250" height="236"> 
  <img src="./resources/images/mm2.jpg"class="img-circle"   width="250" height="236"> 
</div>
</center>
<br><br><br><br><br><br>
 </div>
<%@ include file ="template/Footer.jsp" %>
</body>
</html>

