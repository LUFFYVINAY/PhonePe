package com.example.phonepe.model;

public class Offermodel {
    public Offermodel(String offer_details, String offer_on, int image) {
        this.offer_details = offer_details;
        this.offer_on = offer_on;
        this.image = image;
    }

    public String getOffer_details() {
        return offer_details;
    }

    public void setOffer_details(String offer_details) {
        this.offer_details = offer_details;
    }

    public String getOffer_on() {
        return offer_on;
    }

    public void setOffer_on(String offer_on) {
        this.offer_on = offer_on;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    private String offer_details,offer_on;
    private int image;
}
