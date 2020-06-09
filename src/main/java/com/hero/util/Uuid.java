package com.hero.util;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.Test;

/**
 * 生成32位字母+数字id
 * @author yejx
 * @date 2020/6/7
 */
class Uuid {

    @Test
    void generateId(){
        for (int i = 1; i < 30; i++) {
            System.out.println(RandomStringUtils.randomNumeric(32));
        }
    }
}
