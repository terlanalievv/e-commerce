<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div class="span9">
    <div class="row">
        <c:if test="${elanResult == 'Found'}">
            <div id="gallery" class="span3">
                <a href="/resources/images/${elan.image}" title="${elan.productName}">
                    <img src="/resources/images/${elan.image}" style="width:100%" alt="${elan.productName}"/>
                </a>
                <div id="differentview" class="moreOptopm carousel slide">
                    <div class="carousel-inner">
                        <div class="item active">
                            <c:forEach items="${images}" var="image">
                                <a href="/resources/images/${image.name}">
                                    <img style="width:29%" src="/resources/images/${image.name}" alt=""/>
                                </a>
                            </c:forEach>
                        </div>
                    </div>
                </div>
            </div>
            <div class="span6">
                <h3>${elan.productName}</h3>
                <h6>${elan.getFormattedDate(elan.addedDate)}</h6>
                <hr class="soft"/>
                <label class="control-label"><span>${elan.productPrice}&nbsp;${elan.currency.label}</span></label>
                <hr class="soft"/>
                <table id="product-detail-table">
                    <tr>
                        <td>Kategoriya</td>
                        <td>${elan.category.name}</td>
                    </tr>
                    <tr>
                        <td>Seher</td>
                        <td>${elan.city.name}</td>
                    </tr>
                    <tr>
                        <td>Telefon nomresi</td>
                        <td>${elan.phoneNumber}</td>
                    </tr>
                    <tr>
                        <td>Email</td>
                        <td>${elan.email}</td>
                    </tr>
                </table>
                <hr class="soft"/>
                <h3>Mehsul haqqinda</h3>
                <p style="font-size: 16px">${elan.productInfo}</p>
            </div>
        </c:if>
        <c:if test="${elanResult == 'NotFound'}">
            <h1 style="color: red;margin-left: 100px;">Melumat tapilmadi!</h1>
        </c:if>
    </div>
</div>