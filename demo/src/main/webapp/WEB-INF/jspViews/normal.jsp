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
                    <a href="products" > <button type="submit" id="submitButton" class="btn btn-primary"> Go</button></a>
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
                            <jsp:include page="pop_up.jsp"></jsp:include>
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
            <div class="span9" id="mainCol">
                <ul class="breadcrumb">
                    <li><a href="index">Home</a> <span class="divider">/</span></li>
                    <li class="active">Page Title</li>
                </ul>
                <h3> Title of the page</h3>
                <hr class="soft"/>
                <h5>Lorem ipsum dolor sit amet</h5><br/>
                <p>
                    Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam elementum varius dapibus. Sed hendrerit porta felis at sollicitudin. Sed at nunc ac neque semper fermentum. Proin diam sem, semper fermentum eleifend nec, viverra ac est. Sed ultricies, lectus et vehicula imperdiet, felis tortor vehicula turpis, non fermentum enim est et sapien. Nam justo mi, dignissim a euismod ut, pretium sed leo. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. In viverra porta est, consequat elementum metus tristique a. Mauris tempus tellus a metus dapibus faucibus egestas lectus consectetur. Integer libero dolor, luctus non congue vitae, tempus ut neque. Nunc eleifend lorem quis diam pharetra sagittis. Aliquam ut dolor dui. Fusce dictum facilisis ipsum eu porttitor. In ultricies rhoncus tortor vitae tincidunt.
                </p>
                <h5>Lorem ipsum dolor sit amet</h5><br/>
                <p>
                    Nullam a vulputate leo. Nulla tristique metus eros. Curabitur ultrices commodo mauris, sit amet faucibus lectus fermentum in. Nulla eleifend, augue hendrerit tempus faucibus, diam lacus aliquet urna, eget facilisis turpis risus quis arcu. Cras placerat suscipit sem, ac consequat dui iaculis eu. Cras elit enim, adipiscing lobortis rutrum ac, vehicula nec massa. Praesent pharetra ligula ac erat venenatis feugiat. Quisque id nulla mi. Mauris at orci nec nisi eleifend auctor. Mauris placerat consectetur tincidunt. Nam eu tellus vitae dolor vestibulum commodo. Etiam tristique, urna ac convallis laoreet, enim enim aliquet neque, id cursus risus nulla sed ligula. Nunc quam libero, accumsan vitae consequat at, sollicitudin eget mi. Phasellus in molestie diam. Aliquam enim purus, tempor id sodales non, volutpat eu diam. Donec eu nisl lacinia leo semper lobortis sed sit amet elit.
                </p>
                <h5>Lorem ipsum dolor sit amet</h5><br/>
                <p>
                    Aliquam interdum, ipsum a posuere dictum, tellus risus blandit dolor, at tristique sapien urna vel purus. Pellentesque in dictum urna. Sed feugiat libero sit amet arcu malesuada eu convallis dui convallis. Donec facilisis massa a ipsum aliquam lobortis. Praesent ac lectus sed leo aliquam egestas. Sed ante neque, volutpat ac tempor et, bibendum at ligula. Nunc porta vestibulum sodales.
                </p>
                <h5>Lorem ipsum dolor sit amet</h5><br/>
                <p>
                    Nullam a vulputate leo. Nulla tristique metus eros. Curabitur ultrices commodo mauris, sit amet faucibus lectus fermentum in. Nulla eleifend, augue hendrerit tempus faucibus, diam lacus aliquet urna, eget facilisis turpis risus quis arcu. Cras placerat suscipit sem, ac consequat dui iaculis eu. Cras elit enim, adipiscing lobortis rutrum ac, vehicula nec massa. Praesent pharetra ligula ac erat venenatis feugiat. Quisque id nulla mi. Mauris at orci nec nisi eleifend auctor. Mauris placerat consectetur tincidunt. Nam eu tellus vitae dolor vestibulum commodo. Etiam tristique, urna ac convallis laoreet, enim enim aliquet neque, id cursus risus nulla sed ligula. Nunc quam libero, accumsan vitae consequat at, sollicitudin eget mi. Phasellus in molestie diam. Aliquam enim purus, tempor id sodales non, volutpat eu diam. Donec eu nisl lacinia leo semper lobortis sed sit amet elit.
                </p>
                <h5>Lorem ipsum dolor sit amet</h5><br/>
                <p>
                    Aliquam interdum, ipsum a posuere dictum, tellus risus blandit dolor, at tristique sapien urna vel purus. Pellentesque in dictum urna. Sed feugiat libero sit amet arcu malesuada eu convallis dui convallis. Donec facilisis massa a ipsum aliquam lobortis. Praesent ac lectus sed leo aliquam egestas. Sed ante neque, volutpat ac tempor et, bibendum at ligula. Nunc porta vestibulum sodales.
                </p>
                <h5>Lorem ipsum dolor sit amet</h5><br/>
                <p>
                    Nullam a vulputate leo. Nulla tristique metus eros. Curabitur ultrices commodo mauris, sit amet faucibus lectus fermentum in. Nulla eleifend, augue hendrerit tempus faucibus, diam lacus aliquet urna, eget facilisis turpis risus quis arcu. Cras placerat suscipit sem, ac consequat dui iaculis eu. Cras elit enim, adipiscing lobortis rutrum ac, vehicula nec massa. Praesent pharetra ligula ac erat venenatis feugiat. Quisque id nulla mi. Mauris at orci nec nisi eleifend auctor. Mauris placerat consectetur tincidunt. Nam eu tellus vitae dolor vestibulum commodo. Etiam tristique, urna ac convallis laoreet, enim enim aliquet neque, id cursus risus nulla sed ligula. Nunc quam libero, accumsan vitae consequat at, sollicitudin eget mi. Phasellus in molestie diam. Aliquam enim purus, tempor id sodales non, volutpat eu diam. Donec eu nisl lacinia leo semper lobortis sed sit amet elit.
                </p>
                <h5>Lorem ipsum dolor sit amet</h5><br/>
                <p>
                    Aliquam interdum, ipsum a posuere dictum, tellus risus blandit dolor, at tristique sapien urna vel purus. Pellentesque in dictum urna. Sed feugiat libero sit amet arcu malesuada eu convallis dui convallis. Donec facilisis massa a ipsum aliquam lobortis. Praesent ac lectus sed leo aliquam egestas. Sed ante neque, volutpat ac tempor et, bibendum at ligula. Nunc porta vestibulum sodales.
                </p>
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
