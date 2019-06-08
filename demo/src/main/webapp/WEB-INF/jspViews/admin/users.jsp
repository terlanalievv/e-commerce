<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div class="span9">
    <table id="userTable" class="table table-striped table-bordered" style="width:100%">
        <thead>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>EMAIL</th>
            <th>PHONE</th>
            <th>STATUS</th>
            <th>Registration Date</th>

        </tr>
        </thead>
        <tbody>
        <c:forEach items="${users}" var="user">
            <tr onclick="showUserDetail(${user.userId})" class="example-tr">
                <td>${user.userId}</td>
                <td>${user.name} ${user.surname}</td>
                <td>${user.email}</td>
                <td>${user.phone}</td>
                <td>${user.status}</td>
                <td>${user.getFormattedDate(user.registrationDate)}</td>
            </tr>
        </c:forEach>
        </tbody>
        <tfoot>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>EMAIL</th>
            <th>PHONE</th>
            <th>STATUS</th>
            <th>Registration Date</th>
        </tr>
        </tfoot>
    </table>
</div>
