<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div id="mainBody">
    <div class="container">
        <div class="row">
            <div class="span9">
                <ul class="breadcrumb">
                    <li><a href="index">Home</a> <span class="divider">/</span></li>
                    <li class="active">Registration</li>
                </ul>
                <h3> Registration</h3>
                <div class="well">
                    <form class="form-horizontal" >
                        <h4>Your personal information</h4>

                        <div class="control-group">
                            <label class="control-label" for="inputFname1">Şəkil elave edin: <sup>*</sup></label>
                            <div class="controls">
                                <input type="file" id="inputFname1" placeholder="First Name">
                                <input type="file" id="inputFname1" placeholder="First Name">
                                <input type="file" id="inputFname1" placeholder="First Name">
                                <input type="file" id="inputFname1" placeholder="First Name">

                                <p style="width: 70%; background-color: rgba(0,0,0,0.2); padding: 10px; border-radius: 10px" class="p">Şəkilli elanlar daha effektiv və tez satılır! Yalnız keyfiyyətli şəkillərdən istifadə edin. Çoxlu şəkillər yükləmək üçün Ctrl düyməsini sıxıb saxlayın. Icazə verilən formatlar: jpg, jpeg, png, gif Ctrl daha çox şəkil yükləmək üçün. 1 elan - 1 məhsul/xidmət. Şəkil və təsvir isə nömrəsiz və linksiz yerləşdirin.</p>

                            </div>
                        </div>
                        <div class="control-group">
                            <label class="control-label" for="inputLnam">Təsvir: <sup>*</sup></label>
                            <div class="controls">
                                <textarea style="width: 80%" placeholder="Nümunə: Dəbə uyğun Samsung Galaxy S9! Rəng - qara almaz. Super parlaq ekran, 12 Mp kamera. 1 il əvvəl alınıb, vəziyyəti - yeni kimi. Yaxşı işləyir." cols="200px"></textarea>
                            </div>
                        </div>
                        <div class="control-group">
                            <label class="control-label" for="input_email">Kateqoriya: <sup>*</sup></label>
                            <div class="controls">
                                <button type="button" class="btn btn-outline-success" data-toggle="modal" data-target="#exampleModalScrollable">Secin</button>

                                <!-- Modal -->
                                <div class="modal fade" id="exampleModalScrollable" tabindex="-1" role="dialog" aria-labelledby="exampleModalScrollableTitle" aria-hidden="true">
                                    <div class="modal-dialog modal-dialog-scrollable" role="document">
                                        <div class="modal-content">
                                            <div class="modal-header">
                                                <h5 class="modal-title" id="exampleModalScrollableTitle">Modal title</h5>
                                                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                                    <span aria-hidden="true">&times;</span>
                                                </button>
                                            </div>
                                            <div class="modal-body">
                                                <button btn btn-danger>
                                                    Neqliyyat
                                                </button>
                                                <button btn btn-info>
                                                    Neqliyyat
                                                </button>
                                                <button btn btn-info>
                                                    Neqliyyat
                                                </button>
                                                <button btn btn-success>
                                                    Neqliyyat
                                                </button>
                                                <button btn btn-success>
                                                    Neqliyyat
                                                </button>
                                            </div>
                                            <div class="modal-footer">
                                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                                <button type="button" class="btn btn-primary">Save changes</button>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>

                        <div class="control-group">
                            <label class="control-label" for="inputPassword1">Qiymət : <sup>*</sup></label>
                            <div class="controls">
                                <input type="text" id="inputPassword1" placeholder="Qiyməti daxil edin">
                                <select>
                                    <option>AZN</option>
                                    <option>EURO</option>
                                    <option>DOLLAR</option>
                                </select>
                            </div>
                        </div>

                        <div class="control-group">
                            <label class="control-label">Yer :<sup>*</sup></label>
                            <div class="controls">
                                <select  name="yer">
                                    <option value="">-</option>
                                    <option value="1">Baki</option>
                                    <option value="2">Agsu</option>
                                    <option value="3">Agdas</option>

                                </select>

                            </div>
                        </div>


                        <div class="control-group">
                            <label class="control-label" for="inputFname">Telefon :<sup>*</sup></label>
                            <div class="controls">
                                <input type="text" id="inputFname" placeholder="First Name">
                            </div>
                        </div>
                        <div class="control-group">
                            <label class="control-label" for="inputLname">Last name <sup>*</sup></label>
                            <div class="controls">
                                <select style="width: 20%" name="yer">
                                    <option value="">+994</option>
                                    <option value="1">+1</option>
                                    <option value="2">+21</option>
                                    <option value="3">+23</option>

                                </select>
                                <input type="text" placeholder="Nömrəniz" name="">
                            </div>
                        </div>

                        <div class="control-group">
                            <label class="control-label" for="company">Nömrəni Gizlət :</label>
                            <div class="controls">
                                <input type="checkbox" id="company" />
                            </div>
                        </div>

                        <div class="control-group">
                            <label class="control-label" for="address">Epoçt :<sup>*</sup></label>
                            <div class="controls">
                                <input type="text" id="address" placeholder="Emailiniz.."/>
                            </div>
                        </div>



                        <div class="control-group">
                            <div class="controls">
                                <input type="hidden" name="email_create" value="1">
                                <input type="hidden" name="is_new_customer" value="1">
                                <input class="btn btn-large btn-success" type="submit" value="Elanı dərc et!" />
                            </div>
                        </div>
                    </form>
                </div>

            </div>
        </div>
    </div>
</div>
</div>
