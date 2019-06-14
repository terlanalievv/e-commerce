<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<div class="span9">
    <div class="row" style="padding-left: 20px;">
        <c:if test="${userResult == 'Found'}">
            <hr class="soft"/>
            <button type="button" onclick="pendingElan(${elan.id}, 0);" class="btn btn-primary" ${elan.announcementStatus.getCode() == 0?'disabled':''}>Gozlemede</button>
            <hr class="soft"/>
            <div class="span6">
                <table id="product-detail-table">
                    <tr>
                        <td><h4>Userin statusu</h4></td>
                        <td>
                            <c:if test="${user.status.getCode() == 0}">
                                <h4>Gozlemede</h4>
                            </c:if>
                            <c:if test="${user.status.getCode() == 1}">
                                <h4>Qebul edilib</h4>
                            </c:if>

                        </td>
                    </tr>
                    <tr>
                        <td>Mehsulun adi</td>
                        <td>${elan.productName}</td>
                    </tr>
                    <tr>
                        <td>Mehsul haqqinda</td>
                        <td>${elan.productInfo}</td>
                    </tr>
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
                    <tr>
                        <td>Status</td>
                        <td>${elan.status}</td>
                    </tr>
                    <tr>
                        <td>Announcement Status</td>
                        <td>${elan.announcementStatus}</td>
                    </tr>
                    <tr>
                        <td>Added Date</td>
                        <td>${elan.getFormattedDate(elan.addedDate)}</td>
                    </tr>
                    <tr>
                        <td>Expire Date</td>
                        <td>${elan.getFormattedDate(elan.expireDate)}</td>
                    </tr>
                    <tr>
                        <td>Qiymeti</td>
                        <td>${elan.productPrice}&nbsp;${elan.currency.label}</td>
                    </tr>
                    <tr>
                        <td>User</td>
                        <td>${elan.user.name}&nbsp;${elan.user.surname}</td>
                    </tr>
                </table>
                <hr class="soft"/>
            </div>
        </c:if>
        <c:if test="${elanResult == 'NotFound'}">
            <h1 style="color: red;margin-left: 100px;">Melumat tapilmadi!</h1>
        </c:if>
    </div>
</div>
