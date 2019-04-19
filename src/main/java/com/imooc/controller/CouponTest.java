package com.imooc.controller;


import com.google.common.collect.Lists;
import com.imooc.model.MiaoshaUser;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class CouponTest {


    /**
     * 10
     * 优惠券提供星选接口           订单提交后 锁定券
     * // 使用参数 openId  orderNumber coupons
     * <p>
     * orderLockCoupon
     */
    @Test
    public void testLockByOrder() {
        MiaoshaUser  miaoshaUser  = new MiaoshaUser();
        List<MiaoshaUser> query = new ArrayList<MiaoshaUser>();
        MiaoshaUser user = query.stream().filter(e -> e.getHead() != null).findAny().orElse(null);
        miaoshaUser.setDiscount(BigDecimal.ZERO.add(user==null?new BigDecimal(1.356):new BigDecimal(1)).setScale(2,BigDecimal.ROUND_HALF_DOWN));
        miaoshaUser.setId( Long.parseLong(String.valueOf(101)));
        System.out.println(miaoshaUser.getId());
    }
}
