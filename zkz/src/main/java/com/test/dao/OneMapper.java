package com.test.dao;

import com.test.model.OneModel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by XAGlf-A on 2019/9/10.
 */
@Mapper
public interface OneMapper {
    String selectOracle();

    String selectMysql();
}
