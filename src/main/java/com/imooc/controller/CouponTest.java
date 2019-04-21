package com.imooc.controller;

        import com.imooc.model.MiaoshaUser;
        import org.junit.jupiter.api.Test;

        import java.math.BigDecimal;
        import java.util.ArrayList;
        import java.util.List;


public class CouponTest {

    @Test
    private void testLockByOrder() {
        MiaoshaUser miaoshaUser = new MiaoshaUser();
        List<MiaoshaUser> query = new ArrayList<MiaoshaUser>();
        MiaoshaUser user = query.stream().filter(e -> e.getHead() != null).findAny().orElse(null);
        miaoshaUser.setDiscount(BigDecimal.ZERO.add(user == null ? new BigDecimal(1.356) : new BigDecimal(1)).setScale(2, BigDecimal.ROUND_HALF_DOWN));
        miaoshaUser.setId(Long.parseLong(String.valueOf(101)));
        System.out.println(miaoshaUser.getId());
    }

    @Test
    public void test2() {
        MiaoshaUser miaoshaUser = new MiaoshaUser();
        miaoshaUser.setHead("head");
        if (miaoshaUser.getHead() != null && miaoshaUser.getHead().equals("head")) {
            System.out.println(miaoshaUser.getHead());
        } else {
            System.out.println("not null");
        }
    }


}
