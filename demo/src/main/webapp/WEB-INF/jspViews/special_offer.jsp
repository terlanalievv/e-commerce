<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 4/28/2019
  Time: 2:15 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Bootshop online Shopping cart</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <!--Less styles -->
    <!-- Other Less css file //different less files has different color scheam
     <link rel="stylesheet/less" type="text/css" href="/resources/homestate/front/bootstrap-shop/themes/less/simplex.less">
     <link rel="stylesheet/less" type="text/css" href="/resources/homestate/front/bootstrap-shop/themes/less/classified.less">
     <link rel="stylesheet/less" type="text/css" href="/resources/homestate/front/bootstrap-shop/themes/less/amelia.less">  MOVE DOWN TO activate
     -->
    <!--<link rel="stylesheet/less" type="text/css" href="/resources/homestate/front/bootstrap-shop/themes/less/bootshop.less">
    <script src="/resources/homestate/front/bootstrap-shop/themes/js/less.js" type="text/javascript"></script> -->

    <!-- Bootstrap style -->
    <link id="callCss" rel="stylesheet" href="/resources/homestate/front/bootstrap-shop/themes/bootshop/bootstrap.min.css" media="screen"/>
    <link href="/resources/homestate/front/bootstrap-shop/themes/css/base.css" rel="stylesheet" media="screen"/>
    <!-- Bootstrap style responsive -->
    <link href="/resources/homestate/front/bootstrap-shop/themes/css/bootstrap-responsive.min.css" rel="stylesheet"/>
    <link href="/resources/homestate/front/bootstrap-shop/themes/css/font-awesome.css" rel="stylesheet" type="text/css">
    <!-- Google-code-prettify -->
    <link href="/resources/homestate/front/bootstrap-shop/themes/js/google-code-prettify/prettify.css" rel="stylesheet"/>
    <!-- fav and touch icons -->
    <link rel="shortcut icon" href="/resources/homestate/front/bootstrap-shop/themes/images/ico/favicon.ico">
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="/resources/homestate/front/bootstrap-shop/themes/images/ico/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="/resources/homestate/front/bootstrap-shop/themes/images/ico/apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="/resources/homestate/front/bootstrap-shop/themes/images/ico/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="/resources/homestate/front/bootstrap-shop/themes/images/ico/apple-touch-icon-57-precomposed.png">
    <style type="text/css" id="enject"></style>
</head>
<body>
<div id="header">
    <div class="container">
        <div id="welcomeLine" class="row">
            <div class="span6">Welcome!<strong> User</strong></div>
            <div class="span6">
                <div class="pull-right">
                    <a href="product_summary"><span class="">Fr</span></a>
                    <a href="product_summary"><span class="">Es</span></a>
                    <span class="btn btn-mini">En</span>
                    <a href="product_summary"><span>&pound;</span></a>
                    <span class="btn btn-mini">$155.00</span>
                    <a href="product_summary"><span class="">$</span></a>
                    <a href="product_summary"><span class="btn btn-mini btn-primary"><i class="icon-shopping-cart icon-white"></i> [ 3 ] Itemes in your cart </span> </a>
                </div>
            </div>
        </div>
        <!-- Navbar ================================================== -->
        <div id="logoArea" class="navbar">
            <a id="smallScreen" data-target="#topMenu" data-toggle="collapse" class="btn btn-navbar">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </a>
            <div class="navbar-inner">
                <a class="brand" href="index"><img src="/resources/homestate/front/bootstrap-shop/themes/images/logo.png" alt="Bootsshop"/></a>
                <form class="form-inline navbar-search" method="post" action="products" >
                    <input id="srchFld" class="srchTxt" type="text" />
                    <select class="srchTxt">
                        <option>All</option>
                        <option>CLOTHES </option>
                        <option>FOOD AND BEVERAGES </option>
                        <option>HEALTH & BEAUTY </option>
                        <option>SPORTS & LEISURE </option>
                        <option>BOOKS & ENTERTAINMENTS </option>
                    </select>
                    <a href="products"><button type="submit" id="submitButton" class="btn btn-primary">Go</button></a>
                </form>
                <ul id="topMenu" class="nav pull-right">
                    <li class=""><a href="special_offer">Specials Offer</a></li>
                    <li class=""><a href="normal">Delivery</a></li>
                    <li class=""><a href="contact">Contact</a></li>
                    <li class="">
                        <a href="#login" role="button" data-toggle="modal" style="padding-right:0"><span class="btn btn-large btn-success">Login</span></a>
                        <div id="login" class="modal hide fade in" tabindex="-1" role="dialog" aria-labelledby="login" aria-hidden="false" >
                            <div class="modal-header">
                                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">�</button>
                                <h3>Login Block</h3>
                            </div>
                            <div class="modal-body">
                                <form class="form-horizontal loginFrm">
                                    <div class="control-group">
                                        <input type="text" id="inputEmail" placeholder="Email">
                                    </div>
                                    <div class="control-group">
                                        <input type="password" id="inputPassword" placeholder="Password">
                                    </div>
                                    <div class="control-group">
                                        <label class="checkbox">
                                            <input type="checkbox"> Remember me
                                        </label>
                                    </div>
                                </form>
                                <button type="submit" class="btn btn-success">Sign in</button>
                                <button class="btn" data-dismiss="modal" aria-hidden="true">Close</button>
                            </div>
                        </div>
                    </li>
                </ul>
            </div>
        </div>
    </div>
</div>
<!-- Header End====================================================================== -->
<div id="mainBody">
    <div class="container">
        <div class="row">
            <!-- Sidebar ================================================== -->
            <div id="sidebar" class="span3">
                <div class="well well-small"><a id="myCart" href="product_summary"><img src="/resources/homestate/front/bootstrap-shop/themes/images/ico-cart.png" alt="cart">3 Items in your cart  <span class="badge badge-warning pull-right">$155.00</span></a></div>
                <ul id="sideManu" class="nav nav-tabs nav-stacked">
                    <li class="subMenu open"><a> ELECTRONICS [230]</a>
                        <ul>
                            <li><a class="active" href="products"><i class="icon-chevron-right"></i>Cameras (100) </a></li>
                            <li><a href="products"><i class="icon-chevron-right"></i>Computers, Tablets & laptop (30)</a></li>
                            <li><a href="products"><i class="icon-chevron-right"></i>Mobile Phone (80)</a></li>
                            <li><a href="products"><i class="icon-chevron-right"></i>Sound & Vision (15)</a></li>
                        </ul>
                    </li>
                    <li class="subMenu"><a> CLOTHES [840] </a>
                        <ul style="display:none">
                            <li><a href="products"><i class="icon-chevron-right"></i>Women's Clothing (45)</a></li>
                            <li><a href="products"><i class="icon-chevron-right"></i>Women's Shoes (8)</a></li>
                            <li><a href="products"><i class="icon-chevron-right"></i>Women's Hand Bags (5)</a></li>
                            <li><a href="products"><i class="icon-chevron-right"></i>Men's Clothings  (45)</a></li>
                            <li><a href="products"><i class="icon-chevron-right"></i>Men's Shoes (6)</a></li>
                            <li><a href="products"><i class="icon-chevron-right"></i>Kids Clothing (5)</a></li>
                            <li><a href="products"><i class="icon-chevron-right"></i>Kids Shoes (3)</a></li>
                        </ul>
                    </li>
                    <li class="subMenu"><a>FOOD AND BEVERAGES [1000]</a>
                        <ul style="display:none">
                            <li><a href="products"><i class="icon-chevron-right"></i>Angoves  (35)</a></li>
                            <li><a href="products"><i class="icon-chevron-right"></i>Bouchard Aine & Fils (8)</a></li>
                            <li><a href="products"><i class="icon-chevron-right"></i>French Rabbit (5)</a></li>
                            <li><a href="products"><i class="icon-chevron-right"></i>Louis Bernard  (45)</a></li>
                            <li><a href="products"><i class="icon-chevron-right"></i>BIB Wine (Bag in Box) (8)</a></li>
                            <li><a href="products"><i class="icon-chevron-right"></i>Other Liquors & Wine (5)</a></li>
                            <li><a href="products"><i class="icon-chevron-right"></i>Garden (3)</a></li>
                            <li><a href="products"><i class="icon-chevron-right"></i>Khao Shong (11)</a></li>
                        </ul>
                    </li>
                    <li><a href="products">HEALTH & BEAUTY [18]</a></li>
                    <li><a href="products">SPORTS & LEISURE [58]</a></li>
                    <li><a href="products">BOOKS & ENTERTAINMENTS [14]</a></li>
                </ul>
                <br/>
                <div class="thumbnail">
                    <img src="/resources/homestate/front/bootstrap-shop/themes/images/products/panasonic.jpg" alt="Bootshop panasonoc New camera"/>
                    <div class="caption">
                        <h5>Panasonic</h5>
                        <h4 style="text-align:center"><a class="btn" href="product_details"> <i class="icon-zoom-in"></i></a> <a class="btn" href="#">Add to <i class="icon-shopping-cart"></i></a> <a class="btn btn-primary" href="#">$222.00</a></h4>
                    </div>
                </div><br/>
                <div class="thumbnail">
                    <img src="/resources/homestate/front/bootstrap-shop/themes/images/products/kindle.png" title="Bootshop New Kindel" alt="Bootshop Kindel">
                    <div class="caption">
                        <h5>Kindle</h5>
                        <h4 style="text-align:center"><a class="btn" href="product_details"> <i class="icon-zoom-in"></i></a> <a class="btn" href="#">Add to <i class="icon-shopping-cart"></i></a> <a class="btn btn-primary" href="#">$222.00</a></h4>
                    </div>
                </div><br/>
                <div class="thumbnail">
                    <img src="/resources/homestate/front/bootstrap-shop/themes/images/payment_methods.png" title="Bootshop Payment Methods" alt="Payments Methods">
                    <div class="caption">
                        <h5>Payment Methods</h5>
                    </div>
                </div>
            </div>
            <!-- Sidebar end=============================================== -->
            <div class="span9">
                <ul class="breadcrumb">
                    <li><a href="index">Home</a> <span class="divider">/</span></li>
                    <li class="active">Special offers</li>
                </ul>
                <h4> 20% Discount Special offer<small class="pull-right"> 40 products are available </small></h4>
                <hr class="soft"/>
                <form class="form-horizontal span6">
                    <div class="control-group">
                        <label class="control-label alignL">Sort By </label>
                        <select>
                            <option>Priduct name A - Z</option>
                            <option>Priduct name Z - A</option>
                            <option>Priduct Stoke</option>
                            <option>Price Lowest first</option>
                        </select>
                    </div>
                </form>
                <div id="myTab" class="pull-right">
                    <a href="#listView" data-toggle="tab"><span class="btn btn-large"><i class="icon-list"></i></span></a>
                    <a href="#blockView" data-toggle="tab"><span class="btn btn-large btn-primary"><i class="icon-th-large"></i></span></a>
                </div>
                <br class="clr"/>
                <div class="tab-content">
                    <div class="tab-pane" id="listView">
                        <div class="row">
                            <div class="span2">
                                <img src="/resources/homestate/front/bootstrap-shop/themes/images/products/b1.jpg" alt=""/>
                            </div>
                            <div class="span4">
                                <h3>New | Available</h3>
                                <hr class="soft"/>
                                <h5>Product Name </h5>
                                <p>
                                    Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s ...
                                </p>
                                <a class="btn btn-small pull-right" href="product_details">View Details</a>
                                <br class="clr"/>
                            </div>
                            <div class="span3 alignR">
                                <form class="form-horizontal qtyFrm">
                                    <h3> $110.00</h3>
                                    <label class="checkbox">
                                        <input type="checkbox">  Adds product to compair
                                    </label><br/>
                                    <a href="product_details" class="btn btn-large btn-primary"> Add to <i class=" icon-shopping-cart"></i></a>
                                    <a href="product_details" class="btn btn-large"><i class="icon-zoom-in"></i></a>
                                </form>
                            </div>
                        </div>
                        <hr class="soft"/>
                        <div class="row">
                            <div class="span2">
                                <img src="/resources/homestate/front/bootstrap-shop/themes/images/products/b2.jpg" alt=""/>
                            </div>
                            <div class="span4">
                                <h3>New | Available</h3>
                                <hr class="soft"/>
                                <h5>Product Name </h5>
                                <p>
                                    Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s ...
                                </p>
                                <a class="btn btn-small pull-right" href="product_details">View Details</a>
                                <br class="clr"/>
                            </div>
                            <div class="span3 alignR">
                                <form class="form-horizontal qtyFrm">
                                    <h3> $110.00</h3>
                                    <label class="checkbox">
                                        <input type="checkbox">  Adds product to compair
                                    </label><br/>
                                    <a href="product_details" class="btn btn-large btn-primary"> Add to <i class=" icon-shopping-cart"></i></a>
                                    <a href="product_details" class="btn btn-large"><i class="icon-zoom-in"></i></a>
                                </form>
                            </div>
                        </div>
                        <hr class="soft"/>
                        <div class="row">
                            <div class="span2">
                                <img src="/resources/homestate/front/bootstrap-shop/themes/images/products/b3.jpg" alt=""/>
                            </div>
                            <div class="span4">
                                <h3>New | Available</h3>
                                <hr class="soft"/>
                                <h5>Product Name </h5>
                                <p>
                                    Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s ...
                                </p>
                                <a class="btn btn-small pull-right" href="product_details">View Details</a>
                                <br class="clr"/>
                            </div>
                            <div class="span3 alignR">
                                <form class="form-horizontal qtyFrm">
                                    <h3> $110.00</h3>
                                    <label class="checkbox">
                                        <input type="checkbox">  Adds product to compair
                                    </label><br/>
                                    <a href="product_details" class="btn btn-large btn-primary"> Add to <i class=" icon-shopping-cart"></i></a>
                                    <a href="product_details" class="btn btn-large"><i class="icon-zoom-in"></i></a>
                                </form>
                            </div>
                        </div>
                        <hr class="soft"/>
                        <div class="row">
                            <div class="span2">
                                <img src="/resources/homestate/front/bootstrap-shop/themes/images/products/b4.jpg" alt=""/>
                            </div>
                            <div class="span4">
                                <h3>New | Available</h3>
                                <hr class="soft"/>
                                <h5>Product Name </h5>
                                <p>
                                    Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s ...
                                </p>
                                <a class="btn btn-small pull-right" href="product_details">View Details</a>
                                <br class="clr"/>
                            </div>
                            <div class="span3 alignR">
                                <form class="form-horizontal qtyFrm">
                                    <h3> $110.00</h3>
                                    <label class="checkbox">
                                        <input type="checkbox">  Adds product to compair
                                    </label><br/>
                                    <a href="product_details" class="btn btn-large btn-primary"> Add to <i class=" icon-shopping-cart"></i></a>
                                    <a href="product_details" class="btn btn-large"><i class="icon-zoom-in"></i></a>
                                </form>
                            </div>
                        </div>

                        <hr class="soft"/>
                        <div class="row">
                            <div class="span2">
                                <img src="/resources/homestate/front/bootstrap-shop/themes/images/products/6.jpg" alt=""/>
                            </div>
                            <div class="span4">
                                <h3>New | Available</h3>
                                <hr class="soft"/>
                                <h5>Product Name </h5>
                                <p>
                                    Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s ...
                                </p>
                                <a class="btn btn-small pull-right" href="product_details">View Details</a>
                                <br class="clr"/>
                            </div>
                            <div class="span3 alignR">
                                <form class="form-horizontal qtyFrm">
                                    <h3> $222.00</h3>
                                    <label class="checkbox">
                                        <input type="checkbox">  Adds product to compair
                                    </label><br/>
                                    <a href="product_details" class="btn btn-large btn-primary"> Add to <i class=" icon-shopping-cart"></i></a>
                                    <a href="product_details" class="btn btn-large"><i class="icon-zoom-in"></i></a>
                                </form>
                            </div>
                        </div>
                        <hr class="soft"/>
                        <div class="row">
                            <div class="span2">
                                <img src="/resources/homestate/front/bootstrap-shop/themes/images/products/7.jpg" alt=""/>
                            </div>
                            <div class="span4">
                                <h3>New | Available</h3>
                                <hr class="soft"/>
                                <h5>Product Name </h5>
                                <p>

                                    Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s ...
                                </p>
                                <a class="btn btn-small pull-right" href="product_details">View Details</a>
                                <br class="clr"/>
                            </div>
                            <div class="span3 alignR">
                                <form class="form-horizontal qtyFrm">
                                    <h3> $222.00</h3>
                                    <label class="checkbox">
                                        <input type="checkbox">  Adds product to compair
                                    </label><br/>
                                    <a href="product_details" class="btn btn-large btn-primary"> Add to <i class=" icon-shopping-cart"></i></a>
                                    <a href="product_details" class="btn btn-large"><i class="icon-zoom-in"></i></a>
                                </form>
                            </div>
                        </div>
                        <hr class="soft"/>
                    </div>

                    <div class="tab-pane  active" id="blockView">
                        <ul class="thumbnails">
                            <li class="span3">
                                <div class="thumbnail">
                                    <a href="product_details"><img src="/resources/homestate/front/bootstrap-shop/themes/images/products/b1.jpg" alt=""/></a>
                                    <div class="caption">
                                        <h5>Manicure &amp; Pedicure</h5>
                                        <p>
                                            Lorem Ipsum is simply dummy text.
                                        </p>
                                        <h4 style="text-align:center"><a class="btn" href="product_details"> <i class="icon-zoom-in"></i></a> <a class="btn" href="#">Add to <i class="icon-shopping-cart"></i></a> <a class="btn btn-primary" href="#">&euro;110.00</a></h4>
                                    </div>
                                </div>
                            </li>
                            <li class="span3">
                                <div class="thumbnail">
                                    <a href="product_details"><img src="/resources/homestate/front/bootstrap-shop/themes/images/products/b2.jpg" alt=""/></a>
                                    <div class="caption">
                                        <h5>Manicure &amp; Pedicure</h5>
                                        <p>
                                            Lorem Ipsum is simply dummy text.
                                        </p>
                                        <h4 style="text-align:center"><a class="btn" href="product_details"> <i class="icon-zoom-in"></i></a> <a class="btn" href="#">Add to <i class="icon-shopping-cart"></i></a> <a class="btn btn-primary" href="#">&euro;110.00</a></h4>
                                    </div>
                                </div>
                            </li>
                            <li class="span3">
                                <div class="thumbnail">
                                    <a href="product_details"><img src="/resources/homestate/front/bootstrap-shop/themes/images/products/b3.jpg" alt=""/></a>
                                    <div class="caption">
                                        <h5>Manicure &amp; Pedicure</h5>
                                        <p>
                                            Lorem Ipsum is simply dummy text.
                                        </p>
                                        <h4 style="text-align:center"><a class="btn" href="product_details"> <i class="icon-zoom-in"></i></a> <a class="btn" href="#">Add to <i class="icon-shopping-cart"></i></a> <a class="btn btn-primary" href="#">&euro;110.00</a></h4>
                                    </div>
                                </div>
                            </li>
                            <li class="span3">
                                <div class="thumbnail">
                                    <a href="product_details"><img src="/resources/homestate/front/bootstrap-shop/themes/images/products/b4.jpg" alt=""/></a>
                                    <div class="caption">
                                        <h5>Manicure &amp; Pedicure</h5>
                                        <p>
                                            Lorem Ipsum is simply dummy text.
                                        </p>
                                        <h4 style="text-align:center"><a class="btn" href="product_details"> <i class="icon-zoom-in"></i></a> <a class="btn" href="#">Add to <i class="icon-shopping-cart"></i></a> <a class="btn btn-primary" href="#">&euro;110.00</a></h4>
                                    </div>
                                </div>
                            </li>
                            <li class="span3">
                                <div class="thumbnail">
                                    <a href="product_details"><img src="/resources/homestate/front/bootstrap-shop/themes/images/products/9.jpg" alt=""/></a>
                                    <div class="caption">
                                        <h5>Manicure &amp; Pedicure</h5>
                                        <p>
                                            Lorem Ipsum is simply dummy text.
                                        </p>
                                        <h4 style="text-align:center"><a class="btn" href="product_details"> <i class="icon-zoom-in"></i></a> <a class="btn" href="#">Add to <i class="icon-shopping-cart"></i></a> <a class="btn btn-primary" href="#">&euro;222.00</a></h4>
                                    </div>
                                </div>
                            </li>
                            <li class="span3">
                                <div class="thumbnail">
                                    <a href="product_details"><img src="/resources/homestate/front/bootstrap-shop/themes/images/products/4.jpg" alt=""/></a>
                                    <div class="caption">
                                        <h5>Manicure &amp; Pedicure</h5>
                                        <p>
                                            Lorem Ipsum is simply dummy text.
                                        </p>
                                        <h4 style="text-align:center"><a class="btn" href="product_details"> <i class="icon-zoom-in"></i></a> <a class="btn" href="#">Add to <i class="icon-shopping-cart"></i></a> <a class="btn btn-primary" href="#">&euro;222.00</a></h4>
                                    </div>
                                </div>
                            </li>
                            <li class="span3">
                                <div class="thumbnail">
                                    <a href="product_details"><img src="/resources/homestate/front/bootstrap-shop/themes/images/products/6.jpg" alt=""/></a>
                                    <div class="caption">
                                        <h5>Manicure &amp; Pedicure</h5>
                                        <p>
                                            Lorem Ipsum is simply dummy text.
                                        </p>
                                        <h4 style="text-align:center"><a class="btn" href="product_details"> <i class="icon-zoom-in"></i></a> <a class="btn" href="#">Add to <i class="icon-shopping-cart"></i></a> <a class="btn btn-primary" href="#">&euro;222.00</a></h4>
                                    </div>
                                </div>
                            </li>
                            <li class="span3">
                                <div class="thumbnail">
                                    <a href="product_details"><img src="/resources/homestate/front/bootstrap-shop/themes/images/products/7.jpg" alt=""/></a>
                                    <div class="caption">
                                        <h5>Manicure &amp; Pedicure</h5>
                                        <p>
                                            Lorem Ipsum is simply dummy text.
                                        </p>
                                        <h4 style="text-align:center"><a class="btn" href="product_details"> <i class="icon-zoom-in"></i></a> <a class="btn" href="#">Add to <i class="icon-shopping-cart"></i></a> <a class="btn btn-primary" href="#">&euro;222.00</a></h4>
                                    </div>
                                </div>
                            </li>
                            <li class="span3">
                                <div class="thumbnail">
                                    <a href="product_details"><img src="/resources/homestate/front/bootstrap-shop/themes/images/products/8.jpg" alt=""/></a>
                                    <div class="caption">
                                        <h5>Manicure &amp; Pedicure</h5>
                                        <p>
                                            Lorem Ipsum is simply dummy text.
                                        </p>
                                        <h4 style="text-align:center"><a class="btn" href="product_details"> <i class="icon-zoom-in"></i></a> <a class="btn" href="#">Add to <i class="icon-shopping-cart"></i></a> <a class="btn btn-primary" href="#">&euro;222.00</a></h4>
                                    </div>
                                </div>
                            </li>
                        </ul>


                        <hr class="soft"/>
                    </div>
                </div>
                <a href="compair" class="btn btn-large pull-right">Compair Product</a>
                <div class="pagination">
                    <ul>
                        <li><a href="#">&lsaquo;</a></li>
                        <li><a href="#">1</a></li>
                        <li><a href="#">2</a></li>
                        <li><a href="#">3</a></li>
                        <li><a href="#">4</a></li>
                        <li><a href="#">...</a></li>
                        <li><a href="#">&rsaquo;</a></li>
                    </ul>
                </div>
                <br class="clr"/>
            </div>
        </div></div>
</div>
<!-- MainBody End ============================= -->
<!-- Footer ================================================================== -->
<div  id="footerSection">
    <div class="container">
        <div class="row">
            <div class="span3">
                <h5>ACCOUNT</h5>
                <a href="login">YOUR ACCOUNT</a>
                <a href="login">PERSONAL INFORMATION</a>
                <a href="login">ADDRESSES</a>
                <a href="login">DISCOUNT</a>
                <a href="login">ORDER HISTORY</a>
            </div>
            <div class="span3">
                <h5>INFORMATION</h5>
                <a href="contact">CONTACT</a>
                <a href="register">REGISTRATION</a>
                <a href="legal_notice">LEGAL NOTICE</a>
                <a href="tac">TERMS AND CONDITIONS</a>
                <a href="faq">FAQ</a>
            </div>
            <div class="span3">
                <h5>OUR OFFERS</h5>
                <a href="#">NEW PRODUCTS</a>
                <a href="#">TOP SELLERS</a>
                <a href="special_offer">SPECIAL OFFERS</a>
                <a href="#">MANUFACTURERS</a>
                <a href="#">SUPPLIERS</a>
            </div>
            <div id="socialMedia" class="span3 pull-right">
                <h5>SOCIAL MEDIA </h5>
                <a href="#"><img width="60" height="60" src="/resources/homestate/front/bootstrap-shop/themes/images/facebook.png" title="facebook" alt="facebook"/></a>
                <a href="#"><img width="60" height="60" src="/resources/homestate/front/bootstrap-shop/themes/images/twitter.png" title="twitter" alt="twitter"/></a>
                <a href="#"><img width="60" height="60" src="/resources/homestate/front/bootstrap-shop/themes/images/youtube.png" title="youtube" alt="youtube"/></a>
            </div>
        </div>
        <p class="pull-right">&copy; Bootshop</p>
    </div><!-- Container End -->
</div>
<!-- Placed at the end of the document so the pages load faster ============================================= -->
<script src="/resources/homestate/front/bootstrap-shop/themes/js/jquery.js" type="text/javascript"></script>
<script src="/resources/homestate/front/bootstrap-shop/themes/js/bootstrap.min.js" type="text/javascript"></script>
<script src="/resources/homestate/front/bootstrap-shop/themes/js/google-code-prettify/prettify.js"></script>

<script src="/resources/homestate/front/bootstrap-shop/themes/js/bootshop.js"></script>
<script src="/resources/homestate/front/bootstrap-shop/themes/js/jquery.lightbox-0.5.js"></script>
</body>
</html>