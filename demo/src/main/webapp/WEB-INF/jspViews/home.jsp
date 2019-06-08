<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<div class="span9">
    <h4>Son Mehsullar</h4>
    <ul class="thumbnails">
        <c:forEach items="${elanList}" var="elan">
            <li class="span3">
                <div class="thumbnail">
                    <a href="/products/product_details/${elan.id}"><img src="/resources/images/${elan.image}" alt=""/></a>
                    <div class="caption">
                        <h5>${elan.productName}</h5>
                        <h4 style="text-align:center">
                            <a class="btn btn-primary">${elan.productPrice}&nbsp;${elan.currency.label}</a>
                        </h4>
                    </div>
                </div>
            </li>
        </c:forEach>
    </ul>

</div>

