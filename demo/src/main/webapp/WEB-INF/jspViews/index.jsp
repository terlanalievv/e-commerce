<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta http-equiv="x-ua-compatible" content="ie=edge">

    <!-- Bootstrap style -->
    <link id="callCss" rel="stylesheet" href="/resources/homestate/front/bootstrap-shop/themes/bootshop/bootstrap.min.css" media="screen" />
    <link href="/resources/homestate/front/bootstrap-shop/themes/css/base.css" rel="stylesheet" media="screen" />
    <!-- Bootstrap style responsive -->
    <link href="/resources/homestate/front/bootstrap-shop/themes/css/bootstrap-responsive.min.css" rel="stylesheet" />
    <link href="/resources/homestate/front/bootstrap-shop/themes/css/font-awesome.css" rel="stylesheet" type="text/css">
    <!-- Google-code-prettify -->
    <link href="/resources/homestate/front/bootstrap-shop/themes/js/google-code-prettify/prettify.css" rel="stylesheet" />
    <!-- fav and touch icons -->
    <link rel="shortcut icon" href="/resources/homestate/front/bootstrap-shop/themes/images/ico/favicon.ico">
    <link rel="apple-touch-icon-precomposed" sizes="144x144"
          href="/resources/homestate/front/bootstrap-shop/themes/images/ico/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114"
          href="/resources/homestate/front/bootstrap-shop/themes/images/ico/apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="/resources/homestate/front/bootstrap-shop/themes/images/ico/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="/resources/homestate/front/bootstrap-shop/themes/images/ico/apple-touch-icon-57-precomposed.png">

    <link href="dfweter.css" rel="stylesheet" type="text/css">
</head>
<body>
    <jsp:include page="header.jsp"/>

    <c:if test="${page == 'home'}">
        <div id="mainBody">
            <div class="container">
                <div class="row">
                    <jsp:include page="sidebar.jsp"/>
                    <jsp:include page="home.jsp"/>
                </div>
            </div>
        </div>
    </c:if>

    <c:if test="${page == 'product'}">
        <div id="mainBody">
            <div class="container">
                <div class="row">
                    <jsp:include page="sidebar.jsp"/>
                    <jsp:include page="products.jsp"/>
                </div>
            </div>
        </div>
    </c:if>

    <c:if test="${page == 'product_details'}">
        <div id="mainBody">
            <div class="container">
                <div class="row">
                    <jsp:include page="sidebar.jsp"/>
                    <jsp:include page="product_details.jsp"/>
                </div>
            </div>
        </div>
    </c:if>

    <c:if test="${page == 'contact'}">
        <div id="mainBody">
            <div class="container">
                <jsp:include page="sidebar.jsp"/>
                <jsp:include page="contact.jsp"/>
            </div>
        </div>
    </c:if>

    <c:if test="${page == 'login'}">
        <div id="mainBody">
            <div class="container">
                <div class="row">
                    <jsp:include page="sidebar.jsp"/>
                    <jsp:include page="login.jsp"/>
                </div>
            </div>
        </div>
    </c:if>

    <c:if test="${page == 'register'}">
        <div id="mainBody">
            <div class="container">
                <div class="row">
                    <jsp:include page="sidebar.jsp"/>
                    <jsp:include page="register.jsp"/>
                </div>
            </div>
        </div>
    </c:if>

    <c:if test="${page == 'forgottenPassword'}">
        <div id="mainBody">
            <div class="container">
                <div class="row">
                    <jsp:include page="sidebar.jsp"/>
                    <jsp:include page="forgottenPassword.jsp"/>
                </div>
            </div>
        </div>
    </c:if>

    <jsp:include page="footer.jsp"/>

    <!-- SCRIPTS -->
    <!-- Placed at the end of the document so the pages load faster ============================================= -->
    <script src="/resources/homestate/front/bootstrap-shop/themes/js/jquery.js" type="text/javascript"></script>
    <script src="/resources/homestate/front/bootstrap-shop/themes/js/bootstrap.min.js" type="text/javascript"></script>
    <script src="/resources/homestate/front/bootstrap-shop/themes/js/google-code-prettify/prettify.js"></script>

    <script src="/resources/homestate/front/bootstrap-shop/themes/js/bootshop.js"></script>
    <script src="/resources/homestate/front/bootstrap-shop/themes/js/jquery.lightbox-0.5.js"></script>
</body>
</html>