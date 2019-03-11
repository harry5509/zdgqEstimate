package com.zdgq.estimate.service.impl;

import com.zdgq.estimate.dao.AdminDao;
import com.zdgq.estimate.entity.Admins;
import com.zdgq.estimate.service.AdminsService;
import jdk.nashorn.internal.runtime.options.Option;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("adminsService")
public class AdminServiceImpl implements AdminsService {

    @Autowired
    private AdminDao adminDao;

    public boolean addAdmin(Admins admins) {
        adminDao.insert(admins);
        if(admins!=null){
            return true;
        }
        return false;
    }

    public List<Admins> findAll() {

        return adminDao.findAll();
    }

    public List<Admins> findByParams(Admins admins) {
        return adminDao.findByParams(admins);
    }

    public Admins findById(String id) {
        return adminDao.findOneById(id);
    }
}
