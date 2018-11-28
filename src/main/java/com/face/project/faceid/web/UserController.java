package com.face.project.faceid.web;

import com.face.project.faceid.service.UserService;
import com.face.project.faceid.util.ResponceMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @program: faceid
 * @description: 登陆控制器
 * @author: 管庆增
 * @create: 2018-11-28 17:51
 **/
@Controller
@RequestMapping(value = "user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "login",method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> login(@RequestParam(required = true)Long username, @RequestParam(required = true)String password){
        if (username==null){
            return ResponceMap.responceError("账号不能为空");
        }
        if (password==null||"".equals(password.trim())){
            return  ResponceMap.responceError("密码不能为空");
        }
        return ResponceMap.responceSuccess(userService.loginCheck(username, password));
    }
}
