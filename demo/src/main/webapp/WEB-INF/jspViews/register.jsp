<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<div class="span9">
    <ul class="breadcrumb">
        <li><a href="index">Home</a> <span class="divider">/</span></li>
        <li class="active">Registration</li>
    </ul>
    <h3> Registration</h3>
    <div class="well" >

        <%--@elvariable id="user" type="java"--%>
        <form:form id="register-form" action="/register/user-register" method="post" modelAttribute="user">
            <h4>Your personal information</h4>
            <div class="control-group">
                <label class="control-label">First name <sup>*</sup></label>
                <div class="controls">
                    <form:input path="name" cssClass="form-control" placeholder="First Name"/>
                </div>
            </div>
            <div class="control-group">
                <label class="control-label">Last name <sup>*</sup></label>
                <div class="controls">
                    <form:input path="surname" cssClass="form-control" placeholder="Last Name"/>
                </div>
            </div>
            <div class="control-group">
                <label class="control-label">Email <sup>*</sup></label>
                <div class="controls">
                    <form:input path="email" cssClass="form-control" autocomplete="false" placeholder="Email"/>
                </div>
            </div>
            <div class="control-group">
                <label class="control-label">Password <sup>*</sup></label>
                <div class="controls">
                    <form:password path="password" cssClass="form-control" placeholder="Password"/>
                </div>
            </div>
            <div class="control-group">
                <label class="control-label">Phone Number<sup>*</sup></label>
                <div class="controls">
                    <form:input path="phone" cssClass="form-control" placeholder="Phone number"/>
                </div>
            </div>

            <div class="control-group">
                <div class="controls">
                        <%--<input type="hidden" name="email_create" value="1">--%>
                        <%--<input type="hidden" name="is_new_customer" value="1">--%>
                    <input class="btn btn-large btn-success" type="submit" value="register"/>
                </div>
            </div>
        </form:form>
    </div>
</div>