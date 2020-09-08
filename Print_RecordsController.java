package com.hwadee.enroll_employ_sys.controller;
import java.util.ArrayList;
import java.util.List;


import com.hwadee.enroll_employ_sys.param.ResultVo;
import com.hwadee.enroll_employ_sys.entity.Print_Records;
import com.hwadee.enroll_employ_sys.service.Print_RecordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 * 打印记录控制器
 *
 */
@Controller
@RequestMapping("/printRecords")
public class Print_RecordsController {
        @Autowired(required=false)
        private Print_RecordsService PrintRecordsService;

        @RequestMapping("/printquerylist")
        @ResponseBody
        public List<Print_Records>  courquerylist(Model model) throws Exception{
            List<Print_Records> print_recordslist = new ArrayList<Print_Records>();
            print_recordslist = PrintRecordsService.getPrintRecordsList();
            return print_recordslist;
        }


}
