package com.example.demo.domain;

import com.example.demo.enums.AnnouncementStatus;
import com.example.demo.enums.Currency;
import com.example.demo.enums.Status;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Elan {

    private int id;
    private List<MultipartFile> files;
    private String productName;
    private String productInfo;
    private Category category;
    private String productPrice;
    private Currency currency;
    private City city;
    private String prefix;
    private String phoneNumber;
    private String email;
    private Status status;
    private AnnouncementStatus announcementStatus;
    private LocalDateTime expireDate;
    private LocalDateTime addedDate;
    private User user;

    private String categoryId;
    private String cityId;
    private String currencyLabel;
    private String image;

    public Elan() {
    }

    public Elan(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<MultipartFile> getFiles() {
        return files;
    }

    public void setFiles(List<MultipartFile> files) {
        this.files = files;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductInfo() {
        return productInfo;
    }

    public void setProductInfo(String productInfo) {
        this.productInfo = productInfo;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public AnnouncementStatus getAnnouncementStatus() {
        return announcementStatus;
    }

    public void setAnnouncementStatus(AnnouncementStatus announcementStatus) {
        this.announcementStatus = announcementStatus;
    }

    public LocalDateTime getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(LocalDateTime expireDate) {
        this.expireDate = expireDate;
    }

    public LocalDateTime getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(LocalDateTime addedDate) {
        this.addedDate = addedDate;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getCurrencyLabel() {
        return currencyLabel;
    }

    public void setCurrencyLabel(String currencyLabel) {
        this.currencyLabel = currencyLabel;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getFormattedDate(LocalDateTime localDateTime){
        if(localDateTime != null) {
            return localDateTime.format(DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss"));
        } else {
            return "00.00.0000 00:00:00";
        }
    }

    public boolean compareExpireDate(LocalDateTime localDateTime){
        LocalDateTime now = LocalDateTime.now();
        if(now.isAfter(localDateTime)){
            return true;
        } else {
            return false;
        }
    }
}
