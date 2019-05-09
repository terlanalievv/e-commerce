<div class="span9">
    <ul class="breadcrumb">
        <li><a href="index">Home</a> <span class="divider">/</span></li>
        <li class="active">Registration</li>
    </ul>
    <h3> Registration</h3>
    <div class="well" >

        <form class="form-horizontal" method="post" action="/register">
            <h4>Your personal information</h4>
            <div class="control-group">
                <label class="control-label" for="name">First name <sup>*</sup></label>
                <div class="controls">
                    <input type="text" id="name" name="name" placeholder="First Name">
                </div>
            </div>
            <div class="control-group">
                <label class="control-label" for="surname">Last name <sup>*</sup></label>
                <div class="controls">
                    <input type="text" id="surname" name="surname" placeholder="Last Name">
                </div>
            </div>
            <div class="control-group">
                <label class="control-label" for="email">Email <sup>*</sup></label>
                <div class="controls">
                    <input type="text" id="email" name="email" placeholder="Email">
                </div>
            </div>
            <div class="control-group">
                <label class="control-label" for="password">Password <sup>*</sup></label>
                <div class="controls">
                    <input type="password" id="password" name="password" placeholder="Password">
                </div>
            </div>
            <div class="control-group">
                <label class="control-label" for="passconfirmation">Password Confirmation<sup>*</sup></label>
                <div class="controls">
                    <input type="password" id="passconfirmation" name="passconfirmation" placeholder="Password">
                </div>
            </div>

            <div class="control-group">
                <div class="controls">
                    <%--<input type="hidden" name="email_create" value="1">--%>
                    <%--<input type="hidden" name="is_new_customer" value="1">--%>
                    <input class="btn btn-large btn-success" type="submit" value="register"/>
                </div>
            </div>
        </form>
    </div>
</div>