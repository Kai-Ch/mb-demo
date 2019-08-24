package com.mb.demo.service.impl;

import com.mb.demo.mapper.DemoMapper;
import com.mb.demo.service.IDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements IDemoService {

    @Autowired
    private DemoMapper demoMapper;

    @Override
    public String getDemo(int id) {
        return demoMapper.getDemo(id);
    }
}
