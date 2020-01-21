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
<link
	href="https://fonts.googleapis.com/css?family=Roboto:300,300i,400,400i,500,500i,700,900%7CYesteryear"
	rel="stylesheet">

<!-- All Vendor & plugins CSS include -->
<link href="css/vendor.css" rel="stylesheet">
<!-- Main Style CSS -->
<link href="css/style.css" rel="stylesheet">

</head>
<body>

	<div>
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
									<a href="/"> <img src="img/logo/logo.png" alt="" />
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
												<li class="active"><a href="/flowershop/">Home</a></li>

												<li><a href="/flowershop/product">shop </a></li>

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

											<li class="user-hover"><a href="#"> <i
													class="lnr lnr-user"></i>
											</a>
												<ul class="dropdown-list">

	                                                <li><a href="/flowershop/account">Login</a></li>
	                                                
	                                                <li><a href="/flowershop/sign">Sign Up</a></li>
                                                	
                                                	<li><a href="logout">Logout</a></li>
												</ul></li>

											<li><a href="/flowershop/cart" class="minicart-btn">
													<i class="lnr lnr-cart"></i>
													<div class="notification"></div>
											</a></li>
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

	<!-- main wrapper start -->
	<main>
		<!-- slider area start -->
		<section class="slider-area">
			<div
				class="hero-slider-active slick-arrow-style slick-arrow-style_hero slick-dot-style">
				<!-- single slider item start -->
				<div class="hero-single-slide ">
					<div class="hero-slider-item bg-img"
						data-bg="img/slider/home1-slide1.jpg">
						<div class="container">
							<div class="row">
								<div class="col-md-12">
									<div class="hero-slider-content slide-1">
										<span>valentine gift</span>
										<h1>Fresh Your Mind</h1>
										<h2>& Feeling love</h2>
										<a href="/flowershop/product" class="btn-hero">shop now</a>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<!-- single slider item end -->

				<!-- single slider item start -->
				<div class="hero-single-slide">
					<div class="hero-slider-item bg-img"
						data-bg="img/slider/home1-slide2.jpg">
						<div class="container">
							<div class="row">
								<div class="col-md-12">
									<div class="hero-slider-content slide-2">
										<span>valentine gift</span>
										<h1>Fresh Your Mind</h1>
										<h2>& Feeling love</h2>
										<a href="/flowershop/product" class="btn-hero">shop now</a>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<!-- single slider item start -->
			</div>
		</section>
		<!-- slider area end -->

		<!-- banner statistics start -->
		<section class="banner-statistics section-space">
			<div class="container">
				<div class="row mbn-30">
					<!-- start store item -->
					<div class="col-md-4">
						<div class="banner-item mb-30">
							<figure class="banner-thumb">

								<img src="img/banner/img1-top-floda1.jpg" alt="" />

								<figcaption class="banner-content">
									<h2 class="text1">Top friday</h2>
									<h2 class="text2">Yellow Gold</h2>
								</figcaption>
							</figure>
						</div>
					</div>
					<!-- start store item -->

					<!-- start store item -->
					<div class="col-md-4">
						<div class="banner-item mb-30">
							<figure class="banner-thumb">

								<img src="img/banner/img1-top-floda2.jpg" alt="" />

								<figcaption class="banner-content text-center">
									<h2 class="text1">Black friday</h2>
									<h2 class="text2">Orchid stick</h2>
								</figcaption>
							</figure>
						</div>
					</div>
					<!-- start store item -->

					<!-- start store item -->
					<div class="col-md-4">
						<div class="banner-item mb-30">
							<figure class="banner-thumb">

								<img src="img/banner/img1-top-floda3.jpg" alt="" />

								<figcaption class="banner-content">
									<h2 class="text1">10% off</h2>
									<h2 class="text2">tulip flower</h2>
								</figcaption>
							</figure>
						</div>
					</div>
					<!-- start store item -->
				</div>
			</div>
		</section>
		<!-- banner statistics end -->

		<!-- service policy start -->
		<section class="service-policy-area section-space p-0">
			<div class="container">
				<div class="row">
					<div class="col-lg-3 col-md-6 col-sm-6">
						<!-- start policy single item -->
						<div class="service-policy-item">
							<div class="icons">
								<img src="img/icon/free_shipping.png" alt="" />
							</div>
							<div class="policy-terms">
								<h5>free shipping</h5>
								<p>Free shipping all order</p>
							</div>
						</div>
						<!-- end policy single item -->
					</div>
					<div class="col-lg-3 col-md-6 col-sm-6">
						<!-- start policy single item -->
						<div class="service-policy-item">
							<div class="icons">
								<img src="img/icon/support247.png" alt="" />
							</div>
							<div class="policy-terms">
								<h5>SUPPORT 24/7</h5>
								<p>Support 24 hours a day</p>
							</div>
						</div>
						<!-- end policy single item -->
					</div>
					<div class="col-lg-3 col-md-6 col-sm-6">
						<!-- start policy single item -->
						<div class="service-policy-item">
							<div class="icons">
								<img src="img/icon/money_back.png" alt="" />
							</div>
							<div class="policy-terms">
								<h5>Money Return</h5>
								<p>30 days for free return</p>
							</div>
						</div>
						<!-- end policy single item -->
					</div>
					<div class="col-lg-3 col-md-6 col-sm-6">
						<!-- start policy single item -->
						<div class="service-policy-item">
							<div class="icons">
								<img src="img/icon/promotions.png" alt="" />
							</div>
							<div class="policy-terms">
								<h5>ORDER DISCOUNT</h5>
								<p>On every order over $15</p>
							</div>
						</div>
						<!-- end policy single item -->
					</div>
				</div>
			</div>
		</section>
		<!-- service policy end -->

		<!-- our product area start -->
		<section class="our-product section-space">
			<div class="container">
				<div class="row">
					<div class="col-12">
						<div class="section-title text-center">
							<h2>New Products</h2>
							<p>Accumsan vitae pede lacus ut ullamcorper sollicitudin
								quisque libero</p>
						</div>
					</div>
				</div>
				<div class="row mtn-40">
					<!-- product single item start -->

					<c:forEach items="${listProduct }" var="product">

						<div class="col-lg-3 col-md-4 col-sm-6">
							<div class="product-item mt-40">
								<figure class="product-thumb">

									<img class="pri-img" src="img/product/${product.photoName }"
										alt="product" />
									<img class="sec-img" src="img/product/product-14.jpg"
										alt="product" />

									<div class="product-badge">
										<div class="product-label">
											<span>${product.quantity } in stock</span>
										</div>
										<div class="product-label discount">
											<span>10%</span>
										</div>

									</div>
									<div class="button-group">
										<a href="/flowershop/addProduct?id=${product.id}"
											data-toggle="tooltip" data-placement="left"
											title="Add to Cart"><i class="lnr lnr-cart"></i></a>
									</div>
								</figure>
								<div class="product-caption">
									<p class="product-name">
										<a>${product.name }</a>
									</p>
									<div class="price-box">
										<span class="price-regular">${product.currentPrice }
											MAD</span> <span class="price-old"><del>$70.00</del></span> <span>(
											${product.description } )</span>
									</div>
								</div>
							</div>
						</div>

					</c:forEach>
					<!-- product single item end -->

					<div class="col-12">
						<div class="view-more-btn">
							<a class="btn-hero btn-load-more" href="/flowershop/product">view
								more products</a>
						</div>
					</div>
				</div>
			</div>
		</section>

		<!-- banner statistics start -->
		<section class="banner-statistics-right">
			<div class="container">
				<div class="row">
					<!-- start banner item start -->
					<div class="col-md-6">
						<div class="banner-item banner-border">
							<figure class="banner-thumb">
								<a href="#"> <img src="img/banner/banner-1.jpg" alt="" />
								</a>
								<figcaption class="banner-content banner-content-right">
									<h2 class="text1">for you</h2>
									<h2 class="text2">Tulip Flower</h2>
								</figcaption>
							</figure>
						</div>
					</div>
					<!-- start banner item end -->

					<!-- start banner item start -->
					<div class="col-md-6">
						<div class="banner-item banner-border">
							<figure class="banner-thumb">
								<a href="#"> <img src="img/banner/banner-2.jpg" alt="" />
								</a>
								<figcaption class="banner-content banner-content-right">
									<h2 class="text1">for you</h2>
									<h2 class="text2">Flower & Box</h2>
								</figcaption>
							</figure>
						</div>
					</div>
					<!-- start banner item end -->
				</div>
			</div>
		</section>
		<!-- banner statistics end -->



	</main>
	<!-- main wrapper end -->

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
								<li class="address"><em><i class="lnr lnr-map-marker"></i></em>
									184 Main Rd E, St Albans VIC 3021, Australia</li>
								<li class="email"><em><i class="lnr lnr-envelope"></i>Mail
										us: </em> <a href="mailto:test@yourdomain.com">yourmail@gmail.com</a>
								</li>
								<li class="phone"><em><i class="lnr lnr-phone-handset"></i>
										Phones: </em> <a href="tel:(012)800456789-987">(012) 800 456
										789-987</a></li>
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
							<a href="#"><i class="fa fa-twitter"></i></a> <a href="#"><i
								class="fa fa-facebook"></i></a> <a href="#"><i
								class="fa fa-linkedin"></i></a> <a href="#"><i
								class="fa fa-instagram"></i></a>
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