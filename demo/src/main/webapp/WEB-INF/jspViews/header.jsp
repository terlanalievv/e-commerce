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
                <!-- <a class="brand" href="index"><img src="themes/images/logo.png" alt="Bootsshop"/></a> -->
                <form class="form-inline navbar-search" method="get" action="search">
                    <input name="name" value="${param.name}" type="text"/>
                    <%--<select class="srchTxt">
                        <option>BUTUN</option>
                        <option>GEYIMLER</option>
                        <option>ERZAQ & ICKILER</option>
                        <option>SAGLAMLIQ & GOZELLIK</option>
                        <option>IDMAN & ISTIRAHET</option>
                        <option>KITABLAR & EYLENCELER</option>
                    </select>--%>
                    <a href="products">
                        <button type="submit" id="submitButton" class="btn btn-primary"> Go</button>
                    </a>
                </form>
                <ul id="topMenu" class="nav pull-right">
                    <li style="padding-right: 250px;">
                        <a href="/" role="button" data-toggle="modal" style="padding-right:0">
                            <span class="btn btn-large btn-light">Esas sehife</span>
                        </a>
                    </li>
                    <c:if test="${sessionScope.user != null}">
                        <li>
                            <a href="/myproducts/${sessionScope.user.userId}" role="button" data-toggle="modal" style="padding-right:0">
                                <span class="btn btn-large btn-info">Menim elanlarim</span>
                            </a>
                        </li>
                    </c:if>
                    <li>
                        <a href="/elan" role="button" data-toggle="modal" style="padding-right:0">
                            <span class="btn btn-large btn-success">Elan Yerlesdir</span>
                        </a>
                    </li>
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