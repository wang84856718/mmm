package com.ithema.controller;


import com.ithema.Role;
import com.ithema.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    public String save(Role role){
        roleService.save(role);

        return "redirect: ";

    }
}
