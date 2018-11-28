package com.face.project.faceid.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: faceid
 * @description: 首页控制器
 * @author: 管庆增
 * @create: 2018-11-28 17:51
 **/
@Controller
public class IndexController {
    @RequestMapping(value = "/")
    public String Home(){
        return "index";
    }
}
