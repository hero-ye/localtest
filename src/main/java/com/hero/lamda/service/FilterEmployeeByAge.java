package com.hero.lamda.service;

import com.hero.lamda.entity.Employee;

/**
 * @Description 根据年龄过滤员工
 * @Author yejx
 * @Date 2019/12/29
 */
public class FilterEmployeeByAge implements MyPredicateService<Employee> {
    @Override
    public boolean test(Employee employee) {
        return employee.getAge() >= 35;
    }
}
