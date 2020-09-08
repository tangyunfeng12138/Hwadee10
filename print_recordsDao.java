package com.hwadee.enroll_employ_sys.dao;
import com.hwadee.enroll_employ_sys.entity.Print_Records;
import java.util.List;

public interface print_recordsDao {
    public List<Print_Records> getPrintRecordsList();
    public int deletePrintRecords(String a_id);

}
