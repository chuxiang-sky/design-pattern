package com.chuxiang.java.creational.prototype;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by chuxiang_sky on 2019/03/23.
 */
public class Education implements Cloneable,Serializable {

    private String university;
    private Date startDate;
    private Date endDate;
    private String major;

    public Education(String university, Date startDate, Date endDate, String major) {
        this.university = university;
        this.startDate = startDate;
        this.endDate = endDate;
        this.major = major;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
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

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "{" +
                "university='" + university + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", major='" + major + '\'' +
                '}';
    }

    @Override
    protected Education clone() throws CloneNotSupportedException {
        return (Education)super.clone();
    }
}
