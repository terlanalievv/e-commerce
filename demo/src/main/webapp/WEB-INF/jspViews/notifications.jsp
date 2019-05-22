<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div class="span9">
    <hr class="soft"/>
    <div class="row">
        <div class="span1"> &nbsp;</div>
        <div class="span4">
            <c:if test="${checkEmailResult == 'emailExist'}">
                <h1 style="color: green;">Email adresinize melumat gonderildi</h1>
            </c:if>
            <c:if test="${checkEmailResult == 'emailNotExist'}">
                <h1 style="color: red;">Bu email adresi tapilmadi</h1>
            </c:if>
            <c:if test="${passwordResetResult == 'Success'}">
                <h1 style="color: green;">Sifreniz yenilendi</h1>
            </c:if>
            <c:if test="${passwordResetResult == 'Error'}">
                <h1 style="color: red;">Sifreniz yenilenmedi</h1>
            </c:if>
            <c:if test="${tokenDateExpired == 'Error'}">
                <h1 style="color: red;">Sehv emeliyyat</h1>
            </c:if>
            <c:if test="${elanSaveResult == 'Success'}">
                <h1 style="color: green;">Melumat ugurla elave edildi</h1>
            </c:if>
            <c:if test="${elanSaveResult == 'Error'}">
                <h1 style="color: red;">Melumat elave edilmedi</h1>
            </c:if>
        </div>
    </div>
</div>
