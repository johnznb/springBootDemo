package com.example.hwq.controller;


import com.example.hwq.bean.ResultCode;
import com.example.hwq.bean.ResultVo;
import com.example.hwq.bean.Student;
import com.example.hwq.util.AssertUtil;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
   private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @ExceptionHandler(value = Exception.class)
    @RequestMapping("/")
    @ResponseBody
    public String  home(HttpServletRequest httpServletRequest,Exception e){

        int b =1/0;
        return "welcome";
    }
    @RequestMapping("/test")
    @ResponseBody
    public ResultVo  test(){

        List<Object> list = new ArrayList<>();
        list.add("刘");
        list.add("关");
        list.add("张");

        ResultVo resultVo = new ResultVo(ResultCode.SUCCESS, list);
        return  resultVo;
    }

    @RequestMapping("/jj")
    @ResponseBody
    public List getJj(@RequestParam  String px,@RequestParam Integer pf){

        try {
            AssertUtil.isTrue(StringUtils.isAllBlank(px),"参数为空");
        } catch (Exception e) {
            e.printStackTrace();
        }
        List<Object> list = new ArrayList<>();
        list.add(new Student("xiaozhang",3));
        list.add(new Student("xiaoli",4));

        return list;
    }


    @RequestMapping("/home")
    public String hello(){
        System.out.printf("home");
        return "index";
    }

}
