<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" href="style.css">
    <link href="https://fonts.googleapis.com/css?family=Gugi" rel="stylesheet">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css"
          integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf" crossorigin="anonymous">
    <link href="https://fonts.googleapis.com/css?family=PT+Sans" rel="stylesheet">

    <title>Registration</title>
</head>
<body>


<div class="container">
    <div class="row">
        <br>
        <div class="col-md-12">
            <br>

            <center>
                <a href="index.html"><i class="fas fa-arrow-left"></i></a>
                <h1>Qeydiyyat</h1>
            </center>
        </div>
    </div>
    <br><br>
    <div class="row">
        <div align="center" class="col-md-4">
            <label>
                <br>
                <br>

                <h5>Şəkil elave edin:</h5></label>
        </div>
        <div class="col-md-8">


            <div class="row">
                <div class="col-md-3">

                    <form>
                        <div class="preview img-wrapper"></div>
                        <div class="file-upload-wrapper">
                            <input type="file" name="file" class="file-upload-native" accept="image/*"/>
                            <input type="text" disabled placeholder="upload image" class="file-upload-text"/>
                        </div>
                    </form>
                </div>
                <div class="col-md-3">

                    <form>
                        <div class="preview img-wrapper"></div>
                        <div class="file-upload-wrapper">
                            <input type="file" name="file" class="file-upload-native" accept="image/*"/>
                            <input type="text" disabled placeholder="upload image" class="file-upload-text"/>
                        </div>
                    </form>
                </div>
                <div class="col-md-3">

                    <form>
                        <div class="preview img-wrapper"></div>
                        <div class="file-upload-wrapper">
                            <input type="file" name="file" class="file-upload-native" accept="image/*"/>
                            <input type="text" disabled placeholder="upload image" class="file-upload-text"/>
                        </div>
                    </form>
                </div>
                <div class="col-md-3">

                    <form>
                        <div class="preview img-wrapper"></div>
                        <div class="file-upload-wrapper">
                            <input type="file" name="file" class="file-upload-native" accept="image/*"/>
                            <input type="text" disabled placeholder="upload image" class="file-upload-text"/>
                        </div>
                    </form>
                </div>
            </div>
            <br>
            <div class="row">
                <p class=" text-center bg-light text-muted">
                    Şəkilli elanlar daha effektiv və tez satılır! Yalnız keyfiyyətli şəkillərdən istifadə edin. Çoxlu
                    şəkillər yükləmək üçün Ctrl düyməsini sıxıb saxlayın. Icazə verilən formatlar: jpg, jpeg, png, gif
                    Ctrl daha çox şəkil yükləmək üçün.

                    1 elan - 1 məhsul/xidmət. Şəkil və təsvir isə nömrəsiz və linksiz yerləşdirin.
                </p>
            </div>

        </div>

    </div>
    <br>
    <div class="row">
        <div class="col-md-4">
            <center><h5>Təsvir : </h5></center>
        </div>
        <div class="col-md-8">
            <textarea class="form-control"
                      placeholder="Nümunə: Dəbə uyğun Samsung Galaxy S9! Rəng - qara almaz. Super parlaq ekran, 12 Mp kamera. 1 il əvvəl alınıb, vəziyyəti - yeni kimi. Yaxşı işləyir."
                      cols="100%"></textarea>
        </div>
    </div>
    <br>
    <div class="row">
        <div class="col-md-4">
            <center><h5>Kateqoriya : </h5></center>
        </div>
        <div class="col-md-8">
            <button type="button" class="btn btn-outline-success" data-toggle="modal"
                    data-target="#exampleModalScrollable">Secin
            </button>
        </div>
    </div>

    <br>
    <div class="row">
        <div class="col-md-4">
            <center><h5>Qiymet:</h5></center>
        </div>
        <div class="col-md-7">
            <input type="number" class="form-control" placeholder="qiymet daxil edin" name="">
        </div>
        <div class="col-md-1">
            <select class="form-control">
                <option>AZN</option>
                <option>EURO</option>
                <option>DOLLAR</option>
            </select>

        </div>
    </div>


    <br>
    <div class="row">
        <div class="col-md-4">
            <center><h5>Yer : </h5></center>
        </div>
        <div class="col-md-8">
            <select class="form-control">
                <option>Baki</option>
                <option>Agsu</option>
                <option>Agdas</option>
                <option>yevlax</option>
                <option>Ucar</option>
                <option>Agdas</option>
                <option>Agdas</option>
            </select>
        </div>
    </div>


    <br>
    <div class="row">
        <div class="col-md-4">
            <center><h5>Telefon : </h5></center>
        </div>
        <div class="col-md-2">
            <select class="form-control">
                <option>+994</option>
                <option>+1</option>
                <option>+1223</option>
                <option>+2131</option>
                <option>+231</option>
            </select>
        </div>
        <div class="col-md-6">
            <input type="text" placeholder="nomrenizi daxil edin" class="form-control" name="">
        </div>
    </div>

    <br>
    <div class="row">
        <div class="col-md-4">
            <center><h5>Nomrəni Gizlət :</h5></center>
        </div>
        <div class="col-md-1">
            <input type="checkbox" class="form-control" name="nomrenigizlet">
        </div>

    </div>


    <br>
    <div class="row">
        <div class="col-md-4">
            <center><h5>Epoçt :</h5></center>
        </div>

        <div class="col-md-8">
            <input type="text" placeholder="E poçtunuzu daxil edin" class="form-control" name="">
        </div>
    </div>

</div>


<!-- Modal -->
<div class="modal fade" id="exampleModalScrollable" tabindex="-1" role="dialog"
     aria-labelledby="exampleModalScrollableTitle" aria-hidden="true">
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
<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
        integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
        crossorigin="anonymous"></script>
<script type="text/javascript">
    $(function () {
        function maskImgs() {
            //$('.img-wrapper img').imagesLoaded({}, function() {
            $.each($('.img-wrapper img'), function (index, img) {
                var src = $(img).attr('src');
                var parent = $(img).parent();
                parent
                    .css('background', 'url(' + src + ') no-repeat center center')
                    .css('background-size', 'cover');
                $(img).remove();
            });
            //});
        }

        var preview = {
            init: function () {
                preview.setPreviewImg();
                preview.listenInput();
            },
            setPreviewImg: function (fileInput) {
                var path = $(fileInput).val();
                var uploadText = $(fileInput).siblings('.file-upload-text');

                if (!path) {
                    $(uploadText).val('');
                } else {
                    path = path.replace(/^C:\\fakepath\\/, "");
                    $(uploadText).val(path);

                    preview.showPreview(fileInput, path, uploadText);
                }
            },
            showPreview: function (fileInput, path, uploadText) {
                var file = $(fileInput)[0].files;

                if (file && file[0]) {
                    var reader = new FileReader();

                    reader.onload = function (e) {
                        var previewImg = $(fileInput).parents('.file-upload-wrapper').siblings('.preview');
                        var img = $(previewImg).find('img');

                        if (img.length == 0) {
                            $(previewImg).html('<img src="' + e.target.result + '" alt=""/>');
                        } else {
                            img.attr('src', e.target.result);
                        }

                        uploadText.val(path);
                        maskImgs();
                    }

                    reader.onloadstart = function () {
                        $(uploadText).val('uploading..');
                    }

                    reader.readAsDataURL(file[0]);
                }
            },
            listenInput: function () {
                $('.file-upload-native').on('change', function () {
                    preview.setPreviewImg(this);
                });
            }
        };
        preview.init();
    });
</script>
</body>
</html>
