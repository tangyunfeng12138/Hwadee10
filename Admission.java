package com.hwadee.enroll_employ_sys.entity;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Timestamp;

public class Admission {
    int a_id;
    String s_name;
    String p_name;
    @JsonFormat(timezone="CMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    Timestamp ad_time;
    String ba_address;
    @JsonFormat(timezone="CMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    Timestamp bd_time;

    public int getA_id() {
        return a_id;
    }

    public void setA_id(int a_id) {
        this.a_id = a_id;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public Timestamp getAd_time() {
        return ad_time;
    }

    public void setAd_time(Timestamp ad_time) {
        this.ad_time = ad_time;
    }

    public String getBa_address() {
        return ba_address;
    }

    public void setBa_address(String ba_address) {
        this.ba_address = ba_address;
    }

    public Timestamp getBd_time() {
        return bd_time;
    }

    public void setBd_time(Timestamp bd_time) {
        this.bd_time = bd_time;
    }
}

