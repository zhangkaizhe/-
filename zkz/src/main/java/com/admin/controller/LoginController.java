package com.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * Created by XAGlf-A on 2019/9/11.
 */
@Controller
public class LoginController {

    @RequestMapping("/login")
    public String one(@RequestParam Map<String, Object> map, ModelMap model){

        return "login";
    }

}
