<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="input" uri="http://www.springframework.org/tags/form" %>


<div class="span9">
    <ul class="breadcrumb">
        <li><a href="index">Home</a> <span class="divider">/</span></li>
        <li class="active"><a href="elan">Yeni elan yerlesdir</a> <span class="divider">/</span></li>
    </ul>
    <h3>Yeni elan yerlesdir</h3>
    <div class="well">
        <%--@elvariable id="elan" type="java"--%>
        <form:form class="form-horizontal" modelAttribute="elan" method="post" action="/elan/save" enctype="multipart/form-data">
            <h4>Elan melumatlari</h4>

            <div class="control-group">
                <div class="controls">
                    <input type="file" name="files" multiple/>

                    <p style="width: 70%; background-color: rgba(0,0,0,0.2); padding: 10px; border-radius: 10px"
                       class="p">Şəkilli elanlar daha effektiv və tez satılır! Yalnız keyfiyyətli şəkillərdən istifadə
                        edin. Çoxlu şəkillər yükləmək üçün Ctrl düyməsini sıxıb saxlayın. Icazə verilən formatlar: jpg,
                        jpeg, png, gif Ctrl daha çox şəkil yükləmək üçün. 1 elan - 1 məhsul/xidmət. Şəkil və təsvir isə
                        nömrəsiz və linksiz yerləşdirin.</p>

                </div>
            </div>

            <div class="control-group">
                <label class="control-label" for="productName">Mehsulun adi :<sup>*</sup></label>
                <div class="controls">
                    <input:input path="productName" id="productName" placeholder="Mehsulun adi"/>
                </div>
            </div>

            <div class="control-group">
                <label class="control-label" >Təsviri : <sup>*</sup></label>
                <div class="controls">
                    <form:textarea path="productInfo" style="width: 80%"
                              placeholder="Nümunə: Dəbə uyğun Samsung Galaxy S9! Rəng - qara almaz. Super parlaq ekran, 12 Mp kamera. 1 il əvvəl alınıb, vəziyyəti - yeni kimi. Yaxşı işləyir."
                              cols="200px" id="productInfo"/>
                </div>
            </div>
            <div class="control-group">
                <label class="control-label">Kateqoriya: <sup>*</sup></label>
                <div class="controls">
                    <form:select path="categoryId" id="productCategory">
                        <form:option value="" label="-"/>
                        <form:options items="${categories}" itemLabel="name" itemValue="id"/>
                    </form:select>
                </div>
            </div>

            <div class="control-group">
                <label class="control-label" for="productPrice">Qiymət : <sup>*</sup></label>
                <div class="controls">
                    <form:input path="productPrice" id="productPrice" placeholder="Qiyməti daxil edin"/>
                    <form:select path="currencyLabel" id="currency">
                        <form:option value="" label="-"/>
                        <form:option value="AZN" label="AZN"/>
                        <form:option value="EUR" label="EUR"/>
                        <form:option value="USD" label="USD"/>
                    </form:select>
                </div>
            </div>

            <div class="control-group">
                <label class="control-label">Yer :<sup>*</sup></label>
                <div class="controls">
                    <form:select path="cityId" id="city">
                        <form:option value="" label="-"/>
                        <form:options items="${cities}" itemLabel="name" itemValue="id"/>
                    </form:select>
                </div>
            </div>

            <div class="control-group">
                <label class="control-label" for="prefix">Telefon nomresi <sup>*</sup></label>
                <div class="controls">
                    <form:select path="prefix" id="prefix" style="width: 20%">
                        <form:option value="" label="-"/>
                        <form:option value="+994(12)" label="+994(12)"/>
                        <form:option value="+994(50)" label="+994(50)"/>
                        <form:option value="+994(51)" label="+994(51)"/>
                        <form:option value="+994(55)" label="+994(55)"/>
                        <form:option value="+994(70)" label="+994(70)"/>
                        <form:option value="+994(77)" label="+994(77)"/>
                    </form:select>
                    <form:input path="phoneNumber" placeholder="Nömrəniz"/>
                </div>
            </div>

            <div class="control-group">
                <label class="control-label" for="email">Epoçt :<sup>*</sup></label>
                <div class="controls">
                    <form:input path="email" id="email" placeholder="Emailiniz.."/>
                </div>
            </div>

            <div class="control-group">
                <div class="controls">
                    <input class="btn btn-large btn-success" type="submit" value="Elanı dərc et!"/>
                </div>
            </div>
        </form:form>
    </div>
</div>

