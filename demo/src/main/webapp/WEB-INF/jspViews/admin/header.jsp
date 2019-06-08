<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div id="header">
    <div class="container">
        <!-- Navbar ================================================== -->
        <div id="logoArea" class="navbar">
            <a id="smallScreen" data-target="#topMenu" data-toggle="collapse" class="btn btn-navbar">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </a>
            <div class="navbar-inner">
                <ul id="topMenu" class="nav pull-right">
                    <%--<li class=""><a href="/">Esas sehife</a></li>
                    <li class=""><a href="special_offer">Xususi Teklifler</a></li>
                    <li class=""><a href="normal">Catdirilma</a></li>
                    <li class=""><a href="contact">Elaqe</a></li>
                    <li class="">
                        <a href="/elan" role="button" data-toggle="modal" style="padding-right:0">
                            <span class="btn btn-large btn-success">Elan Yerlesdir</span>
                        </a>
                    </li>--%>
                    <c:if test="${sessionScope.user == null}">
                        <li class="">
                            <a href="/login" role="button" data-toggle="modal" style="padding-right:0">
                                <span class="btn btn-large btn-primary">Login</span>
                            </a>
                        </li>
                    </c:if>
                    <c:if test="${sessionScope.user != null}">
                        <li>
                            <a href="/logout" role="button" data-toggle="modal" style="padding-right:0">
                                <span class="btn btn-large btn-primary">Logout</span>
                            </a>
                        </li>
                    </c:if>
                </ul>
            </div>
        </div>
    </div>
</div>