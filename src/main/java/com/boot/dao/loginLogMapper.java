package com.boot.dao;

import com.boot.pojo.loginLog;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 游政杰
 * @Date  2021/7/9 1:24
 */
@Mapper
@Repository
public interface loginLogMapper {

    void insertLoginLog(loginLog loginLog);

    List<loginLog> selectLoginLogAll();

    int loginLogCount();



}
