package com.zdgq.estimate.service;

import com.zdgq.estimate.entity.Admins;

import java.util.List;

public interface AdminsService {

    boolean addAdmin(Admins admins);

    List<Admins> findAll();

    List<Admins> findByParams(Admins admins);

    Admins findById(String id);
}
