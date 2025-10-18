package edu.easternflorida.wardb;

public class Part {

    private int P_PARTKEY;
    private String P_NAME;
    private String P_MFGR;
    private String P_BRAND;
    private String P_TYPE;
    private int P_SIZE;
    private String P_CONTAINER;
    private double P_RETAILPRICE;
    private String P_COMMENT;








    public Part(int P_PARTKEY, String P_NAME, String P_MFGR, String P_BRAND, String P_TYPE, int P_SIZE, String P_CONTAINER, double P_RETAILPRICE, String P_COMMENT) {


        this.P_PARTKEY = P_PARTKEY;
        this.P_NAME = P_NAME;
        this.P_MFGR=P_MFGR;
        this.P_BRAND = P_BRAND;
        this.P_TYPE= P_TYPE;
        this.P_SIZE=P_SIZE;
        this.P_CONTAINER=P_CONTAINER;
        this.P_RETAILPRICE = P_RETAILPRICE;
        this.P_COMMENT=P_COMMENT;

    }
//getters

    public int getP_PARTKEY() {
        return P_PARTKEY;
    }

    public String getP_NAME() {
        return P_NAME;
    }

    public String getP_MFGR(){return P_MFGR;}

    public String getP_BRAND() {
        return P_BRAND;
    }

    public String getP_TYPE() {
        return P_TYPE;
    }

    public int getP_SIZE() {
        return P_SIZE;
    }

    public String getP_CONTAINER() {
        return P_CONTAINER;
    }

    public double getP_RETAILPRICE() {
        return P_RETAILPRICE;
    }

    public String getP_COMMENT() {
        return P_COMMENT;
    }




    public void setP_PARTKEY(int P_PARTKEY) {this.P_PARTKEY = P_PARTKEY;}

    public void setP_NAME(String P_NAME) {
        this.P_NAME = P_NAME;
    }

    public void setP_MFGR(String  P_MFGR) {this.P_MFGR = P_MFGR;}

    public void setP_BRAND(String  P_BRAND) {this.P_BRAND = P_BRAND;}

    public void setP_TYPE(String  P_TYPE) {this.P_TYPE = P_TYPE;}

    public void setP_SIZE(int  P_SIZE) {this.P_SIZE = P_SIZE;}

    public void setP_CONTAINER(String  P_CONTAINER) {this.P_CONTAINER = P_CONTAINER;}

    public void setP_RETAILPRICE(double P_RETAILPRICE) {
        this.P_RETAILPRICE = P_RETAILPRICE;
    }

    public void setP_COMMENT(String  P_COMMENT) {this.P_COMMENT = P_COMMENT;}







}


