package com.hwadee.enroll_employ_sys.service.Impl;

import com.hwadee.enroll_employ_sys.dao.QBankDao;
import com.hwadee.enroll_employ_sys.entity.Q_Bank;
import com.hwadee.enroll_employ_sys.service.Q_BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

@Service
public class Q_BankServiceImpl implements Q_BankService {
    @Autowired
    QBankDao q_bankDao;
    public Q_Bank FindById(String qb_id){
        Q_Bank q_bank=null;
        Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$");
        if(pattern.matcher(qb_id).matches()){
            int id=Integer.parseInt(qb_id);
            q_bank=q_bankDao.FindById(id);
        }
        return q_bank;
    }

    public List<Q_Bank> FindByName(String qb_name){
        List<Q_Bank> list = new ArrayList<Q_Bank>();
        list=q_bankDao.FindByName(qb_name);
        return list;
    }
    public List<Q_Bank> FindByType(String qb_type){
        List<Q_Bank> list = new ArrayList<Q_Bank>();
        list=q_bankDao.FindByType(qb_type);
        return list;
    }
    public List<Q_Bank> Findall(){
        List<Q_Bank> list=q_bankDao.Findall();
        return list;
    }
    public String addQBank(Q_Bank q_bank){
        if(0==q_bank.getQb_id()||null==q_bank.getQb_name()||null==q_bank.getQb_type()){
            return "输入内容不能存在空值";
        }
        if(q_bankDao.FindById(q_bank.getQb_id())!=null) return "题库号不可以重复";
        q_bankDao.addQBank(q_bank);
        return "success";
    }
}
