package com.hwadee.enroll_employ_sys.service.Impl;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hwadee.enroll_employ_sys.dao.AdmissionDao;
import com.hwadee.enroll_employ_sys.entity.Admission;
import com.hwadee.enroll_employ_sys.service.AdmissionService;

public class AdmissionServiceImpl implements AdmissionService {
    @Autowired
    private AdmissionDao admissionDao;
    @Override
    public List<Admission> getAdmissionList() {
        return admissionDao.getAdmissionList();
    }

}
