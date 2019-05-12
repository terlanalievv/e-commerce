<style>
    .error {
        color:red;
    }
</style>
<div class="span9">
    <ul class="breadcrumb">
        <li><a href="index">Home</a> <span class="divider">/</span></li>
        <li class="active">Registration</li>
    </ul>
    <h3> Registration</h3>
    <div class="well" >

        <form:form id="register-form" action="/register" method="post" modelAttribute="registrationForm">            <h4>Your personal information</h4>
            <div class="control-group">
                <label class="control-label">First name <sup>*</sup></label>
                <div class="controls">
                    <form:input path="firstName" cssClass="form-control" placeholder="First Name"/>
                    <form:errors path="firstName" cssClass="error"/>
                </div>
            </div>
            <div class="control-group">
                <label class="control-label">Last name <sup>*</sup></label>
                <div class="controls">
                    <form:input path="lastName" cssClass="form-control" placeholder="Last Name"/>
                    <form:errors path="lastName" cssClass="error"/>
                </div>
            </div>
            <div class="control-group">
                <label class="control-label">Email <sup>*</sup></label>
                <div class="controls">
                    <form:input path="email" cssClass="form-control" autocomplete="false" placeholder="Email"/>
                    <form:errors path="email" cssClass="error"/>
                </div>
            </div>
            <div class="control-group">
                <label class="control-label">Password <sup>*</sup></label>
                <div class="controls">
                    <form:password path="password" cssClass="form-control" placeholder="Password"/>
                    <form:errors path="password" cssClass="error"/>>
                </div>
            </div>
            <div class="control-group">
                <label class="control-label">Password Confirmation<sup>*</sup></label>
                <div class="controls">
                    <form:password path="passconfirmation" cssClass="form-control" placeholder="Confirm Password"/>
                    <form:errors path="passconfirmation" cssClass="error"/>
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