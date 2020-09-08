package com.hwadee.enroll_employ_sys.controller;
import java.util.ArrayList;
import java.util.List;

import com.hwadee.enroll_employ_sys.param.ResultVo;
import com.hwadee.enroll_employ_sys.entity.Candidate;
import com.hwadee.enroll_employ_sys.service.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * 考生控制器
 *
 */
@Controller
public class CandidateController {
    @Autowired
    private CandidateService candidateService;

    //取得考生信息
    @RequestMapping("/candidatequerylist")
    @ResponseBody
    public List<Candidate>  courquerylist(Model model) throws Exception{
        List<Candidate> candidateList = new ArrayList<Candidate>();
        candidateList = candidateService.getCandidateList();
        return candidateList;
    }

    @RequestMapping("/updateCandidate")
    @ResponseBody
    public ResultVo updateCandidate(Candidate candidate, Model model) throws Exception{
        candidateService.updateCandidate(candidate);
        ResultVo resultVo =new ResultVo();
        resultVo.setType("ok");
        return resultVo;
    }


    @RequestMapping("/insertCandidate")
    @ResponseBody
    public ResultVo insertBook(Candidate candidate,Model model) throws Exception{
        candidateService.insertCandidate(candidate);
        ResultVo resultVo =new ResultVo();
        resultVo.setType("ok");
        return resultVo;
    }



    @RequestMapping("/deleteAttend")
    @ResponseBody
    public ResultVo deleteBook(String e_id,Model model) throws Exception{

        candidateService.deleteCandidate(e_id);

        ResultVo resultVo =new ResultVo();
        resultVo.setType("ok");
        return resultVo;
    }


}
