package com.example.demo.domain;

public class Elan {
    private String elan_ad;
    private String category;
    private String price;
    private String elaqe_nomresi;
    //private String shekil;

    public Elan(String elan_ad, String category, String price, String elaqe_nomresi) {
        this.elan_ad = elan_ad;
        this.category = category;
        this.price = price;
        this.elaqe_nomresi = elaqe_nomresi;
    }

    public Elan() {
    }

    public String getElan_ad() {
        return elan_ad;
    }

    public void setElan_ad(String elan_ad) {
        this.elan_ad = elan_ad;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getElaqe_nomresi() {
        return elaqe_nomresi;
    }

    public void setElaqe_nomresi(String elaqe_nomresi) {
        this.elaqe_nomresi = elaqe_nomresi;
    }
}
