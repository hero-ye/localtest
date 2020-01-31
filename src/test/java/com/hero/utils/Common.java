package com.hero.utils;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Random;

/**
 * @Description
 * @Author yejx
 * @Date 2020/1/1
 */
@SpringBootTest
public class Common {

    /**
     * 生成32位主键ID
     */
    @Test
    public void uuidPrimaryKey() {
        for (int i = 0; i < 20; i++) {
            String randomNumeric = RandomStringUtils.randomNumeric(32);
            System.out.println(randomNumeric);
        }
    }

    /**
     * 1、生成18岁到60岁的随机年龄   [18, 60)  不包含60岁
     *  new Random().nextInt(42) + 18;
     *
     * 2、生成18岁到60岁的随机年龄 [18, 60]    包含60岁
     *  new Random().nextInt(43) + 18;
     *
     * 3、生成-5分到20分的随机成绩 [-5, 20)    不含20分
     *  new Random().nextInt(25) - 5;
     *
     * 4、生成-5分到20的的随机成绩 [-5, 20]    包含20分
     *  new Random().nextInt(26) - 5;
     *
     */
    @Test
    public void uuidAge() {
        for (int i = 0; i < 10; i++) {
            int age = new Random().nextInt(43) + 18;
            System.out.println(age);
        }
    }

}
