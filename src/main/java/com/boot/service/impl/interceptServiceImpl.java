package com.boot.service.impl;

import com.boot.dao.interceptMapper;
import com.boot.pojo.intercept;
import com.boot.service.interceptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class interceptServiceImpl implements interceptService {

    @Autowired
    private interceptMapper interceptMapper;

    @Override
    public void insertIntercept(intercept intercept) {
        interceptMapper.insertIntercept(intercept);
    }
}
