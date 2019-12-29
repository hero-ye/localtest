package com.hero.entity;

import lombok.Data;

/**
 * @Description
 * @Author yejx
 * @Date 2019/12/29
 */
@Data
public class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee() {
    }

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
}
