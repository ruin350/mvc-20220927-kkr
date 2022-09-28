package com.example.mvc20220927kkr.controller;

import com.example.mvc20220927kkr.dto.TestReqDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

    @GetMapping("/test1")
    public String test1(Model model){
        model.addAttribute("name","김준일");
        return "test_page1";
    }
    @GetMapping("/test2")
    public ModelAndView test2(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.getModel().put("test1data", "test");
        modelAndView.getModel().put("test1data2", "test2");
        modelAndView.getModel().put("test1data3", "test3");
        modelAndView.getModel().put("test1data4", "test4");
        modelAndView.getModel().put("test1data5", "test5");
        modelAndView.setViewName("test/test_page2");
        return modelAndView;
    }
    @GetMapping("/test4")
    public String test3(Model model,TestReqDto testReqDto){
        System.out.println(testReqDto);
        System.out.println(testReqDto.getStrData());
        System.out.println(testReqDto.getName());
        System.out.println(testReqDto.getNumber());

        model.addAttribute("data", testReqDto.getStrData());
        model.addAttribute("name", testReqDto.getName());
        model.addAttribute("number", testReqDto.getNumber());

        return "test/test_page4";
    }
}
