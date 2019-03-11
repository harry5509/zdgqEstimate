package com.zdgq.estimate.dao;


import com.zdgq.estimate.entity.Admins;
import com.zdgq.estimate.entity.BaseEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("baseDao")
public interface BaseDao {

    boolean insert(BaseEntity baseEntity);

    List<BaseEntity> findAll();
}
