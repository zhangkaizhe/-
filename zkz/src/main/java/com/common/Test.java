package com.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by XAGlf-A on 2019/9/3.
 */
@Controller
public class Test {
    Logger log= LoggerFactory.getLogger(Test.class);
    @RequestMapping("/test")
    public String one(){
        log.info("ceshia ");
        return "text1";

    }


    public static void main(String[] args) {




    }
}
