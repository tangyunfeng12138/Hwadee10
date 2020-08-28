package com.hwadee.enroll_employ_sys.dao;

import com.hwadee.enroll_employ_sys.entity.Dorm;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DormDao {
    public Dorm FindById(@Param("d_id") int d_id, @Param("b_id") String b_id);
    public List<Dorm> FindByBuildingId(String b_id);
    public List<Dorm> Findall();
    public void updateMember(Dorm dorm);
    public void addDorm(Dorm dorm);
}
