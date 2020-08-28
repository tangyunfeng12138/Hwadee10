package com.hwadee.enroll_employ_sys.service;

import com.hwadee.enroll_employ_sys.entity.Q_Bank;

import java.util.List;

public interface Q_BankService {
    public Q_Bank FindById(String qb_id);
    public List<Q_Bank> FindByName(String qb_name);
    public List<Q_Bank> FindByType(String qb_type);
    public List<Q_Bank> Findall();
    public String addQBank(Q_Bank q_bank);
}
