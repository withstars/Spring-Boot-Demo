package com.blog.web;

import com.blog.domain.Admin;
import com.blog.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;

@Controller
public class AdminController {
    @Autowired
    private AdminService adminService;

    @RequestMapping(value = "/api/admin")
    public @ResponseBody Object getAdmin(HttpServletRequest request){
        int id=Integer.parseInt(request.getParameter("id"));
        Admin admin=adminService.getAdminById(id);
        return admin;
    }


}
