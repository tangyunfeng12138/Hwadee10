package com.hwadee.enroll_employ_sys.dao;

import com.hwadee.enroll_employ_sys.entity.Q_Bank;



import java.util.List;
import java.util.Map;

public interface QBankDao {
    public Q_Bank FindById(int qb_id);
    public List<Q_Bank> Findall();
    public List<Q_Bank> FindByName(String qb_name);
    public List<Q_Bank> FindByType(String qb_type);
    public void addQBank(Q_Bank q_bank);
    public void updateQBank(Q_Bank q_bank);
}
