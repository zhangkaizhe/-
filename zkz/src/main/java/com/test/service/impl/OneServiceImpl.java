package com.test.service.impl;

import com.test.dao.OneMapper;
import com.test.model.OneModel;
import com.test.service.OneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by XAGlf-A on 2019/9/10.
 */
@Service
public class OneServiceImpl implements OneService {

    @Autowired
    private OneMapper oneMapper;

    @Override
    public String select() {

        List<OneModel> list =new ArrayList<>();
       // String s=oneMapper.selectOracle();
        String s=oneMapper.selectMysql();
        System.out.print("------------"+s);
        return s;
    }
}
