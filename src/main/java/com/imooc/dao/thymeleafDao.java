package com.imooc.dao;

import org.mapstruct.Mapper;

/**
 * @program: itemList
 * @Date: 2018/12/1 17:15
 * @Author: lichanglai
 * @Description:
 */
@Mapper
public interface thymeleafDao {

     int  getById(int userId );
}
