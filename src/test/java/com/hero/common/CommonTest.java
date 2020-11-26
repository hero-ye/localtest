package com.hero.common;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 *
 * </p>
 *
 * @Author yejx
 * @Date 2020/5/16
 */
//@SpringBootTest
//@RunWith(SpringRunner.class)
public class CommonTest {

    @Test
    public void test01(){
        Map<String, Object> param = new HashMap<>();
        param.put("contactId", "20200516182700");
        param.put("recordFile", "Q:/2/0/20200510/1748/2209130.V3");
        param.put("locationId", "");
        System.out.println(param);
    }

    @Test
    public void currentTime(){
        System.out.println("当前时间：" + System.currentTimeMillis());
    }

}
