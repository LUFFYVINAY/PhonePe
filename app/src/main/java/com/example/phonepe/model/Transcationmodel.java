package com.example.phonepe.model;

public class Transcationmodel {

    public Transcationmodel(String txn_details, String txn_med, String txn_dealer, String txn_amt, String txn_cd, int img_txn_way) {
        this.img_txn_way = img_txn_way;
        this.txn_details = txn_details;
        this.txn_med = txn_med;
        this.txn_dealer = txn_dealer;
        this.txn_amt = txn_amt;
        this.txn_cd = txn_cd;

    }

    public String getTxn_details() {
        return txn_details;
    }

    public void setTxn_details(String txn_details) {
        this.txn_details = txn_details;
    }

    public String getTxn_med() {
        return txn_med;
    }

    public void setTxn_med(String txn_med) {
        this.txn_med = txn_med;
    }

    public String getTxn_dealer() {
        return txn_dealer;
    }

    public void setTxn_dealer(String txn_dealer) {
        this.txn_dealer = txn_dealer;
    }

    public String getTxn_amt() {
        return txn_amt;
    }

    public void setTxn_amt(String txn_amt) {
        this.txn_amt = txn_amt;
    }

    public String getTxn_cd() {
        return txn_cd;
    }

    public void setTxn_cd(String txn_cd) {
        this.txn_cd = txn_cd;
    }

    public int getImg_txn_way() {
        return img_txn_way;
    }

    public void setImg_txn_way(int img_txn_way) {
        this.img_txn_way = img_txn_way;
    }

    private String txn_details,txn_med,txn_dealer,txn_amt,txn_cd;
    private int img_txn_way;
}
