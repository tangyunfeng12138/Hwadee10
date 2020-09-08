package com.hwadee.enroll_employ_sys.entity;

public class Candidate {
    private String e_name;
    private String s_name;
    private String subjects;
    private String e_sex;
    private String e_address;
    private String campus;

    public String getE_name() {
        return e_name;
    }

    public String getS_name() {
        return s_name;
    }

    public String getSubjects() {
        return subjects;
    }

    public String getE_sex() {
        return e_sex;
    }

    public String getE_address() {
        return e_address;
    }

    public String getCampus() {
        return campus;
    }

    public void setE_name(String e_name) {
        this.e_name = e_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public void setSubjects(String subjects) {
        this.subjects = subjects;
    }

    public void setE_sex(String e_sex) {
        this.e_sex = e_sex;
    }

    public void setE_address(String e_address) {
        this.e_address = e_address;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }
}
