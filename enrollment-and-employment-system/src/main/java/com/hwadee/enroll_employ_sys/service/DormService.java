package com.hwadee.enroll_employ_sys.service;

import com.hwadee.enroll_employ_sys.entity.Dorm;

import java.util.List;

public interface DormService {
    public Dorm FindById(String d_id, String b_id);
    public List<Dorm> FindByBuildingId(String b_id);
    public List<Dorm> Findall();
    public void updateMember(Dorm dorm);
    public void addDorm(Dorm dorm);
    public boolean isFull(Dorm dorm);

}
