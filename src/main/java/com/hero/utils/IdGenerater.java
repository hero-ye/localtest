package com.hero.utils;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.Test;

import java.util.UUID;

/**
 * 生成32位字母+数字id
 * @author yejx
 * @date 2020/6/7
 */
class IdGenerater {

    /**
     * 生成32位主键ID-数字
     */
    @Test
    void generateId(){
        for (int i = 1; i < 35; i++) {
            System.out.println(RandomStringUtils.randomNumeric(32));
        }
    }

    @Test
    void generateId2(){
        long now = System.currentTimeMillis();
        for (int i = 0; i < 35; i++) {
            System.out.println(now);
            now++;
        }
    }

    /**
     * 生成32位主键ID-数字字母组合
     */
    @Test
    void generateId3(){
        UUID uuid = UUID.randomUUID();
        String id = uuid.toString().replace("-", "");
        System.out.println(id);
    }
}
