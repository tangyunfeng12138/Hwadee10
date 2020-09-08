package com.hwadee.enroll_employ_sys.service;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import com.hwadee.enroll_employ_sys.entity.Candidate;

public interface CandidateService {
    public List<Candidate> getCandidateList();
    public void insertCandidate(Candidate b);

    public void updateCandidate(Candidate b);

    public void deleteCandidate(String e_id);
}
