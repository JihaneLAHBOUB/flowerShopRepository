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

                        <!-- main menu area start -->
                        <div class="col-lg-6 position-static">
                            <div class="main-menu-area">
                                <div class="main-menu">
                                    <!-- main menu navbar start -->
                                    <nav class="desktop-menu">
                                        <ul>
                                            <li class="active"><a href="/flowershop/">Home</a>
                                                
                                            </li>
                                        
                                            <li><a href="/flowershop/product">shop </a>
                                            
                                            </li>
                                                
                                            <li><a href="#contact">Contact us</a></li>
                                        </ul>
                                    </nav>
                                    <!-- main menu navbar end -->
                                </div>
                            </div>
                        </div>
                        <!-- main menu area end -->

                        <!-- mini cart area start -->
                        <div class="col-lg-3">
                            <div class="header-configure-wrapper">
                                <div class="header-configure-area">
                                    <ul class="nav justify-content-end">
                                        
                                        <li class="user-hover">
                                            <a href="#">
                                                <i class="lnr lnr-user"></i>
                                            </a>
                                            <ul class="dropdown-list">
                                                
                                                <li><a href="/flowershop/account">Login</a></li>
                                                
                                                <li><a href="/flowershop/sign">Sign Up</a></li>
                                                
                                                <li><a href="logout">Logout</a></li>
                                            </ul>
                                        </li>
                                        
                                        <li>
                                            <a href="/flowershop/cart" class="minicart-btn">
                                                <i class="lnr lnr-cart"></i>
                                                <div class="notification"></div>
                                            </a>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                        <!-- mini cart area end -->

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
                                <h1>cart</h1>
                                <ul class="breadcrumb">
                                    <li class="breadcrumb-item"><a href="/flowershop/"><i class="fa fa-home"></i></a></li>
                                    <li class="breadcrumb-item active" aria-current="page">cart</li>
                                </ul>
                            </nav>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- breadcrumb area end -->
        
        <!-- cart main wrapper start -->
        <div class="cart-main-wrapper section-space pb-0">
            <div class="container">
                <div class="section-bg-color">
                <form action="updateProduct" method="post">
                    <div class="row">
                        <div class="col-lg-12">
                            <!-- Cart Table Area -->
                            <div class="cart-table table-responsive">
                            
                                <table class="table table-bordered">
                                    <thead>
                                        <tr>
                                            <th class="pro-thumbnail">Thumbnail</th>
                                            <th class="pro-title">Product</th>
                                            <th class="pro-price">Price</th>
                                            <th class="pro-quantity">Quantity</th>
                                            <th class="pro-subtotal">Total</th>
                                            <th class="pro-remove">Remove</th>
                                        </tr>
                                    </thead>
                                    <c:forEach items="${sessionScope.cart }" var="item">
                                    <tbody>
                                        <tr>
                                            <td class="pro-thumbnail"><a ><img class="img-fluid" src="img/product/${item.flowerDTO.photoName }" alt="Product" /></a></td>
                                            <td class="pro-title"><a>${item.flowerDTO.name }</a></td>
                                            <td class="pro-price"><span>${item.flowerDTO.currentPrice }</span></td>
                                            <td class="pro-quantity">
                                                <div class="pro-qty"><input type="text" value="${item.quantity }" name="quantity"></div>
                                            </td>
                                            <td class="pro-subtotal"><span>${item.flowerDTO.currentPrice * item.quantity}</span></td>
                                            <td class="pro-remove"><a href="deleteProduct?id=${item.flowerDTO.id}"><i class="fa fa-trash-o"></i></a></td>
                                        </tr>
                                    </tbody>
                                    </c:forEach>
                                </table>
                             
                            </div>
                            <!-- Cart Update Option -->
                            <div class="cart-update-option d-block d-md-flex justify-content-between">
                                <div class="cart-update">
	                                     <a href="/flowershop/product" class="btn btn__bg" style="width: 158px;">Continue Shopping</a> 
                                </div>
                                <div class="cart-update" style="margin-left: 865px;">
                                    <input type="submit" class="btn btn__bg" value="Update Cart">
                                </div>
                            </div>
                        </div>
                    </div>
                    </form>
                    <div class="row">
                        <div class="col-lg-5 ml-auto">
                            <!-- Cart Calculation Area -->
                            <div class="cart-calculator-wrapper">
                                <div class="cart-calculate-items">
                                    <h3>Cart Totals</h3>
                                    <div class="table-responsive">
                                        <table class="table">
                                            <tr>
                                                <td>Sub Total</td>
                                                <td>${total}</td>
                                            </tr>
                                            <tr>
                                                <td>Shipping</td>
                                                <td>free</td>
                                            </tr>
                                            <tr class="total">
                                                <td>Total</td>
                                                <td class="total-amount">${total} MAD</td>
                                            </tr>
                                        </table>
                                    </div>
                                </div>
                                <a href="/flowershop/checkout" class="btn btn__bg d-block">Proceed To Checkout</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- cart main wrapper end -->
        
        
        
    </main>

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