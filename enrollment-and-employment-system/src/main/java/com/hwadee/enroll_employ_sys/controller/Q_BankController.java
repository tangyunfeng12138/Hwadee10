package com.hwadee.enroll_employ_sys.controller;

import com.hwadee.enroll_employ_sys.entity.Q_Bank;
import com.hwadee.enroll_employ_sys.entity.Question;
import com.hwadee.enroll_employ_sys.service.Q_BankService;
import com.hwadee.enroll_employ_sys.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/qBank")
@SessionAttributes("qb_id")
public class Q_BankController {

    @Autowired
    Q_BankService q_bankService;
    @Autowired
    QuestionService questionService;

    @RequestMapping(value = "/toQBankView")
    public String toQBankView(Model model){
        List<Q_Bank> QBanks=q_bankService.Findall();
        model.addAttribute("QBanks",QBanks);
        return "QBankList";
    }

    @RequestMapping(value = "/toadd")
    public String toadd(){
        return "addQBank";
    }


   @RequestMapping(value = "/addQBank")
    public String addQBank(Q_Bank q_bank){
        q_bank.setQb_number(0);
        q_bankService.addQBank(q_bank);
        return "redirect:toQBankView";
   }

   @RequestMapping(value="/lookQuestion")
    public String lookQuestion(Model model, @RequestParam("qb_id") String qb_id){
        List<Question> questions=questionService.FindByQBId(qb_id);
        model.addAttribute("questions",questions);
        model.addAttribute("qb_id",qb_id);
        return "questionList";
   }

   @RequestMapping(value="/toaddQuestion")
   public String toAddQuestion(){
        return "addquestion";
   }

   @RequestMapping(value="/addquestion")
    public String addQuestion(HttpSession session,Question question){
        Q_Bank q_bank=new Q_Bank();
        q_bank.setQb_id(Integer.parseInt((String)session.getAttribute("qb_id")));
        question.setQ_bank(q_bank);
        questionService.addQuestion(question);
        return "redirect:lookQuestion";
   }

    @RequestMapping(value="/deletequestion")
    public String deleteQuestion(Model model, @RequestParam("q_id") String q_id){
        String msg=questionService.deleteQuestion(q_id);
        model.addAttribute("msg",msg);
        return "redirect:lookQuestion";
    }

    @RequestMapping(value="/toupdateQuestion")
    public String toUpdateQuestion(Model model,@RequestParam("q_id") String q_id){
        Question question=questionService.FindById(q_id);
        model.addAttribute("question",question);
        return "updatequestion";
    }
    @RequestMapping(value="/updatequestion")
    public String updateQuestion(HttpSession session, Question question){
        Q_Bank q_bank=new Q_Bank();
        q_bank.setQb_id(Integer.parseInt((String)session.getAttribute("qb_id")));
        question.setQ_bank(q_bank);
        questionService.updateQuestion(question);
        return "redirect:lookQuestion";
    }

    @RequestMapping(value="/getQuestionInfo")
    @ResponseBody
    public Question getQuestionInfo(@RequestParam("q_id") String q_id){
        Question question=questionService.FindById(q_id);
        return question;
    }


}
