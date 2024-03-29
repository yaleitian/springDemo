package com.springmvc.controller;
import com.springmvc.entity.User;
import com.springmvc.service.UserService;
import org.apache.commons.collections.map.HashedMap;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Map;

import static org.apache.log4j.Logger.getLogger;

/**
 * 登录演示
 * @author lees
 */
@Controller
@RequestMapping("/user")
public class ViewController {

    private Logger logger = getLogger(ViewController.class);

    @Resource(name = "UserService")
    private UserService userService;

    @RequestMapping("/index")
    public String index(){

        return "index";
    }

    @RequestMapping("/find")
    @ResponseBody
    public Map<String,Object> find(User user){

        Map<String,Object> map = new HashedMap();
        System.out.println("你已通过springMVC进入controller方法。。。。");
        logger.info("你已通过springMVC进入controller方法。。。。");
        User loginuser = userService.findByUsernameAndPwd(user.getUsername(),user.getPassword());
        if(loginuser != null){
            map.put("result","success");
        }else {
            map.put("result","fail");
        }
        return map;
    }

    @RequestMapping("/success")
    public String success(){
        logger.info("登录成功。。。。");
        return "success";
    }

}
