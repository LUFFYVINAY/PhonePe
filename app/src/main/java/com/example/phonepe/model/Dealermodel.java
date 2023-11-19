package com.example.phonepe.model;

public class Dealermodel {

    public Dealermodel(String deale_rname, String discount_offer, String discount_amount, String discount_way, String discount_details) {
        this.deale_rname = deale_rname;
        this.discount_offer = discount_offer;
        this.discount_amount = discount_amount;
        this.discount_way = discount_way;
        this.discount_details = discount_details;
    }

    public String getDeale_rname() {
        return deale_rname;
    }

    public void setDeale_rname(String deale_rname) {
        this.deale_rname = deale_rname;
    }

    public String getDiscount_offer() {
        return discount_offer;
    }

    public void setDiscount_offer(String discount_offer) {
        this.discount_offer = discount_offer;
    }

    public String getDiscount_amount() {
        return discount_amount;
    }

    public void setDiscount_amount(String discount_amount) {
        this.discount_amount = discount_amount;
    }

    public String getDiscount_way() {
        return discount_way;
    }

    public void setDiscount_way(String discount_way) {
        this.discount_way = discount_way;
    }

    public String getDiscount_details() {
        return discount_details;
    }

    public void setDiscount_details(String discount_details) {
        this.discount_details = discount_details;
    }

    public String deale_rname,
    discount_offer,
    discount_amount,
    discount_way,
    discount_details;
}
