package com.hero.utils;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Description
 * @Author yejx
 * @Date 2020/1/1
 */
@SpringBootTest
public class Common {

    @Test
    public void uuid() {
        for (int i = 0; i < 2; i++) {
            String random = RandomStringUtils.randomNumeric(32);
            System.out.println(random);
        }
    }

}
