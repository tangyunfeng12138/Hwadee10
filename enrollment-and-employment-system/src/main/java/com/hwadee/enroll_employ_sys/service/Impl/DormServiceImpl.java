package com.hwadee.enroll_employ_sys.service.Impl;

import com.hwadee.enroll_employ_sys.dao.DormDao;
import com.hwadee.enroll_employ_sys.entity.Dorm;
import com.hwadee.enroll_employ_sys.entity.Q_Bank;
import com.hwadee.enroll_employ_sys.service.DormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.regex.Pattern;

@Service
public class DormServiceImpl implements DormService {
    @Autowired
    DormDao dormDao;

    public Dorm FindById(String d_id, String b_id){
        Dorm dorm=null;
        Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$");
        if(pattern.matcher(d_id).matches()){
            int id=Integer.parseInt(d_id);
            dorm=dormDao.FindById(id,b_id);
        }
        return dorm;
    }
    public List<Dorm> FindByBuildingId(String b_id){
        List<Dorm> list =dormDao.FindByBuildingId(b_id);
        return list;
    }
    public List<Dorm> Findall(){
        List<Dorm> list=dormDao.Findall();
        return list;
    }
    public void updateMember(Dorm dorm){
        dormDao.updateMember(dorm);
    }
    public void addDorm(Dorm dorm){
        dormDao.addDorm(dorm);
    }

    public boolean isFull(Dorm dorm){
        if(null!=dorm){
            dormDao.FindById(dorm.getD_id(),dorm.getB_id());
            String member=dorm.getMember();
            dormDao.FindById(dorm.getD_id(),dorm.getB_id());
            String [] arr=member.split("、");
            return dorm.getD_number()==arr.length;
        }else return false;
    }
}
