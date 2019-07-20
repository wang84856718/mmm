package com.ithema.controller;


import com.ithema.User;
import com.ithema.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    //查询用户
    @RequestMapping("/findAll.do")
    public ModelAndView findAll() {
        ModelAndView mv = new ModelAndView();
        List<User> users = userService.findAll();
        mv.addObject("", users);
        mv.setViewName("");
        return mv;
    }

    //添加用户
    @RequestMapping("/save.do")
    public String save(User user) {
        userService.save(user);
        return "redirect:";
    }

    //根据roleid  删除用户
    @RequestMapping("/delete.do")
    public String deleteUser(String userId) {

        userService.deleteUser(userId);

        return "redirect:";
    }
}
