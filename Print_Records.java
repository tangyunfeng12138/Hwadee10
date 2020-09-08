package com.hwadee.enroll_employ_sys.entity;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Timestamp;
public class Print_Records {
    @JsonFormat(timezone="CMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    Timestamp print_time;
    String a_id;
    String s_name;

    public Timestamp getPrint_time() {
        return print_time;
    }

    public void setPrint_time(Timestamp print_time) {
        this.print_time = print_time;
    }

    public String getA_id() {
        return a_id;
    }

    public void setA_id(String a_id) {
        this.a_id = a_id;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }
}