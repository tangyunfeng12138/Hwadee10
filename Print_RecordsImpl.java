package com.hwadee.enroll_employ_sys.service.Impl;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hwadee.enroll_employ_sys.dao.print_recordsDao;
import com.hwadee.enroll_employ_sys.entity.Print_Records;
import com.hwadee.enroll_employ_sys.service.Print_RecordsService;

@Service
public class Print_RecordsImpl implements Print_RecordsService {
    @Autowired
    private print_recordsDao printDao;

    @Override
    public List<Print_Records> getPrintRecordsList() {
        return printDao.getPrintRecordsList();
    }


}
