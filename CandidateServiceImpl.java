package com.hwadee.enroll_employ_sys.service.Impl;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hwadee.enroll_employ_sys.dao.CandidateDao;
import com.hwadee.enroll_employ_sys.entity.Candidate;
import com.hwadee.enroll_employ_sys.service.CandidateService;


@Service("candidateService")
public class CandidateServiceImpl implements CandidateService {

    @Autowired
    private CandidateDao candidateDao;
    @Override
    public List<Candidate> getCandidateList() {
        return candidateDao.getCandidateList();
    }

    @Override
    public void insertCandidate(Candidate b) {
        candidateDao.insertCandidate(b);
    }

    @Override
    public void deleteCandidate(String deleteId) {
        candidateDao.deleteCandidate(deleteId);
    }

    @Override
    public void updateCandidate(Candidate b) {
        candidateDao.updateCandidate(b);
    }
}