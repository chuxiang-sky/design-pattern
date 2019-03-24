package com.chuxiang.java.creational.prototype;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by chuxiang_sky on 2019/03/23.
 */
public class WorkExperience implements Cloneable,Serializable {

    private String company;
    private Date startDate;
    private Date endDate;
    private String position;

    public WorkExperience(String company, Date startDate, Date endDate, String position) {
        this.company = company;
        this.startDate = startDate;
        this.endDate = endDate;
        this.position = position;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "{" +
                "company='" + company + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", position='" + position + '\'' +
                '}';
    }

    @Override
    protected WorkExperience clone() throws CloneNotSupportedException {
        return (WorkExperience)super.clone();
    }
}
