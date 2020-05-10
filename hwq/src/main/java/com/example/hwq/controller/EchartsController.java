package com.example.hwq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class EchartsController {

    @RequestMapping(value= "/getEcharts",method = RequestMethod.POST)
    @ResponseBody
    public List getEcharts(@RequestBody Map<String,Object> map){


        List<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("王二");
        list.add((String)map.get("name"));
        list.add((String)map.get("year"));
        return list;

    }
}
