package com.hwadee.enroll_employ_sys.controller;

import com.hwadee.enroll_employ_sys.entity.Dorm;
import com.hwadee.enroll_employ_sys.service.DormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping(value="/dorm")
@SessionAttributes({"b_id","d_id"})
public class DormController {

    @Autowired
    private DormService dormService;

    @RequestMapping(value = "/toDormView")
    public String toDormView(Model model){
        List<Dorm> dorms= dormService.Findall();
        model.addAttribute("dorms",dorms);
        return "dormList";
    }

    @RequestMapping("/lookDormInfo")
    public String getDormInfo(Model model, @RequestParam("d_id") String d_id, @RequestParam("b_id") String b_id){
        Dorm dorm=dormService.FindById(d_id, b_id);
        model.addAttribute("dorm",dorm);
        model.addAttribute("b_id",b_id);
        model.addAttribute("d_id",d_id);
        return "dormInfo";
    }

    @RequestMapping(value = "/toaddMember")
    public String toaddMember(){
        return "addMember";
    }

    @RequestMapping("/addMember")
    public String addMember(Model model,HttpSession session, String name){
        name="、"+name;

        String d_id=(String)session.getAttribute("d_id");
        String b_id=(String)session.getAttribute("b_id");
        Dorm dorm=dormService.FindById(d_id,b_id);

        if(!dormService.isFull(dorm)){
            dormService.FindById(d_id,b_id);
            String member=dorm.getMember();
            member=member+name;
            dorm.setMember(member);
            dormService.updateMember(dorm);
            String msg="添加成功";
            model.addAttribute("msg",msg);
            return "redirect:lookDormInfo";
        }else{
            String msg="宿舍已满";
            model.addAttribute("msg",msg);
            return "redirect:addMember";
        }
    }

    @RequestMapping(value = "/toaddDorm")
    public String toaddDorm(){
        return "addDorm";
    }

    @RequestMapping("/addDorm")
    public String addDorm(Dorm dorm){
        dorm.setMember(null);
        dormService.addDorm(dorm);
        return "redirect:toDormView";
    }


}
