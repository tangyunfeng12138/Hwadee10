package com.hwadee.enroll_employ_sys.service;

import com.hwadee.enroll_employ_sys.entity.Question;

import java.util.List;
import java.util.Map;

public interface QuestionService {
    public Question FindById(String q_id);
    public List<Question> FindByName(String q_name);
    public  List<Question> FindByQBId(String qb_id);
    public void updateQuestion(Question question);
    public String addQuestion(Question question);
    public String deleteQuestion(String q_id);
}
