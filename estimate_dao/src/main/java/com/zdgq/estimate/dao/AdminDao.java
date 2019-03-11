package com.zdgq.estimate.dao;


import com.zdgq.estimate.entity.Admins;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("adminDao")
public interface AdminDao {

    void insert(Admins admins);

    List<Admins> findAll();

    List<Admins> findByParams(Admins admins);

    Admins findOneById(String id);
}
