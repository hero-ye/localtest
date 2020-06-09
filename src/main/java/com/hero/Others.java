package com.hero.util;

import org.junit.Test;

import java.math.BigDecimal;

/**
 * 随意测试
 *
 * @author yejx
 * @date 2020/6/7
 */
public class Others {

    @Test
    public void test01() {
        int a = 1;
        int b = 6;
        double result = new BigDecimal((float) a * 100 / b).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
        System.out.println("计算结果：" + result + "%");
    }
}
