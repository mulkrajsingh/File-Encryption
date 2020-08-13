<%-- 
    Document   : Admin1
    Created on : 28 Feb, 2016, 9:38:13 PM
    Author     : Java
--%>




<!DOCTYPE html>
<html lang="en">
<head>
 
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta name="description" content="">
	<title>Admin LogIn</title>
	 
	<link href="css/bootstrap.css" rel="stylesheet">
	 
	<link href="css/main.css" rel="stylesheet">
 
	<!--[if lt IE 9]>
	  <script src="js/html5shiv.js"></script>
	  <script src="js/respond.min.js"></script>
	<![endif]-->
 
	<link rel="shortcut icon" href="images/favicon.png">
	<script src="js/pace.js"></script>
 
	<link href='http://fonts.googleapis.com/css?family=Open+Sans:300,600' rel='stylesheet' type='text/css'>
</head>

<body>
	<div class="preloader"></div>
	
    <! -- ******************** MASTHEAD SECTION ******************** -->	
	<main id="top" class="masthead" role="main">
		<div class="container">
			<div class="logo"> <a href="index.html#"><img src="images/logo.png" alt="logo"></a>
			</div>
 
			<h1>Erasure coding  <strong> Is A </strong> <br>
			<strong> Powerful Way of securing  </strong> Cloud </h1>
 
			<div class="row">
				<div class="col-md-6 col-sm-12 col-md-offset-3 subscribe">
					<form class="form-horizontal" role="form" action="AdminServlet"  method="POST">
						<div class="form-group">
							<div class="col-md-7 col-sm-6 col-sm-offset-1 col-md-offset-0">
								<input class="form-control input-lg" name="username" type="text" id="address" placeholder="Enter your UserName"  required="required">
							</div>
                                                    
                                                    <div class="col-md-7 col-sm-6 col-sm-offset-1 col-md-offset-0">
								<input class="form-control input-lg" name="password" type="password" id="address" placeholder="Enter your Password"  required="required">
							</div>
                                                    
                                                    <br>
                                                    <br>
                                                    
                                                    <br>
                                                    
                                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                    <br>
                                                    <div>
                                                        
                                                        
                                                    </div>
							<div class="col-md-5 col-sm-4">
								<button type="submit" class="btn btn-success btn-lg">LOGIN</button>
							</div>
						</div>
					</form>
					<span id="result" class="alertMsg"></span> </div>
				</div>
 
				<a href="Admin1.jsp" class="scrollto">
				</a>
 
<script src="js/jquery.js"></script>
<script src="js/bootstrap.js"></script>
<script src="js/easing.js"></script>
<script src="js/nicescroll.js"></script>
 
 
<script>


 $(function() {
    $('.scrollto, .gototop').bind('click',function(event){
		 var $anchor = $(this);
		 $('html, body').stop().animate({
         scrollTop: $($anchor.attr('href')).offset().top
          }, 1500,'easeInOutExpo');
     event.preventDefault();
      });
  });
        

</script>
 
</body>
</html>

