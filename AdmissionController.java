package com.hwadee.enroll_employ_sys.controller;

import java.util.ArrayList;
import java.util.List;
import com.hwadee.enroll_employ_sys.Utils.Page;
import com.hwadee.enroll_employ_sys.entity.Admission;
import com.hwadee.enroll_employ_sys.service.AdmissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;

@Controller
public class AdmissionController {
    @Autowired(required=false)
    private AdmissionService admissionService;

    @RequestMapping("/admissionquerylist")
    @ResponseBody
    public List<Admission>  courquerylist(Model model) throws Exception{
        List<Admission> admissionList = new ArrayList<Admission>();
        admissionList = admissionService.getAdmissionList();
        return admissionList;
    }

}
