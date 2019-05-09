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
                <form class="form-inline navbar-search" method="post" action="products">
                    <input id="srchFld" class="srchTxt" type="text"/>
                    <select class="srchTxt">
                        <option>BUTUN</option>
                        <option>GEYIMLER</option>
                        <option>ERZAQ & ICKILER</option>
                        <option>SAGLAMLIQ & GOZELLIK</option>
                        <option>IDMAN & ISTIRAHET</option>
                        <option>KITABLAR & EYLENCELER</option>
                    </select>
                    <a href="products">
                        <button type="submit" id="submitButton" class="btn btn-primary"> Go</button>
                    </a>
                </form>
                <ul id="topMenu" class="nav pull-right">
                    <li class=""><a href="special_offer">Xususi Teklifler</a></li>
                    <li class=""><a href="normal">Catdirilma</a></li>
                    <li class=""><a href="contact">Elaqe</a></li>
                    <li class="">
                        <a href="/login" role="button" data-toggle="modal" style="padding-right:0"><span
                                class="btn btn-large btn-success">Login</span></a>
                        <%--<div id="login" class="modal hide fade in" tabindex="-1" role="dialog" aria-labelledby="login"
                             aria-hidden="false">
                            <div class="modal-header">
                                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                                <h3>Login Block</h3>
                            </div>

                            <div class="modal-body">

                                <form action="login" method="post" class="form-horizontal loginFrm">
                                    <div class="control-group">
                                        <input type="text" name="loginEmail" id="inputEmail" placeholder="Email">
                                    </div>
                                    <div class="control-group">
                                        <input type="password" name="loginPassword" id="inputPassword"
                                               placeholder="Password">
                                    </div>
                                    <div class="control-group">
                                        <label class="checkbox">
                                            <input type="checkbox"> Remember me
                                        </label>
                                    </div>
                                    <a href="register" style="color: blue">Hesabiniz yoxdursa, qeydiyyatdan
                                        kecin!</a><br>
                                    <a href="forgottenPassword" style="color: blue">Shifreni unutmusunuz?</a><br/>
                                    <input type="submit" value="Sign in" class="btn btn-success">
                                    <button class="btn" data-dismiss="modal" aria-hidden="true">Close</button>
                                </form>

                            </div>
                        </div> --%>
                    </li>
                </ul>
            </div>
        </div>
    </div>
</div>