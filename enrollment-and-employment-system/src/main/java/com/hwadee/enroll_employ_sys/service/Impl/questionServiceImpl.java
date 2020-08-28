package com.hwadee.enroll_employ_sys.service.Impl;

import com.hwadee.enroll_employ_sys.dao.QBankDao;
import com.hwadee.enroll_employ_sys.dao.QuestionDao;
import com.hwadee.enroll_employ_sys.entity.Q_Bank;
import com.hwadee.enroll_employ_sys.entity.Question;
import com.hwadee.enroll_employ_sys.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
@Service
public class questionServiceImpl implements QuestionService {
    @Autowired
    private QuestionDao questionDao;
    @Autowired
    private QBankDao qBankDao;
    public Question FindById(String q_id){
        Question question=null;
        Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$");
        if(pattern.matcher(q_id).matches()) {
            int id = Integer.parseInt(q_id);
            question = questionDao.FindById(id);
        }
        return question;
    }
    public List<Question> FindByName(String q_name){
        List<Question> list= new ArrayList<>();
        list=questionDao.FindByName(q_name);
        return list;
    }

    public List<Question> FindByQBId(String qb_id){
        List<Question> list=new ArrayList<>();
        Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$");
        if(pattern.matcher(qb_id).matches()) {
            int id = Integer.parseInt(qb_id);
            list = questionDao.FindByQBId(id);
        }
        return list;
    }
    public void updateQuestion(Question question){
        questionDao.updateQuestion(question);
    }

    public String addQuestion(Question question){
        if(null==questionDao.FindById(question.getQ_id())) {
            questionDao.addQuestion(question);
            Q_Bank q_bank=qBankDao.FindById(question.getQ_bank().getQb_id());
            int number=q_bank.getQb_number()+1;
            q_bank.setQb_number(number);
            qBankDao.updateQBank(q_bank);
            return "添加成功";
        }else{
            return "题目编号不可重复";
        }
    }
    public String deleteQuestion(String q_id){
        Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$");
        if(pattern.matcher(q_id).matches()) {
            int id=Integer.parseInt(q_id);
            Question question=questionDao.FindById(id);
            String msg="";
            if(null==question){
                msg="所要删除的试题不存在";
            }else{
                questionDao.deleteQuestion(id);
                msg="删除成功";
            }
            Q_Bank q_bank=qBankDao.FindById(question.getQ_bank().getQb_id());
            int number=q_bank.getQb_number()-1;
            q_bank.setQb_number(number);
            qBankDao.updateQBank(q_bank);
            return msg;
        }else return "输入不符合规范";
    }
}
