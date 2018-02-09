<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>ahlawat fashion</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
li a:hover{
    display: block; 
}
footer {
    padding: 1em;
    color: white;
    background-color: black;
    clear: left;
	}
</style>
</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
	 <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">

                        <span class="sr-only">Toggle navigation</span>

                        <span class="icon-bar"></span>

                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
						</button>	
<a class="navbar-brand" href="#">Ahlawat Fashion</a>

						
    </div>
    <!--<ul class="nav navbar-nav">-->
	<div id="navbar" class="navbar-collapse collapse">
	<ul class="nav navbar-nav">
	
	   <li><a href=""><img style="width:40px;height:30px;" src="fs.png" /></a></li>
      <li class="active"><a href="#">Home</a></li>
      <li><a href="#">Product</a></li>
	  <li><a href="#">Contact</a></li>
	   <li class="dropdown">
       <a class="dropdown-toggle" data-toggle="dropdown" href="#">Categories<span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="#">Men</a></li>
            <li><a href="#">Women</a></li>
            <li><a href="#">Kids</a></li>
          </ul>
		  </li>
	   
      
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="#"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
      <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> Sign in</a></li>
    </ul>
	<form class="navbar-form navbar-left" action="/action_page.php">
      <div class="input-group">
        <input type="text" class="form-control" placeholder="Search" name="search">
        <div class="input-group-btn">
          <button type="submit" class="btn btn-default">Submit</button>
        </div>
      </div>
    </form>
  </div>
</nav>
<footer>Copyright &copy;  All Rights Reserved 
 <ul class="nav navbar-nav navbar-right" style ="margin-right:30px;"><a href="#"><li>Terms & Conditions</li></a></ul>
 </footer> 
</body>
</html>