package com.hino.dev.dashboardupdater;

public class ManufacturingOrder {

    public String chasis_no;
    public String chasis_model;
    public String status;
    public String section;
    public String remarks;
    public String mo;
    public String mo_date;
    public String dealer;
    public String customer;
    public Integer quantity;

    public ManufacturingOrder(String chasis_no, String status) {
        this.chasis_no = chasis_no;
        this.status = status;
    }

    public ManufacturingOrder(String chasis_no, String chasis_model, String status, String section, String remarks, String mo, String mo_date, String dealer, String customer, Integer quantity) {
        this.chasis_no = chasis_no;
        this.chasis_model = chasis_model;
        this.status = status;
        this.section = section;
        this.remarks = remarks;
        this.mo = mo;
        this.mo_date = mo_date;
        this.dealer = dealer;
        this.customer = customer;
        this.quantity = quantity;
    }
}
