package com.test.controller;

import com.test.model.OneModel;
import com.test.service.OneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

/**
 * Created by XAGlf-A on 2019/9/10.
 */
@Controller
public class OneController {

    @Autowired
    private OneService oneService;


    @RequestMapping("/test/one")
    public String one(@RequestParam Map<String, Object> map, ModelMap model){
        String list=oneService.select();

        model.addAttribute("list",list);
        return "text1";
    }
}
