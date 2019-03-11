package com.zdgq.estimate.service;

import com.zdgq.estimate.entity.BaseEntity;

import java.util.List;

public interface BaseService {

    boolean addBase(BaseEntity baseEntity);

    List<BaseEntity> findAll();
}
