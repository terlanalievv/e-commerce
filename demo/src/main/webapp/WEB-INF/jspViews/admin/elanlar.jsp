<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<div class="span9">
    <table id="elanTable" class="table table-striped table-bordered" style="width:100%">
        <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Status</th>
                <th>Announcement Status</th>
                <th>Added date</th>
                <th>Expire date</th>
                <th>User</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${elans}" var="elan">
                <tr onclick="showProductDetail(${elan.id})" class="example-tr" >
                    <td>${elan.id}</td>
                    <td>${elan.productName}</td>
                    <td>${elan.status}</td>
                    <td>${elan.announcementStatus}</td>
                    <td>${elan.getFormattedDate(elan.addedDate)}</td>
                    <td style="background-color: ${elan.compareExpireDate(elan.expireDate)?'red':''}" >${elan.getFormattedDate(elan.expireDate)}</td>
                    <td>${elan.user.name} ${elan.user.surname}</td>
                </tr>
            </c:forEach>
        </tbody>
        <tfoot>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Status</th>
                <th>Announcement Status</th>
                <th>Added date</th>
                <th>Expire date</th>
                <th>User</th>
            </tr>
        </tfoot>
    </table>
</div>
