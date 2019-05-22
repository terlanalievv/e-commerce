<div class="span9">
    <h3> Yeni sifrenin teyini</h3>
    <div class="well">
        <form class="form-horizontal" method="post" action="reset-password" >
            <h4>Yeni sifreninzi daxil edin</h4>
            <div class="control-group">
                <label class="control-label" for="passwordReset">Yeni sifrenizi qeyd edin <sup>*</sup></label>
                <div class="controls">
                    <input type="hidden" name="token" value="${token}">
                    <input type="password" id="passwordReset" name="password" placeholder="Yeni sifre">
                </div>
            </div>

            <div class="control-group">
                <div class="controls">
                    <input class="btn btn-large btn-success" type="submit" value="Gonder" />
                </div>
            </div>
        </form>
    </div>
</div>