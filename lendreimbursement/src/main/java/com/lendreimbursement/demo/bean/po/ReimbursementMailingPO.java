package com.lendreimbursement.demo.bean.po;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @Author: [caiwenxian]
 * @Date: [2018-04-02 15:04]
 * @Description: [ ]
 * @Version: [1.0.0]
 */
@Entity
@Table(name = "lendreimbursement_reimbursement_mailing")
public class ReimbursementMailingPO extends BasePO {


    /**
     * 是否有发票
     */
    @Column(name = "invoice", nullable = false, columnDefinition = "VARCHAR(255)   COMMENT '是否有发票'")
    private boolean invoice;

    /**
     * 收件人
     */
    @Column(name = "addressee", nullable = false, columnDefinition = "VARCHAR(255)   COMMENT '收件人'")
    private String addressee;

    /**
     * 寄件时间
     */
    @Column(name = "time", nullable = false, columnDefinition = "VARCHAR(255)   COMMENT '寄件时间'")
    private String time;

    /**
     * 地区
     */
    @Column(name = "area", nullable = false, columnDefinition = "VARCHAR(255)   COMMENT '地区'")
    private String area;

    /**
     * 详细地址
     */
    @Column(name = "address", nullable = false, columnDefinition = "VARCHAR(255)   COMMENT '详细地址'")
    private String address;

    /**
     * 寄件备注
     */
    @Column(name = "remarks", nullable = false, columnDefinition = "VARCHAR(255)   COMMENT '寄件备注'")
    private String remarks;

    private String mailing;

    public boolean isInvoice() {
        return invoice;
    }

    public String getMailing() {
        return mailing;
    }

    public void setMailing(String mailing) {
        this.mailing = mailing;
    }

    public boolean getInvoice() {
        return invoice;
    }

    public void setInvoice(boolean invoice) {
        this.invoice = invoice;
    }

    public String getAddressee() {
        return addressee;
    }

    public void setAddressee(String addressee) {
        this.addressee = addressee;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
