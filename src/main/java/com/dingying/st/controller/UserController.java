package com.dingying.st.controller;

import com.dingying.st.util.ServerResponse;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Scope("prototype")
@RequestMapping("smart/traffic/api/user")
@Controller
public class UserController {
    @RequestMapping(value = "login",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse login(String json){
        System.out.println(json);
        return null;
    }

    @RequestMapping(value = "index",method = RequestMethod.GET)
    public String index(String json){
        System.out.println(json);
        return "index";
    }

}
