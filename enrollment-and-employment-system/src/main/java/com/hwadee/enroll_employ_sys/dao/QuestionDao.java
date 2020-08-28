package com.hwadee.enroll_employ_sys.dao;

import com.hwadee.enroll_employ_sys.entity.Question;

import java.util.List;
import java.util.Map;

public interface QuestionDao {
    public Question FindById(int q_id);
    public List<Question> FindByName(String q_name);
    public List<Question> FindByQBId(int qb_id);
    public void updateQuestion(Question question);
    public void addQuestion(Question question);
    public void deleteQuestion(int q_id);
}
