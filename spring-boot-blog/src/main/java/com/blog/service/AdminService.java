package com.blog.service;

import com.blog.dao.AdminDao;
import com.blog.domain.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    @Autowired
    private AdminDao adminDao;

    public Admin getAdminById(int id){
        return adminDao.getAdminById(id);
    }
}
