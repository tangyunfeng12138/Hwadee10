package com.hwadee.enroll_employ_sys.dao;
import com.hwadee.enroll_employ_sys.entity.Candidate;

import java.util.List;
public interface CandidateDao {
    public List<Candidate> getCandidateList();
    public void insertCandidate(Candidate b);

    public void deleteCandidate(String e_id);

    public void updateCandidate(Candidate b);
}
