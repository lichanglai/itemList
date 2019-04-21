package com.imooc.service.impl;

import com.imooc.dao.PNominateCategoryShowMapper;
import com.imooc.service.getOrderListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lichanglai
 * @date 2019/4/19 17:33
 */
@Service("getOrderListService")
public class getOrderListServiceImpl implements getOrderListService {

    @Autowired
    private PNominateCategoryShowMapper pNominateCategoryShowMapper;


}
