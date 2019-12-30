package com.hero.lamda.service;

import com.hero.lamda.entity.Employee;

/**
 * @Description 根据工资过滤员工
 * @Author yejx
 * @Date 2019/12/29
 */
public class FilterEmployeeBySalary implements MyPredicateService<Employee> {
    @Override
    public boolean test(Employee employee) {
        return employee.getSalary() >= 5000;
    }
}
