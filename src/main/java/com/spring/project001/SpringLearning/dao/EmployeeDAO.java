package com.spring.project001.SpringLearning.dao;

import com.spring.project001.SpringLearning.model.Employee;

import java.util.List;

public interface EmployeeDAO
{
    List<Employee> getList();
    Employee get(int id);
    void add(Employee employee);
    void delete(int id);
}
