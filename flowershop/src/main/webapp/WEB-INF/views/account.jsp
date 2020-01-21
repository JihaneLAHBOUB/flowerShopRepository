<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
 	<meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <meta name="description" content="meta description" />
    <title>Flower Shop</title>

    <!--=== Favicon ===-->
    <link rel="shortcut icon" href="img/favicon.ico" type="image/x-icon" />

    <!-- Google fonts include -->
    <link href="https://fonts.googleapis.com/css?family=Roboto:300,300i,400,400i,500,500i,700,900%7CYesteryear" rel="stylesheet">

    <!-- All Vendor & plugins CSS include -->
    <link href="css/vendor.css" rel="stylesheet">
    <!-- Main Style CSS -->
    <link href="css/style.css" rel="stylesheet">
    
</head>
<body>

	<div >
    <!-- Start Header Area -->
    <header class="header-area">
        <!-- main header start -->
        <div class="main-header d-none d-lg-block">

            <!-- header middle area start -->
            <div class="header-main-area sticky">
                <div class="container">
                    <div class="row align-items-center position-relative">

                        <!-- start logo area -->
                        <div class="col-lg-3">
                            <div class="logo">
                                <a href="/">
                                    <img src="img/logo/logo.png" alt=""/>
                                </a>
                            </div>
                        </div>
                        <!-- start logo area -->

                    </div>
                </div>
            </div>
            <!-- header middle area end -->
        </div>
       
    </header>
    <!-- end Header Area -->

    </div>
    
     <main>
        <!-- breadcrumb area start -->
        <div class="breadcrumb-area common-bg">
            <div class="container">
                <div class="row">
                    <div class="col-12">
                        <div class="breadcrumb-wrap">
                            <nav aria-label="breadcrumb">
                                <h1>login</h1>
                                <ul class="breadcrumb">
                                    <li class="breadcrumb-item"><a href="/flowershop/"><i class="fa fa-home"></i></a></li>
                                    <li class="breadcrumb-item active" aria-current="page">login</li>
                                </ul>
                            </nav>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- breadcrumb area end -->
    
     <!-- login wrapper start -->
        <div class="login-register-wrapper section-space pb-0">
            <div class="container">
                <div class="member-area-from-wrap">
                    <div class="row">
                        <!-- Login Content Start -->
                        <div class="col-lg-6" style="margin-left: 330px;">
                            <div class="login-reg-form-wrap">
                                <h2>Sign In</h2>
                                <form action="login" method="post">
                                	<span class="forget-pwd" style="font-size: larger;">${error }</span>
                                    <div class="single-input-item">
                                        <input type="text" placeholder="Email or Username" name="username" required />
                                    </div>
                                    <div class="single-input-item">
                                        <input type="password" placeholder="Enter your Password" name="password" required />
                                    </div>
                                    <div class="single-input-item">
                                        <div class="login-reg-form-meta d-flex align-items-center justify-content-between">
<!--                                              <a href="#" class="forget-pwd">Forget Password?</a>-->
													<a href="/flowershop/sign" class="forget-pwd" style="margin-left: 440px;font-size: larger;">Sign Up</a>
	                                         </div>
	                                     </div>
                                    <div class="single-input-item">
                                        <button type="submit"  class="btn btn__bg">Login</button>
                                    </div>
                                </form>
                            </div>
                        </div>
                        <!-- Login Content End -->
                        </div>
                  </div>
               </div>
  			</div> 
    
	</main>
<!-- 	<h2>Account Login :</h2> -->

<!-- 	<form action="login" method="post"> -->
<%-- 		<span>${error }</span> --%>
<!-- 		<table border="1"> -->
<!-- 			<tr> -->
<!-- 				<td>Username</td> -->
<!-- 				<td><input type="text" name="username"></td> -->
<!-- 			</tr> -->

<!-- 			<tr> -->
<!-- 				<td>Password</td> -->
<!-- 				<td><input type="password" name="password"></td> -->
<!-- 			</tr> -->

<!-- 			<tr> -->
<!-- 				<td>&nbsp;</td> -->
<!-- 				<td><input type="submit" value="Login"></td> -->
<!-- 				<br /> -->
<!-- 				<a href="sign">Sign Up</a> -->
<!-- 			</tr> -->
<!-- 		</table> -->
<!-- 	</form> -->


<!-- footer widget area start -->
        <div id="contact" class="footer-widget-area">
            <div class="container">
                <div class="footer-widget-inner section-space">
                    <div class="row mbn-30">
                        <!-- footer widget item start -->
                        <div class="col-lg-5 col-md-6 col-sm-8">
                            <div class="footer-widget-item mb-30">
                                <div class="footer-widget-title">
                                    <h5>My account</h5>
                                </div>
                                <ul class="footer-widget-body accout-widget">
                                    <li class="address">
                                        <em><i class="lnr lnr-map-marker"></i></em>
                                        184 Main Rd E, St Albans VIC 3021, Australia
                                    </li>
                                    <li class="email">
                                        <em><i class="lnr lnr-envelope"></i>Mail us: </em>
                                        <a href="mailto:test@yourdomain.com">yourmail@gmail.com</a>
                                    </li>
                                    <li class="phone">
                                        <em><i class="lnr lnr-phone-handset"></i> Phones: </em>
                                        <a href="tel:(012)800456789-987">(012) 800 456 789-987</a>
                                    </li>
                                </ul>
                            </div>
                        </div>
                        <!-- footer widget item end -->
                        

                        <!-- footer widget item start -->
                        <div class="col-lg-2 col-md-6 col-sm-6">
                            <div class="footer-widget-item mb-30">
                                <div class="footer-widget-title">
                                    <h5>information</h5>
                                </div>
                                <ul class="footer-widget-body">
                                    <li><a href="#">Home</a></li>
                                    <li><a href="#">About Us</a></li>
                                    <li><a href="#">Contact Us</a></li>
                                    <li><a href="#">Shipping</a></li>
                                </ul>
                            </div>
                        </div>
                        <!-- footer widget item end -->

                    </div>
                </div>
            </div>
        </div>
        <!-- footer widget area end -->
        
	
	 <div>
    	 <!-- footer bottom area start -->
        <div class="footer-bottom-area">
            <div class="container">
                <div class="row align-items-center">
                    <div class="col-md-6 order-2 order-md-1">
                        <div class="copyright-text">
                            <p>Copyright ©All Right Reserved.</p>
                        </div>
                    </div>
                    <div class="col-md-6 order-1 order-md-2">
                        <div class="footer-social-link">
                            <a href="#"><i class="fa fa-twitter"></i></a>
                            <a href="#"><i class="fa fa-facebook"></i></a>
                            <a href="#"><i class="fa fa-linkedin"></i></a>
                            <a href="#"><i class="fa fa-instagram"></i></a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- footer bottom area end -->

	
    <!-- Scroll to top start -->
    <div class="scroll-top not-visible">
        <i class="fa fa-angle-up"></i>
    </div>
    <!-- Scroll to Top End -->

    <!-- All vendor & plugins & active js include here -->
    <!--All Vendor Js -->
    <script src="js/vendor.js"></script>
    <!-- Active Js -->
    <script src="js/active.js"></script>
    
    </div>
</body>
</html>